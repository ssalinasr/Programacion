#-------------------------------------------------------------------------------
# Name:        narboles
# Purpose:     Nota! Duh!
#
# Author:      STINKY CHEESE
#
# Created:     WR/AL/2006
# Copyright:   (k) Ka-Tet Co. 1999
# Licence:     <uranus>
#-------------------------------------------------------------------------------

class Nodo:
    def __init__(self, info: str):
        '''**metodo que crea un nodo raiz
        Arguments:
            info (str): informacion o raiz del nodo
        '''
        self.__info = info
        self.__ramIzq, self.__ramDer = None, []
        self.__menss = f"Nodo {{ info }} inicializado-"

    def getMenss(self) -> str: return self.__menss


    def getInfo(self) -> str:
        '''**metodo que retorna la raiz del nodo
        Return:
            str: raiz del nodo
        '''
        return self.__info

    def getRamIzq(self)->None:
        '''**metodo que retorna la rama izquierda del nodo
        Return:
            Nodo: rama izquierda del nodo
        '''
        return self.__ramIzq

    def getRamDer(self)->list:
        '''**metodo que retorna la rama derecha del nodo
        Return:
            Nodo: rama derecha del nodo
        '''
        return self.__ramDer

    def getRamN(self, n: int):
        '''**metodo que retorna la rama n del nodo
        Return:
            Nodo: rama derecha del nodo
        '''
        if n == 0:
            return self.getRamIzq()
        try: return self.getRamDer()[n-1]
        except: return -1

    def getN(self)->int:
        return len(self.getRamDer()) + 1 if self.getRamIzq() else 0

    def setRamIzq(self, direcc: None):
        '''**metodo que asigna un nodo a la rama izquierda
        Arguments:
            direcc (Nodo): nodo que sera la nueva rama izquierda
        '''
        self.__ramIzq= direcc

    def setRamDer(self, direcc: None):
        '''**metodo que asigna un nodo a la rama derecha
        Arguments:
            direcc (Nodo): nodo que sera la nueva rama derecha
        '''
        self.__ramDer = direcc

    def setRamN(self, n: int, direcc: None):
        '''**metodo que asigna un nodo a la rama n
        Arguments:
            n (int): numero de Nodo
            direcc (Nodo): nodo que sera la nueva rama derecha
        '''
        if n == 0:
            self.__ramIzq= direcc
        try: self.__ramDer[n-1] = direcc
        except: return direcc

    def getRam(self, info: str, justInd = True)->None:
        j = 0
        for i in [self.getRamIzq()]+self.getRamDer():
            if i == None:
                return -1
            elif i.getInfo() == info: return j if justInd else i
            j+=1

    def addRam(self, direcc: None):
        if direcc == None: return
        if self.getRamIzq() == None:
            self.setRamIzq(direcc)
        elif self.getRamIzq().getInfo() < direcc.getInfo():
            self.getRamDer().append(None)
            for i in range(len(self.getRamDer())):
                if self.getRamDer()[i] == None:
                    self.getRamDer()[i] =direcc
                    break
                elif self.getRamDer()[i].getInfo() > direcc.getInfo():
                    self.getRamDer().insert(i,direcc)
                    self.getRamDer().pop()
                    break
        elif self.getRamIzq().getInfo() > direcc.getInfo():
            t = self.getRamIzq()
            self.setRamIzq(direcc)
            self.addRam(t)
        else:
            self.__menss="Llave repetida"
            print("repetida")

class Arbol:
    __raiz = None

    def __init__(self):
        self.__raiz = Nodo("?")
        self.getRaiz().addRam(Nodo("}"))
        self.resetRes()
        self.__menss = "Arbol inicializado-"

    def getMenss(self) -> str: return self.__menss

    def getRaiz(self) -> Nodo:
        return self.__raiz

    def getResp(self) ->list:
        return self.__resp

    def resetRes(self):
        self.__resp=[]

    def resetArbol(self):
        self.__init__()

    def preorden(self, raiz: Nodo):
        if raiz != None:
            #print(str(raiz.getInfo()))
            #si estas viendo este mensaje, Raul no hizo su unico maldito trabajo
            self.__resp.append(raiz)
            self.preorden(raiz.getRamIzq())
            for i in raiz.getRamDer(): self.preorden(i)

    def inorden(self, raiz: Nodo):
        if raiz != None:
            self.inorden(raiz.getRamIzq())
            #print(str(raiz.getInfo()))
            self.__resp.append(raiz)
            for i in raiz.getRamDer(): self.inorden(i)

    def posorden(self, raiz: Nodo):
        if raiz != None:
            self.posorden(raiz.getRamIzq())
            for i in raiz.getRamDer(): self.posorden(i)
            self.__resp.append(raiz)
            #print(str(raiz.getInfo()))

    def orden(self, o: str = "=", respI="str"):
        self.resetRes()
        if o == ">":
            self.posorden(self.getRaiz())
        elif o == "<":
            self.preorden(self.getRaiz())
        else:
            self.inorden(self.getRaiz())
        if respI == "str":
            self.__resp = [i.getInfo() for i in self.getResp()]

    def __str__(self):
        for i in self.getResp() if self.getResp() != None else []: print(i)
        return ""

    def getNodoSince(self, way: str, piv: Nodo)->Nodo:
        try: f = piv.getRam(way[0],None)
        except: f = None
        finally: return f if f == None or len(way) == 1 else self.getNodoSince(way[1:],f)

    def getNodo(self, way: str)->Nodo:
        return self.getNodoSince(way,self.getRaiz())

    def insertar(self, entry: str):
        n = self.getRaiz()
        while isinstance(n, Nodo) and entry:
            m = n
            n = n.getRam(entry[0], None)
            entry = entry[1:] if isinstance(n, Nodo) else entry
        #print(m.getInfo(), entry)
        for i in entry:
            m.addRam(Nodo(i))
            m = m.getRam(i,None)
        #print(m.getInfo())
        self.__menss = "Termino repetido" if not entry else f"Termino {m.getInfo()[1:]} insertado"

    def borrarNodo(self, nodo):
        print(self.getNodo(nodo))

    def listar(self):
        pass


def main():
    a = Arbol()
    a.insertar([i for i in "dos"] + ["}Two"])
    a.insertar([i for i in "tr"] + ["}"])
    a.insertar([i for i in "u"] + ["}You"])
    a.insertar([i for i in "tres"] + ["}Three"])
    a.insertar([i for i in "do"] + ["}C"])
    a.insertar([i for i in "uno"] + ["}One"])
    a.orden()
    print(a.getResp())
    t = a.getNodo("dos")
    print(t.getRamN(t.getN()-1).getInfo())


if __name__ == '__main__':
    main()


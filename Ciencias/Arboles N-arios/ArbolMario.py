from narboles import *
try: import tkinter as tk
except: import Tkinter as tk
import pickle

arbol = Arbol()

def messUsu(mess: str= ""):
    msgs.set(mess)
    return

def resetCanvas():
    canvas.configure(yscrollcommand=scrlly.set)
    canvas.configure(xscrollcommand=scrllx.set)
    canvas.configure(scrollregion=canvas.bbox("all"))

def addTs():
    Trms = str(terms.get())
    if Trms == "": return messUsu("-Lista de terminos vacia")
    for i in Trms.split(";"):
        try:arbol.insertar([str(j) for j in i.split(",")[0]] + ["}\n" + i.split(",")[1]])
        except:dibujarArbol();return messUsu("-Lista de terminos erronea")
    dibujarArbol()
    return messUsu(arbol.getMenss())

def rem():
    Trms = str(terms.get())
    print(arbol.borrarNodo(Trms))


def guardarArbol():
    state = open("arbolNario.txt", "wb")
    pickle.dump(arbol, state)
    state.close()

def cargarArbol():
    while True:
        try:
            stated = open("arbolNario.txt", "rb")
            arbol = pickle.load(stated)
            stated.close()
            break
        except:
            arbol = guardarArbol()
    return arbol

def imprimirArbol():
    msgs.set("")
    marco.clipboard_clear()
    for nod in arbol.getResp():
        msgs.set(msgs.get() + nod.replace("\n","") + ", ")
    marco.clipboard_append(msgs.get().replace(", ", ""))
    msgs.set(msgs.get()[:-2])
    return

def inorden():
    arbol.orden()
    imprimirArbol()
    msgs.set("Inorden: " + msgs.get())

def preorden():
    arbol.orden("<")
    imprimirArbol()
    msgs.set("Preorden: " + msgs.get())

def posorden():
    arbol.orden(">")
    imprimirArbol()
    msgs.set("Posorden: " + msgs.get())

def dibujarNodo(piv: Nodo, x, y, limx) -> int:
    for i in range(piv.getN()):
        #actx = x + 50*(i if limx > x else i+ int(limx/50)) + (limx if limx > x else 0)
        actx = x + 15*limx
        #print(actx, piv.getInfo())
        sep = canvas.create_line((actx-(20*(i) if i>0 else -10), (y+10 if i>0 else y+20),(actx if i>0 else actx+10), (y + 30 if i>0 else y+30)), fill="red")
        cr = canvas.create_oval((actx, y + 30, actx + 20, y + 50), fill="orange")
        cr = canvas.create_oval((actx+2, y + 32, actx + 18, y + 48), fill="green")
        lb = canvas.create_text(actx+10, y + 40, text = piv.getRamN(i).getInfo(), fill="white")
        limx = dibujarNodo(piv.getRamN(i), x,  y + 30, limx)
    return (limx + piv.getN()) if piv.getN() > 1 else limx+1

def resetArboles():
    arbol.resetArbol()
    dibujarArbol()

def dibujarArbol():
    #imprimirMLs()
    canvas.delete("all")
    cr = canvas.create_oval((0, 0, 0, 0), fill="#202020", outline="")
    
    if arbol.getRaiz():
        cr = canvas.create_oval((10, 10, 30, 30), fill="orange")
        cr = canvas.create_oval((12, 12, 28, 28), fill="green")
        lb = canvas.create_text(20, 19, text = arbol.getRaiz().getInfo(), fill="white")
        dibujarNodo(arbol.getRaiz(), 10, 10, 0)
        lb = canvas.create_text(675, 24, text = str(0), fill="white")
        lb = canvas.create_text(675, 54, text = str(1), fill="white")
        lb = canvas.create_text(675, 84, text = str(2), fill="white")
        lb = canvas.create_text(675, 114, text = str(3), fill="white")
        lb = canvas.create_text(675, 144, text = str(4), fill="white")
        lb = canvas.create_text(675, 174, text = str(5), fill="white")
        lb = canvas.create_text(675, 204, text = str(6), fill="white")
        lb = canvas.create_text(675, 234, text = str(7), fill="white")
        lb = canvas.create_text(675, 264, text = str(8), fill="white")
        lb = canvas.create_text(675, 294, text = str(9), fill="white")
        lb = canvas.create_text(675, 324, text = str(10), fill="white")
            
    resetCanvas()
    guardarArbol()
    terms.focus()

def translateTs():
    Trms = str(terms.get())
    if Trms == "": return messUsu("-Lista de terminos vacia")
    Trns = ""
    for i in Trms.split(";"):
        try:
            t = arbol.getNodo(i)
            if (t.getRamN(t.getN()-1).getInfo()[0] == "}"):
                Trns+=t.getRamN(t.getN()-1).getInfo()[2:] + ","
            else:
                Trns+=f"No hay traduccion para {i},"
        except:
            Trns+=f"No hay traduccion para {i},"
            dibujarArbol();return messUsu("-Lista de terminos erronea")
    return messUsu(Trns[:-1] if Trns != "" else "Ingrese terminos")

def listarTs():
    arbol.orden("<")
    j=0
    Trns = ""
    for i in arbol.getResp():
        if i[0] != "}" or i=="}\n":
            arbol.getResp().pop(j)
        else:
            Trns+=i[2:] + ","
        j+=1
    return messUsu(Trns[:] if Trns != "" else "Ingrese terminos")

#inicializacion
marco = tk.Tk()
marco.geometry("+%d+%d" % (25, 25))
marco.title('Arboles Narios')

canvas = tk.Canvas(marco, width=700, height=500, bg="#202020")
canvas.grid(row=0, column=0, columnspan=5)
scrlly = tk.Scrollbar(marco, orient="vertical", command=canvas.yview)
scrlly.grid(row=0, column=6, sticky="ns")
scrllx = tk.Scrollbar(marco, orient="horizontal", command=canvas.xview)
scrllx.grid(row=1, column=0, columnspan=5, sticky="we")
resetCanvas()

msgs = tk.StringVar()
msgs.set(arbol.getMenss())
mnsgs = tk.Label(marco, textvariable = msgs, bg="#202020", fg="white").grid(row=2, column=0, columnspan=3)

btn=tk.Button(marco, text='Dibujar el Arbol K-ario', command=dibujarArbol).grid(row=2, column=3)
btn=tk.Button(marco, text='Reiniciar Arbol M-ario', command=resetArboles).grid(row=2, column=4)

tk.Label(marco, text="Ingrese el listado de terminos",bg="#202020",fg="white").grid(row=3, column=0)
terms = tk.Entry(marco)
terms.grid(row=3, column=1, columnspan=3, sticky="WE")
btn=tk.Button(marco, text='Agregar terminos', command=addTs).grid(row=3, column=4)
btn=tk.Button(marco, text='Borrar terminos', command=rem).grid(row=4, column=4)

btn=tk.Button(marco, text='Ver en Inorden', command=inorden).grid(row=4, column=0)
btn=tk.Button(marco, text='Ver en Preorden', command=preorden).grid(row=4, column=1)
btn=tk.Button(marco, text='Ver en Posorden', command=posorden).grid(row=4, column=2)

btn=tk.Button(marco, text='Buscar traduccion', command=translateTs).grid(row=5, column=1)
btn=tk.Button(marco, text='Listar terminos', command=listarTs).grid(row=5, column=2)

arbol = cargarArbol()
dibujarArbol()

def main():
    marco.configure(background='#202020')
    marco.mainloop()
    pass

if __name__ == '__main__':
    main()

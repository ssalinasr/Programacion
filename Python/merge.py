from random import randint


def dividir(lista):
    if(len(lista) < 2):
        return lista
    else:
        mitad = len(lista)//2
        izquierda = dividir(lista[:mitad])
        derecha = dividir(lista[mitad:])
        return algmerge(derecha,izquierda)

def algmerge(izq, der):
    i=0
    j=0
    ordenada=[]

    while(i<len(izq) and j<len(der)):
        if(izq[i] < der[j]):
            ordenada.append(izq[i])
            i+=1
        else:
            ordenada.append(der[j])
            j+=1
            
    ordenada += izq[i:]
    ordenada += der[j:]
       
    return ordenada


k=0
while(k<2):
    tam = randint(5,10)
    lista = [None] * tam
    for i in range(tam):
        lista[i] = randint(0,15)
    print(dividir(lista))
    k+=1    


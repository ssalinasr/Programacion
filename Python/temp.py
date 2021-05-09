# -*- coding: utf-8 -*-

from random import randint

rand = randint(0,99)

att = 0
puntaje = 100

while att < 10:
    att += 1
    print("ingrese un valor:")
    val = int(input())
    if(rand > val):
        print("Su valor es menor al de la máquina... ")
        puntaje-=10
    elif (rand < val):
        print("Su valor es mayor al de la máquina... ")
        puntaje-=10
    else:
        print("Ha ganado...")
        print("La cantidad de intentos fue: "+str(att))
        print("Su puntaje es: "+str(puntaje))
        break

else:
    print("Ha excedido el número de intentos permitidos, ha perdido... F")
    print("Su puntaje es: " +str(puntaje))
    
    
        
    





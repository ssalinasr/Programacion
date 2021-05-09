#-------------------------------------------------------------------------------
# Name:        módulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     08/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from random import randrange
usuario=0
maq=0
maq=randrange(0,5)
print("posibles valores: 0=piedra, 1=papel, 2=tijera, 3=lagarto, 4=spock")
usuario=int(input("ingrese valor"))
if usuario>4:
      print("valor invalido")
else:
    if usuario==0:
      print("usuario:piedra")
    if usuario==1:
      print("usuario:papel")
    if usuario==2:
     print("usuario:tijera")
    if usuario==3:
     print("usuario:lagarto")
    if usuario==4:
     print("usuario:spock")
    if maq==0:
     print("maquina:piedra")
    if maq==1:
     print("maquina:papel")
    if maq==2:
     print("maquina:tijera")
    if maq==3:
     print("maquina:lagarto")
    if maq==4:
     print("maquina:spock")

    if usuario==maq:
     print("empate")
    if usuario==0 and maq==1:
     print("gana la maquina")
    if usuario==1 and maq==0:
     print("gana el usuario")
    if usuario==1 and maq==2:
     print("gana la maquina")
    if usuario==2 and maq==1:
     print("gana la usuario")
    if usuario==0 and maq==2:
     print("gana el usuario")
    if usuario==2 and maq==0:
     print("gana la maquina")
    if usuario==0 and maq==3:
     print("gana el usuario")
    if usuario==3 and maq==0:
     print("gana la maquina")
    if usuario==3 and maq==4:
     print("gana el usuario")
    if usuario==4 and maq==3:
     print("gana la maquina")
    if usuario==4 and maq==2:
     print("gana el usuario")
    if usuario==2 and maq==4:
     print("gana la maquina")
    if usuario==2 and maq==3:
     print("gana el usuario")
    if usuario==3 and maq==2:
     print("gana la maquina")
    if usuario==3 and maq==1:
     print("gana el usuario")
    if usuario==1 and maq==3:
     print("gana la maquina")
    if usuario==4 and maq==1:
     print("gana la maquina")
    if usuario==1 and maq==4:
     print("gana el usuario")
    if usuario==4 and maq==0:
     print("gana el usuario")
    if usuario==0 and maq==4:
     print("gana la maquina")
    if usuario>4:
     print("no hay ganador")































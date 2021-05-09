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
i=0
dos=0
tres=0
cuatro=0
cinco=0
seis=0
siete=0
ocho=0
nueve=0
diez=0
once=0
doce=0

from random import randrange
for i in range (0,1000,1):
    al=randrange(1,7)
    al2=randrange(1,7)
    al3=al+al2
    if al3==2:
        dos=dos+1
    if al3==3:
        tres=tres+1
    if al==4:
        cuatro=cuatro+1
    if al3==5:
        cinco=cinco+1
    if al3==6:
        seis=seis+1
    if al3==7:
        siete=siete+1
    if al3==8:
        ocho=ocho+1
    if al3==9:
        nueve=nueve+1
    if al3==10:
        diez=diez+1
    if al3==11:
        once=once+1
    if al3==12:
        doce=doce+1

print("2:",dos)
print("3:",tres)
print("4:",cuatro)
print("5:",cinco)
print("6:",seis)
print("7:",siete)
print("8:",ocho)
print("9:",nueve)
print("10:",diez)
print("11:",once)
print("12:",doce)

maximo=max(dos, tres, cuatro, cinco, seis,siete, ocho, nueve, diez, once, doce)

if maximo==dos:
    print("2 es el mayor valor obtenido")
if maximo==tres:
    print("3 es el mayor valor obtenido")
if maximo==cuatro:
    print("4 es el mayor valor obtenido")
if maximo==cinco:
    print("5 es el mayor valor obtenido")
if maximo==seis:
    print("6 es el mayor valor obtenido")
if maximo==siete:
    print("7 es el mayor valor obtenido")
if maximo==ocho:
    print("8 es el mayor valor obtenido")
if maximo==nueve:
    print("9 es el mayor valor obtenido")
if maximo==diez:
    print("10 es el mayor valor obtenido")
if maximo==once:
    print("11 es el mayor valor obtenido")
if maximo==doce:
    print("12 es el mayor valor obtenido")











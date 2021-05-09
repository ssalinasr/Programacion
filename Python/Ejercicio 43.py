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
x=int(input("ingrese coordenada x"))
y=int(input("ingrese coordenada y"))
h=int(input("ingrese coordenada del centro h"))
k=int(input("ingrese coordenada del centro k"))
r=int(input("ingrese radio r"))


if h==0 and k==0:
    egc=(x)**2+(y)**2
    if egc==(r)**2:
        print ("el punto pertenece a la circunferencia")
    else:
        print("el punto no pertenece a la circunferencia")

if h!=0 and k!=0:
    egc=(x-h)**2+(y-k)**2
    if egc==(r)**2:
        print ("el punto pertenece a la circunferencia")
    else:
        print("el punto no pertenece a la circunferencia")












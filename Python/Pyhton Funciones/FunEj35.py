#-------------------------------------------------------------------------------
# Name:        módulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     17/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def suma_intervalos (val1,val2):
    suma=0
    for i in range (val1,val2+1):
     suma=suma+i
    return (suma)

x=int(input("valor 1"))
y=int(input("valor 2"))
print (suma_intervalos (x,y))

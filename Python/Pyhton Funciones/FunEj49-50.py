#-------------------------------------------------------------------------------
# Name:        módulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     18/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def enteros_positivos(x):
    if x%2==0:
        return (x/2)
    if x%2!=0:
        return(1+(x**3))


x=-1
while x!=0:
    x=int(input())
    print(enteros_positivos(x))







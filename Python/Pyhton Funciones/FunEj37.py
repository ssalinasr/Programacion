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

def numero_perfecto(n):
    for i in range(2,1000):
        b=0
        for j in range (1,(i//2)+1):
            if i%j==0:
                b=b+j
    if b==i:
        return(1)
    else:
        return(0)




n=int(input("ingrese valor"))
print (numero_perfecto(n))

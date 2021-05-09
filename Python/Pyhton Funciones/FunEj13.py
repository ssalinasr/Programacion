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

def volumen_esfera (x):
    if x<0:
        x=x*-1
    else:
     volumen=(4/3)*(3.1416)*(x**3)
     return (volumen)

x=int(input("ingrese radio"))
print(volumen_esfera(x))


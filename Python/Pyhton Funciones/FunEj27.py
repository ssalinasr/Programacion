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

def altura_torre_sombra (ang,long):
    import math
    if ang>90:
        return (-1)
    else:
       ang=(ang*3.1416)/180
       h=long*math.tan(ang)
       return(math.floor(h))

long=float(input("ingrese longitud de la sombra"))
ang=float(input("ingrese ángulo"))
print(altura_torre_sombra(ang,long))

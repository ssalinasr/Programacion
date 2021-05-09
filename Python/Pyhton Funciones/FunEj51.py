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

import math
def diferencia_flotante (dec1,dec2):
    ent1=math.floor(dec1)
    ent2=math.floor(dec2)
    dec1=dec1-ent1
    dec2=dec2-ent2
    return (abs(dec1-dec2))

a=float(input("decimal 1"))
b=float(input("decimal 2"))
print(diferencia_flotante(a,b))


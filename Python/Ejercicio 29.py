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

import math
long=float(input("ingrese longitud de la sombra"))
ang=float(input("ingrese ángulo"))

if ang>90:
    print("angulo no valido")
else:
    ang=(ang*3.1416)/180
    h=long*math.tan(ang)
    print("la altura de la torre corresponde a:")
    print(math.floor(h))




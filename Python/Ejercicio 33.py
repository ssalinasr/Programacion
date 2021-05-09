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
hh=int(input("hh"))
mm=int(input("mm"))
ss=int(input("ss"))
hh2=int(input("hh2"))
mm2=int(input("mm2"))
ss2=int(input("ss2"))

if hh>=24 or hh<0 or mm>60 or mm<0 or ss>60 or ss<0 or hh2>=24 or hh2<0 or mm2>60 or mm2<0 or ss2>60 or ss2<0:
    print("alguno de los valores ingresados no es valido")
else:
    difh=hh2-hh
    difm=mm2-mm
    difs=ss2-ss
    print("diferencia horas")
    print (math.fabs(difh))
    print("diferencia minutos")
    print (math.fabs(difm))
    print("diferencia segundos")
    print (math.fabs(difs))












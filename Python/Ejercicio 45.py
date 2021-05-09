#-------------------------------------------------------------------------------
# Name:        módulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     11/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

import math

alturarec=0
acumaltura=0

x1=float(input("coordenada x1:"))
y1=float(input("coordenada y1:"))

x2=float(input("coordenada x2:"))
y2=float(input("coordenada y2:"))

dist=math.sqrt((x2-x1)**2+(y2-y1)**2)

while alturarec<dist:
    alturarec=dist*0.001
    acumaltura=acumaltura+alturarec

if alturarec>=dist:
    print("el area aproximada es:")
    print(acumaltura)






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
x1=float(input("x1:"))
y1=float(input("y1:"))
z1=float(input("z1:"))
x2=float(input("x2:"))
y2=float(input("y2:"))
z2=float(input("z2:"))


rad=(((math.sqrt((x2-x1)**2+(y2-y1)**2)+(z2-z1)**2/(3.1416*2))))

vol=(4/3)*3.1416*(rad**3)

print("el volumen de la esfera es:")
print(vol)

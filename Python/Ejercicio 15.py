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

x1=float(input("x1:"))
x2=float(input("x2:"))
y1=float(input("y1:"))
y2=float(input("y2:"))

if y2==y1:
    print("posible division por cero")
else:
    pend=(x2-x1)/(y2-y1)
    print("pendiente:")
    print(pend)


#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Estudiantes
#
# Created:     19/04/2018
# Copyright:   (c) Estudiantes 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def area_aproximada(x1,y1,x2,y2):
    acum=0
    pend=(y2-y1)/(x2-x1)
    if x2>x1:
     for x in range (x1,x2,1):
      ecrec=abs((pend*0.01)-(x1+y1))
      acum=acum+ecrec
     if x1>x2:
      for x in range (x2,x1,1):
       ecrec=abs((pend*0.01)-(x1+y1))
       acum=acum+ecrec
    return (acum)

x1=int(input("x1"))
y1=int(input("y1"))
x2=int(input("x2"))
y2=int(input("y2"))
print(area_aproximada(x1,y1,x2,y2))





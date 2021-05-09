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
import math
def cubo_perfecto(a):
    b=a**(1/3)
    c=math.ceil(b)**3
    if a==c:
        return(bool(1))
    else:
        return(bool(0))

a=int(input("valor"))
print(cubo_perfecto(a))
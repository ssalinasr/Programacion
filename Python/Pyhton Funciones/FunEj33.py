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

def imc (peso,estatura):
    imcorp=peso/(estatura**2)
    return (imcorp)

peso=float(input("peso(kg)"))
estatura=float(input("estatura(m)"))
print(imc(peso,estatura))
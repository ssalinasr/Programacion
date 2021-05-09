#-------------------------------------------------------------------------------
# Name:        mÃ³dulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     08/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

peso=float(input("peso (kg)"))
altura=float(input("altura (m)"))

if peso<=0:
    print("valor no valido")
else:
    if altura<=0:
        print("valor no valido")
    else:
        imc=peso/(altura**2)
        print("el IMC es:")
        print(imc)






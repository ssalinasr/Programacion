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

r1=int(input("valor resistencia 1"))
r2=int(input("valor resistencia 2"))
r3=int(input("valor resistencia 3"))

if r1<=0 or r2<=0 or r3<=0:
    print("alguno de los valores no es valido")
else:
    rtot=(1/r1)+(1/r2)+(1/r3)
    print("el valor total de resistencia es:")
    print(rtot)




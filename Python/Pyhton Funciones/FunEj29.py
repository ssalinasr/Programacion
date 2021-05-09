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

def resistencia_total (r1,r2,r3):
    rtot=(1/r1)+(1/r2)+(1/r3)
    return(rtot)

r1=int(input("valor resistencia 1"))
r2=int(input("valor resistencia 2"))
r3=int(input("valor resistencia 3"))
print(resistencia_total(r1,r2,r3))

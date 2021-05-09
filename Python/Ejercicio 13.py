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

rad1=float(input("radio esfera 1"))
rad2=float(input("radio esfera 2"))

radtot=(rad2**3)-(rad1**3)
volcsq=(4/3)*radtot

print("el volumen comprendido entre las dos esferas es:")
print(volcsq)
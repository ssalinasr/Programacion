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
suma=0
val1=int(input("ingresar primer valor"))
val2=int(input("ingresar segundo valor"))

while val2<val1:
    print("el primer valor es mayor al segundo, ingrese de nuevo los valores")
    val1=int(input("ingrese de nuevo"))
    val2=int(input("ingrese de nuevo"))

for i in range (val1,val2+1):
    suma=suma+i

print("suma valores")
print(suma)








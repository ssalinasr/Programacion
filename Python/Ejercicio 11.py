#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     08/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------
a=1
b=0
suma=0
promedio=0
n=int(input("ingrese valor"))
if n<=0:
  print("valor no valido")
else:
   for i in range (n):
    a,b= b,a+b
    suma=(suma+b)
    promedio=(suma/n)


print ("el promedio de los primeros",n, "numeros de fibonacci es:")
print (promedio)






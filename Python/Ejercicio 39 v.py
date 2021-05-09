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

val1=int(input("ingrese valor 1"))
val2=int(input("ingrese valor 2"))

cant=0
cant2=0

for i in range (val1,val2):
    if val1%i==0:
        cant=cant+i
    if cant-i==i:
        cant2=cant2+1

print("existen ",cant," numeros perfectos entre ",val1," y ",val2)


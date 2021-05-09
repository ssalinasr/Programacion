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


def sumatoria_dados (n):
 from random import randrange
 acumulado=0
 for i in range (0,n,1):
   al=randrange(1,7)
   al2=randrange(1,7)
   sumatoria=al+al2
   acumulado=acumulado+sumatoria
 return (acumulado)

n=int(input("ingrese valor"))
print(sumatoria_dados(n))

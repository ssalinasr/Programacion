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
def fibonacci (n):
 a=1
 b=0
 if n<=1:
     return (n)
 else:
    return fibonacci(n-1)+fibonacci(n-2)

n=int(input("ingrese valor"))
print(fibonacci(n))
#-------------------------------------------------------------------------------
# Name:        módulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     18/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def numero_flotante(valf,n):
    valres=valf*(10**n)
    modul=valres%10
    return (modul)

valf=float(input("numero flotante"))
n=int(input("decimal a recuperar"))
print(numero_flotante(valf,n))
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

def diferencia_horas(hh1,mm1,ss1,hh2,mm2,ss2):
    hh1=hh1*3600
    hh2=hh2*3600
    mm1=mm1*60
    mm2=mm2*60
    acumsegundos=hh1+mm1+ss1
    acumsegundos2=hh2+mm2+ss2
    diferencia=abs(acumsegundos2-acumsegundos)
    return (diferencia)

hh1=int(input("horas 1"))
mm1=int(input("minutos 1"))
ss1=int(input("segundos 1"))
hh2=int(input("horas 2"))
mm2=int(input("minutos 2"))
ss2=int(input("segundos 2"))
print(diferencia_horas(hh1,mm1,ss1,hh2,mm2,ss2))

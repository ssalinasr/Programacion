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

import math

def bisiesto (anio):
    if (anio%4==0) and (anio%100!=0) or (anio%400==0):
        return(bool(1))
    else:
        return(bool(0))

def fecha_int(dia,mes,anio):
    anio=anio*10000
    mes=mes*100
    dia=dia
    return(anio+mes+dia)

def fecha_valida(dia,mes,anio):
    if dia>31 or dia<1:
        return ((bool(0)))
    if mes>12 or mes<1:
        return(bool(0))
    if anio<0:
        return (bool(0))
    if (mes==4 or mes==6 or mes==9 or mes==11)and(dia>30 or dia<1):
        return (bool(0))
    else:
        return (bool(1))
    if (mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12)and(dia>31 or dia<1):
        return (bool(0))
    else:
        return (bool(1))
    if dia>29 and mes==2:
        return(bool(0))
    else:
        if dia==29 and mes==2 and bisiesto(anio):
            return(bool(1))

def format_fecha (dia,mes,anio):
    entero=fecha_int(dia,mes,anio)
    diaconv=entero%100
    mesconv=math.floor((entero%10000)/100)
    anioconv=math.floor(entero/10000)
    return(anioconv,mesconv,diaconv)

def diferencia_dias(dia,mes,anio,dia2,mes2,anio2):
    diaf=1
    mesf=0
    aniof=(2000*365)+1
    acumfechaf=aniof+diaf
    diasanio1=anio*365
    if bisiesto(anio)==bool(1):
        diasanio1=diasanio1+1
    if mes==1:
        diasmes1=0
    if mes==2:
        diasmes1=31
    if mes==3:
        diasmes1=59
    if mes==4:
        diasmes1=90
    if mes==5:
        diasmes1=120
    if mes==6:
        diasmes1=151
    if mes==7:
        diasmes1=181
    if mes==8:
        diasmes1=212
    if mes==9:
        diasmes1=243
    if mes==10:
        diasmes1=273
    if mes==11:
        diasmes1=304
    if mes==12:
        diasmes1=334
    acumfecha1=diasanio1+diasmes1+dia
    diasanio2=anio2*365
    if bisiesto(anio2)==bool(1):
        diasanio2=diasanio2+1
    if mes2==1:
        diasmes2=0
    if mes2==2:
        diasmes2=31
    if mes2==3:
        diasmes2=59
    if mes2==4:
        diasmes2=90
    if mes2==5:
        diasmes2=120
    if mes2==6:
        diasmes2=151
    if mes2==7:
        diasmes2=181
    if mes2==8:
        diasmes2=212
    if mes2==9:
        diasmes2=243
    if mes2==10:
        diasmes2=273
    if mes2==11:
        diasmes2=304
    if mes2==12:
        diasmes2=334
    acumfecha2=diasanio2+diasmes2+dia2
    res1=abs(acumfechaf-acumfecha1)
    res2=abs(acumfechaf-acumfecha2)
    return(abs(res1-res2))

dia=(int(input("dia 1")))
mes=(int(input("mes 1")))
anio=(int(input("anio 1")))

dia2=(int(input("dia 2")))
mes2=(int(input("mes 2")))
anio2=(int(input("anio 2")))

print(bisiesto(anio))
print(fecha_int(dia,mes,anio))
print(fecha_valida(dia,mes,anio))
print(format_fecha(dia,mes,anio))
print(bisiesto(anio2))
print(fecha_int(dia2,mes2,anio2))
print(fecha_valida(dia2,mes2,anio2))
print(format_fecha(dia2,mes2,anio2))
print(diferencia_dias(dia,mes,anio,dia2,mes2,anio2))




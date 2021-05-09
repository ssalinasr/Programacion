#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Estudiantes
#
# Created:     19/04/2018
# Copyright:   (c) Estudiantes 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def conversor_longitudes(valor,medida,medidaconv):
    if medida=="p":
        valorconv=valor*0.0254
    if medida=="k":
        valorconv=valor*1000
    if medida=="d":
        valorconv=valor*0.1
    if medida=="P":
        valorconv=valor*0.3048
    if medida=="y":
        valorconv=valor*0.9144
    if medida=="M":
        valorconv=valor*1609.34
    if medida=="m":
        valorconv=valor

    if medidaconv=="p":
        res=valorconv*39.3701
    if medidaconv=="k":
        res=valorconv*0.001
    if medidaconv=="d":
        res=valorconv*10
    if medidaconv=="P":
        res=valorconv*3.28084
    if medidaconv=="y":
        res=valorconv*1.09361
    if medidaconv=="M":
        res=valorconv*0.000621371
    if medidaconv=="m":
        res=valorconv
    return (valorconv)



a=(int(input("valor")))
b=input("medida valor")
c=input("medida a convertir")
print(conversor_longitudes(a,b,c))






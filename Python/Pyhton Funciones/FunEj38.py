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

def conversor_masa(valor,medida,medidaconv):
    if medida=="l":
        valorconv=valor*0.453592
    if medida=="g":
        valorconv=valor*0.001
    if medida=="o":
        valorconv=valor*0.0283495
    if medida=="a":
        valorconv=valor*11.339
    if medida=="t":
        valorconv=valor*1000
    if medida=="kg":
        valorconv=valor


    if medidaconv=="l":
        res=valorconv*2.20462
    if medidaconv=="g":
        res=valorconv*1000
    if medidaconv=="o":
        res=valorconv*35.274
    if medidaconv=="a":
        res=valorconv*0.088
    if medidaconv=="t":
        res=valorconv*0.001
    if medidaconv=="kg":
        res=valorconv
    return (valorconv)

a=(int(input("valor")))
b=input("medida valor")
c=input("medida a convertir")
print(conversor_masa(a,b,c))
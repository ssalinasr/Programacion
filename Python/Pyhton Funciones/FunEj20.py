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

def pat(a,b):

    if a=="p":
        a=0
    if a=="a":
        a=1
    if a=="t":
        a=2

    if b=="p":
        b=0
    if b=="a":
        b=1
    if b=="t":
        b=2

    if a==b:
        return ("empate")

    if a==0 and b==1 or a==2 and b==0 or a==1 and b==2:
        return ("gana 2")

    if a==1 and b==0 or a==0 and b==2 or a==2 and b==1:
        return ("gana 1")


a=input("1")
b=input("2")
print(pat(a,b))
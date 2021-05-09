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

def patls(a,b):

    if a=="p":
        a=0
    if a=="a":
        a=1
    if a=="t":
        a=2
    if a=="l":
        a=3
    if a=="s":
        a=4

    if b=="p":
        b=0
    if b=="a":
        b=1
    if b=="t":
        b=2
    if b=="l":
        b=3
    if b=="s":
        b=4
    if a==b:
        return ("empate")

    if a==0 and b==1 or a==1 and b==2 or a==2 and b==0 or a==3 and b==0 or a==4 and b==3 or a==2 and b==4 or a==3 and b==2 or a==1 and b==3 or a==4 and b==1 or a==0 and b==4:
        return ("gana 2")

    if a==1 and b==0 or a==2 and b==1 or a==0 and b==2 or a==0 and b==3 or a==3 and b==4 or a==4 and b==2 or a==2 and b==3 or a==3 and b==1 or a==1 and b==4 or a==4 and b==0:
        return ("gana 1")


a=input("1")
b=input("2")
print(patls(a,b))
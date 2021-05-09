#-------------------------------------------------------------------------------
# Name:        mÃ³dulo1
# Purpose:
#
# Author:      FliaSalinasRodriguez
#
# Created:     08/04/2018
# Copyright:   (c) FliaSalinasRodriguez 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------

dia=int(input("dia:"))
mes=int(input("mes:"))
anio=int(input("anio:"))
dds=0
mms=0
aas=0

if dia>31 or mes>12 or anio<0:
    print("alguno de los valores no es valido")

if dia>=1 and dia<=29:
    if mes==4 or mes==6 or mes==9 or mes==11:
        dds=dia+1
        mms=mm
        aas=anio
    else:
        if dia>=1 and dia<=30:
           if mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:
            dds=dia+1
            mms=mes+1
            aas=anio
            print("dia siguente")
            print(dds)
            print("mes siguiente")
            print(mms)
            print("anio siguiente")
            print(aas)

if dia==30:
    if mes==4 or mes==6 or mes==9 or mes==11:
        dds=dia-29
        mms=mes+1
        aas=anio
        print("dia siguente")
        print(dds)
        print("mes siguiente")
        print(mms)
        print("anioo siguiente")
        print(aas)
    else:
        if dia==31:
            if mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10:
                dds=dia-30
                mms=mes+1
                aas=anio
                print("dia siguente")
                print(dds)
                print("mes siguiente")
                print(mms)
                print("anio siguiente")
                print(aas)

if dia==31 and mes==12:
    dds=dia-30
    mms=mes-11
    aas=anio+1
    print("dia siguente")
    print(dds)
    print("mes siguiente")
    print(mms)
    print("anio siguiente")
    print(aas)

if dia>=1 and dia<=27:
    dds=dia+1
    mms=mes
    aas=anio
    print("dia siguente")
    print(dds)
    print("mes siguiente")
    print(mms)
    print("anio siguiente")
    print(aas)
else:
    if dia==28:
        if (anio%4==0) and (anio%100!=0) or (anio%400==0):
         dds=dia+1
         mms=mes
         aas=anio
         print("dia siguente")
         print(dds)
         print("mes siguiente")
         print(mms)
         print("anio siguiente")
         print(aas)
        else:
         dds=dia-27
         mms=mes+1
         aas=anio
         print("dia siguente")
         print(dds)
         print("mes siguiente")
         print(mms)
         print("anio siguiente")
         print(aas)


if dia==29:
    if (anio%4==0) and (anio%100!=0) or (anio%400==0):
        dds=dia-28
        mms=mes+1
        aas=anio
        print("dia siguente")
        print(dds)
        print("mes siguiente")
        print(mms)
        print("anio siguiente")
        print(aas)
    else:
        print("fecha no valida")




















# -*- coding: utf-8 -*-
"""
Created on Wed May 20 11:05:20 2020

@author: Sebastian Salinas Rodriguez - 20181020058
"""
from random import randint
import numpy as np
import pandas as pd

'--------------------------------------------------------------------------------------'

'Construye las tres cadenas de forma numerica y aleatoria'
def build_cadena():
    lista = [None] *50

    for i in range(50):
        n = randint(0,3)
        lista[i] = n
            
    return lista

'construye el dataframe con las alineaciones múltiples obtenidas'
def build_dataframe(c1,c2,c3,c4,c5,c6,c7):
     data = pd.DataFrame(data=[c1,c2,c3,c4,c5,c6,c7])
     
     return data
 
 
'construye el dataframe con las posiciones de cada forma de movimientos realizada'    
def build_array(x,y,z):
    
    lista_x = x
    lista_y = y
    lista_z = z
    

    array_x = pd.DataFrame(columns=['x','y','z'])
  
    array_x.loc[len(array_x)]= lista_x[0],lista_y[0],lista_z[0]
    array_x.loc[len(array_x)]= lista_x[1],lista_y[1],lista_z[1]
    array_x.loc[len(array_x)]= lista_x[2],lista_y[2],lista_z[2]
    array_x.loc[len(array_x)]= lista_x[3],lista_y[3],lista_z[3]
    array_x.loc[len(array_x)]= lista_x[4],lista_y[4],lista_z[4]
    array_x.loc[len(array_x)]= lista_x[5],lista_y[5],lista_z[5]    
    array_x.loc[len(array_x)]= lista_x[6],lista_y[6],lista_z[6]
    array_x.loc[len(array_x)]= lista_x[7],lista_y[7],lista_z[7]
    array_x.loc[len(array_x)]= lista_x[8],lista_y[8],lista_z[8]
    array_x.loc[len(array_x)]= lista_x[9],lista_y[9],lista_z[9]
    array_x.loc[len(array_x)]= lista_x[10],lista_y[10],lista_z[10]
    array_x.loc[len(array_x)]= lista_x[11],lista_y[11],lista_z[11]
    array_x.loc[len(array_x)]= lista_x[12],lista_y[12],lista_z[12]
    array_x.loc[len(array_x)]= lista_x[13],lista_y[13],lista_z[13]
    array_x.loc[len(array_x)]= lista_x[14],lista_y[14],lista_z[14]
    array_x.loc[len(array_x)]= lista_x[15],lista_y[15],lista_z[15]
    array_x.loc[len(array_x)]= lista_x[16],lista_y[16],lista_z[16]
    array_x.loc[len(array_x)]= lista_x[17],lista_y[17],lista_z[17]
    array_x.loc[len(array_x)]= lista_x[18],lista_y[18],lista_z[18]
    array_x.loc[len(array_x)]= lista_x[19],lista_y[19],lista_z[19]
    array_x.loc[len(array_x)]= lista_x[20],lista_y[20],lista_z[20]
    array_x.loc[len(array_x)]= lista_x[21],lista_y[21],lista_z[21]
    array_x.loc[len(array_x)]= lista_x[22],lista_y[22],lista_z[22]
    array_x.loc[len(array_x)]= lista_x[23],lista_y[23],lista_z[23]
    array_x.loc[len(array_x)]= lista_x[24],lista_y[24],lista_z[24]
    array_x.loc[len(array_x)]= lista_x[25],lista_y[25],lista_z[25]
    array_x.loc[len(array_x)]= lista_x[26],lista_y[26],lista_z[26]
    array_x.loc[len(array_x)]= lista_x[27],lista_y[27],lista_z[27]
    array_x.loc[len(array_x)]= lista_x[28],lista_y[28],lista_z[28]
    array_x.loc[len(array_x)]= lista_x[29],lista_y[29],lista_z[29]
    array_x.loc[len(array_x)]= lista_x[30],lista_y[30],lista_z[30]
    array_x.loc[len(array_x)]= lista_x[31],lista_y[31],lista_z[31]
    array_x.loc[len(array_x)]= lista_x[32],lista_y[32],lista_z[32]
    array_x.loc[len(array_x)]= lista_x[33],lista_y[33],lista_z[33]
    array_x.loc[len(array_x)]= lista_x[34],lista_y[34],lista_z[34]
    array_x.loc[len(array_x)]= lista_x[35],lista_y[35],lista_z[35]
    array_x.loc[len(array_x)]= lista_x[36],lista_y[36],lista_z[36]
    array_x.loc[len(array_x)]= lista_x[37],lista_y[37],lista_z[37]
    array_x.loc[len(array_x)]= lista_x[38],lista_y[38],lista_z[38]
    array_x.loc[len(array_x)]= lista_x[39],lista_y[39],lista_z[39]
    array_x.loc[len(array_x)]= lista_x[40],lista_y[40],lista_z[40]
    array_x.loc[len(array_x)]= lista_x[41],lista_y[41],lista_z[41]
    array_x.loc[len(array_x)]= lista_x[42],lista_y[42],lista_z[42]
    array_x.loc[len(array_x)]= lista_x[43],lista_y[43],lista_z[43]
    array_x.loc[len(array_x)]= lista_x[44],lista_y[44],lista_z[44]
    array_x.loc[len(array_x)]= lista_x[45],lista_y[45],lista_z[45]
    array_x.loc[len(array_x)]= lista_x[46],lista_y[46],lista_z[46]
    array_x.loc[len(array_x)]= lista_x[47],lista_y[47],lista_z[47]
    array_x.loc[len(array_x)]= lista_x[48],lista_y[48],lista_z[48]
    array_x.loc[len(array_x)]= lista_x[49],lista_y[49],lista_z[49]
    
    return array_x

'construye el dataframe con las series de movimientos agrupadas'       
def build_series(p1,p2,p3,p4,p5,p6,p7):
    
    frames = [p1,p2,p3,p4,p5,p6,p7]
    new_frame = pd.concat(frames, ignore_index = True)
    
    return new_frame
    
'convierte una cadena en forma numérica a string'
def convert_to_string(cadena):
    new_cad = []
    for i in range(len(cadena)):
        if(cadena[i]==0):
            new_cad.append('A')
        elif(cadena[i]==1):
            new_cad.append('C')
        elif(cadena[i]==2):
            new_cad.append('G')
        elif(cadena[i]==3):
            new_cad.append('T')
        elif(cadena[i]==' '):
            new_cad.append(' ')
            
    return new_cad


'creacion de las tres cadenas'
cadena1=build_cadena()
cadena2=build_cadena()
cadena3=build_cadena()

'creacion de las listas de alineaciones multiples'
alineacion_1M_2N_3N = []
alineacion_1N_2M_3N = []
alineacion_1N_2N_3M = []
alineacion_1M_2N_3M = []
alineacion_1M_2M_3N = []
alineacion_1N_2M_3M = []
alineacion_1N_2N_3N = []

'posiciones de movimiento primera cadena'
posiciones_1M_2N_3N_x = []
posiciones_1M_2N_3N_y = []
posiciones_1M_2N_3N_z = []

'posiciones de movimiento segunda cadena'
posiciones_1N_2M_3N_x = []
posiciones_1N_2M_3N_y = []
posiciones_1N_2M_3N_z = []

'posiciones de movimiento tercera cadena'
posiciones_1N_2N_3M_x = []
posiciones_1N_2N_3M_y = []
posiciones_1N_2N_3M_z = []

'posiciones de movimiento primera y tercera cadena'
posiciones_1M_2N_3M_x = []
posiciones_1M_2N_3M_y = []
posiciones_1M_2N_3M_z = []

'posiciones de movimiento primera y segunda cadena'
posiciones_1M_2M_3N_x = []
posiciones_1M_2M_3N_y = []
posiciones_1M_2M_3N_z = []

'posiciones de movimiento segunda y tercera cadena'
posiciones_1N_2M_3M_x = []
posiciones_1N_2M_3M_y = []
posiciones_1N_2M_3M_z = []

'posiciones de movimiento al no mover ninguna cadena'
posiciones_1N_2N_3N_x = []
posiciones_1N_2N_3N_y = []
posiciones_1N_2N_3N_z = []


'Movimiento primera cadena'
for i in range(50):
    cadena1.insert(i+1,cadena1[i])
    cadena1[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1M_2N_3N_x.append(i)
    posiciones_1M_2N_3N_y.append(0)
    posiciones_1M_2N_3N_z.append(0)
    alineacion_1M_2N_3N.append(counter)
    
 
for i in range(50):
    cadena1.remove(" ")
    

'Movimiento segunda cadena'
for i in range(50):
    cadena2.insert(i+1,cadena2[i])
    cadena2[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1N_2M_3N_x.append(0)
    posiciones_1N_2M_3N_y.append(i)
    posiciones_1N_2M_3N_z.append(0)
    alineacion_1N_2M_3N.append(counter)



for i in range(50):
    cadena2.remove(" ")
  

'Movimiento tercera cadena'
for i in range(50):
    cadena3.insert(i+1,cadena3[i])
    cadena3[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1N_2N_3M_x.append(0)
    posiciones_1N_2N_3M_y.append(0)
    posiciones_1N_2N_3M_z.append(i)
    alineacion_1N_2N_3M.append(counter)
 
for i in range(50):
    cadena3.remove(" ")

'Movimiento primera y segunda cadena'
for i in range(50):
    cadena1.insert(i+1,cadena1[i])
    cadena1[i] = " "
    cadena2.insert(i+1,cadena2[i])
    cadena2[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1M_2M_3N_x.append(i)
    posiciones_1M_2M_3N_y.append(i)
    posiciones_1M_2M_3N_z.append(0)
    alineacion_1M_2M_3N.append(counter)

for i in range(50):
    cadena1.remove(" ")
    cadena2.remove(" ")

'Movimiento primera y tercera cadena'
for i in range(50):
    cadena1.insert(i+1,cadena1[i])
    cadena1[i] = " "
    cadena3.insert(i+1,cadena3[i])
    cadena3[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1M_2N_3M_x.append(i)
    posiciones_1M_2N_3M_y.append(0)
    posiciones_1M_2N_3M_z.append(i)
    alineacion_1M_2N_3M.append(counter)

for i in range(50):
    cadena1.remove(" ")
    cadena3.remove(" ") 


'Movimiento segunda y tercera cadena'
for i in range(50):
    cadena2.insert(i+1,cadena2[i])
    cadena2[i] = " "
    cadena3.insert(i+1,cadena3[i])
    cadena3[i] = " "
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1N_2M_3M_x.append(0)
    posiciones_1N_2M_3M_y.append(i)
    posiciones_1N_2M_3M_z.append(i)
    alineacion_1N_2M_3M.append(counter)
  
for i in range(50):
    cadena2.remove(" ")
    cadena3.remove(" ")   
 

'Sin movimiento'
for i in range(50):
    counter = 0
    for j in range(50):
        if(cadena1[j] == cadena2[j] == cadena3[j]):
            counter+=1
     
    posiciones_1N_2N_3N_x.append(i)
    posiciones_1N_2N_3N_y.append(i)
    posiciones_1N_2N_3N_z.append(i)
    alineacion_1N_2N_3N.append(counter)

'creacion de arreglos con las alineaciones multiples obtenidas'
serieC1 = np.array(alineacion_1M_2N_3N)
serieC2 = np.array(alineacion_1N_2M_3N)
serieC3 = np.array(alineacion_1N_2N_3M)
serieC4 = np.array(alineacion_1M_2M_3N)
serieC5 = np.array(alineacion_1M_2N_3M)
serieC6 = np.array(alineacion_1N_2M_3M)
serieC7 = np.array(alineacion_1N_2N_3N)

'creacion de dataframes con las posiciones ejecutadas en cada movimiento'
serieP1 = build_array(posiciones_1M_2N_3N_x, posiciones_1M_2N_3N_y, posiciones_1M_2N_3N_z)
serieP2 = build_array(posiciones_1N_2M_3N_x, posiciones_1N_2M_3N_y, posiciones_1N_2M_3N_z)
serieP3 = build_array(posiciones_1N_2N_3M_x, posiciones_1N_2N_3M_y, posiciones_1N_2N_3M_z)
serieP4 = build_array(posiciones_1M_2M_3N_x, posiciones_1M_2M_3N_y, posiciones_1M_2M_3N_z)
serieP5 = build_array(posiciones_1M_2N_3M_x, posiciones_1M_2N_3M_y, posiciones_1M_2N_3M_z)
serieP6 = build_array(posiciones_1N_2M_3M_x, posiciones_1N_2M_3M_y, posiciones_1N_2M_3M_z)
serieP7 = build_array(posiciones_1N_2N_3N_x, posiciones_1N_2N_3N_y, posiciones_1N_2N_3N_z)

'creacion de los dataframes con las posiciones y alineaciones multiples de todos los movimientos'
dat_alineacion = build_dataframe(serieC1,serieC2,serieC3,serieC4,serieC5,serieC6,serieC7)
dat_posiciones = build_series(serieP1,serieP2,serieP3,serieP4,serieP5,serieP6,serieP7)

'obtencion de los valores maximos en las alineaciones multiples'
max_value = dat_alineacion.max().max()
dat_maximos = dat_alineacion.where(dat_alineacion == dat_alineacion.max().max())

'elimina las columnas y filas donde no hay alineaciones maximos'
dat_maximos = dat_maximos.dropna(axis=1, how='all')
dat_maximos = dat_maximos.dropna(axis=0, how='all')

'obtencion de las filas y columnas donde existen alineaciones maximas, en forma de lista'
columnas_maximas = dat_maximos.columns.tolist()
indices_maximos = dat_maximos.index.tolist()

'seleccion de las posiciones en donde se encuentran las alineaciones multiples maximas'

if(indices_maximos[len(indices_maximos)-1]==0):
    dp_a = dat_posiciones.query('index>=0 and index<50')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==1):
    dp_a = dat_posiciones.query('index>=51 and index<100')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==2):
    dp_a = dat_posiciones.query('index>=101 and index<150')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==3):
    dp_a = dat_posiciones.query('index>=151 and index<200')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==4):
    dp_a = dat_posiciones.query('index>=201 and index<250')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==5):
    dp_a = dat_posiciones.query('index>=251 and index<300')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
elif(indices_maximos[len(indices_maximos)-1]==6):
    dp_a = dat_posiciones.query('index>=301 and index<350')
    dp_a = dp_a.reset_index()
    dp_a = dp_a.drop(['index'], axis=1)
    
'localizacion de las posiciones donde la alineacion multiple es maxima' 

'''
x = es el movimiento de la primera cadena
y = es el movimiento de la segunda cadena
z = es el movimiento de la tercera cadena
'''   

print(len(columnas_maximas))

posicion_x = dp_a.iloc[columnas_maximas[len(columnas_maximas)-1],0]
posicion_y = dp_a.iloc[columnas_maximas[len(columnas_maximas)-1],1]
posicion_z = dp_a.iloc[columnas_maximas[len(columnas_maximas)-1],2]

'ejecucion de los movimientos necesarios para llegar a dichas posiciones'
for i in range(posicion_x):
    cadena1.insert(i+1,cadena1[i])
    cadena1[i] = " "
    
for i in range(posicion_y):
    cadena2.insert(i+1,cadena2[i])
    cadena2[i] = " "
    
for i in range(posicion_z):
    cadena3.insert(i+1,cadena3[i])
    cadena3[i] = " "


'conversion de las cadenas a strings en forma de lista'
str_cadena1 = convert_to_string(cadena1)
str_cadena2 = convert_to_string(cadena2)
str_cadena3 = convert_to_string(cadena3)

'ajuste de las cadenas como strings'
str_final1 = "".join(str_cadena1)
str_final2 = "".join(str_cadena2)
str_final3 = "".join(str_cadena3)

'impresion de los resultados'
print("La cantidad de combinaciones en esta seleccion es: "+str(max_value))
print(" ")
print(str_final1)
print(str_final2)
print(str_final3)

'--------------------------------------------------------------------------------------'




    

        



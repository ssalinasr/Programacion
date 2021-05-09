# -*- coding: utf-8 -*-
"""
Created on Sat May 30 10:50:26 2020

@author: FliaSalinasRodriguez
"""
import pandas as pd
import numpy as np

def func1(n1,n2):
    return (n1+n2)*n2

def func2(df):
    return df.sum(axis=1)

def func3(n1):
    return np.sin(n1)*np.cos(n1)
    

'1.Uso de pipe con tres funciones:'
datos1 = {'angulo':[25,35,45,0,360,180,29,26,270,152,125,215]}
df1 = pd.DataFrame(datos1) 
dfd1 = df1.pipe(func1,10).pipe(func2).pipe(func3)
print('resultado de pipe con las tres funciones aplicadas:')
print(dfd1)
print()

'2. Cálculo de IMC con lambda'
imc = {'peso':[57,88,74,96,55,59,54,61,62,77],
       'estatura':[1.71,1.77,1.85,1.89,1.65,1.91,1.74,1.79,1.81,1.63]}

df2 = pd.DataFrame(imc)
df2['IMC'] = df2.apply(lambda x: x['peso']/(x['estatura']*x['estatura']),axis=1)

print('cálculo del IMC:')
print(df2)
print()

'3. Método agg para funciones estadisticas'
datos3 = {'A':[20,50,80,90,40],
       'B':[10,10,30,40,80],'C':[60,90,30,20,20],'D':[10,70,30,50,90]}

df3 = pd.DataFrame(datos3)
'Funciones: suma, media, mediana, minimo, maximo, desv.estandar'
print('Funciones: suma, media, mediana, minimo, maximo, desv.estandar:')
print(df3.agg([np.sum, np.mean, np.median, np.std, np.min,np.max]))

'4. Elementos con precios en diferentes monedas:'
datos4 = {'Elementos':['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'],
          'Pesos':[15000,25000,35200,415000,50000,100000,85600,45620,123600,854700,
                   693000,412000,231000,569300,1000000]}

df4= pd.DataFrame(datos4)
df4['Euros'] = df4.apply(lambda e: e['Pesos']*0.00024, axis=1)
df4['Dolares'] = df4.apply(lambda d: d['Pesos']*0.00027, axis=1)
df4['Libras'] =df4.apply(lambda l: l['Pesos']*0.00022, axis=1)
print()
print('conversion a dolares, euros y libras')
print(df4)

'5. Elementos de pesos a euros:'
df5= pd.DataFrame(datos4)
df5['Dolares'] = df5.apply(lambda d: d['Pesos']*0.00027, axis=1)
print()
print('conversion a dolares:')
print(df5)

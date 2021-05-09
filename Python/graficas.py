# -*- coding: utf-8 -*-
"""
Created on Wed Jun  3 09:27:36 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd
import numpy as np
import  matplotlib.pyplot as plt
import dateutil

dat = pd.read_csv('Casos_positivos_de_COVID-19_en_Colombia.csv', index_col = 'ID de caso')

'''
.plot(), funcion de creacion de gráficas
Plot , subplots , x=(indice por defecto) , y=(valores columna por defecto), ejes asignables
.cumsum(), suma acumulada, stacked(acumulacion de barras)
Bar, .plot().bar()
.sort_index() , orden por indice
Hist, por frecuencia, .hist(), bins, forma de agrupar el histrograma(entero o rango)
Box .box(), verde = mediana, caja = mayor frecuencia, separado por cuartiles, puntos= datos atipicos
Area .area(), variacion de plot, sombrea el area bajo la curva, stacked=color solido
Scatter .scatter(), distribucion de puntos, ejes asignables
Pie .pie()
figsize = tamaño de figura (alto,ancho)
explode = valor de resalto de una porcion, su tamaño es igual a la cantidad de grupos de la grafica
'''

dat['Fecha de muerte'].unique()
dat['Fecha diagnostico'].unique()

dat['Fecha de muerte'].replace('-   -',np.nan, inplace=True)
dat['Fecha de muerte'].replace('/  /',np.nan, inplace=True)
dat['Fecha recuperado'].replace('-   -',np.nan, inplace=True)
dat['Fecha diagnostico'].replace('SIN DATO',np.nan, inplace=True)
S1 = dat['Fecha diagnostico'].dropna().apply(dateutil.parser.parse, yearfirst=True).value_counts().sort_index(ascending=True)
S2 = dat['Fecha de muerte'].dropna().apply(dateutil.parser.parse, yearfirst=True).value_counts().sort_index(ascending=True)
S3 = dat['Fecha recuperado'].dropna().apply(dateutil.parser.parse, yearfirst=True).value_counts().sort_index(ascending=True)

frame = { 'Contagiados': S1, 'Muertos': S2, 'Recuperados': S3 } 
df=pd.DataFrame(frame).fillna(value=0)

'df.cumsum().plot()' #Por lineas
'df.iloc[len(df)-10:,:].plot.bar()' #Por barras
'''
dat['Edad'].hist(bins=10)
'''
'''
dat['Edad'][dat['Estado']=='Fallecido'].hist(bins=10)
'''
S4=dat['Edad'][dat['Estado']=='Leve']
S5=dat['Edad'][dat['Estado']=='Asintomático']
S6=dat['Edad'][dat['Estado']=='Fallecido']
S7=dat['Edad'][dat['Estado']=='Moderado']
S8=dat['Edad'][dat['Estado']=='Grave']
frame = { 'Leves': S4, 'Asintomáticos': S5, 'Fallecidos': S6, 'Moderados': S7, 'Graves': S8 } 
df1=pd.DataFrame(frame)

dat = dat.replace('leve','Leve')
dat['Estado'].unique()

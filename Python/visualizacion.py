# -*- coding: utf-8 -*-
"""
Created on Fri Jun  5 10:32:17 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

'Creacion dataframe con datos de elecciones presidenciales 2018 (Medellin)'
dat = pd.read_csv('RESULTADOS_ELECCIONES_2018_PRESIDENTE_Y_VICEPRESIDENTE_DE_LA_REPUBLICA_PRIMERA_VUELTA.csv')
'5000 primeros datos'
dat = dat[:5000]

'Creacion de los dataframes para cada grafica'
'-------------------------------------------------------------------------------------------------'
dat3 = dat[['mesa','votos']]
dat5 = dat[['zona','votos']]
dat2 = dat[['mesa','votos']]


dat4=dat.dropna(axis=0,how='any')
S1=dat['votos'][dat['candidato']=='GERMÁN VARGAS LLERAS']
S2=dat['votos'][dat['candidato']=='GUSTAVO PETRO']
S3=dat['votos'][dat['candidato']=='HUMBERTO DE LA CALLE']
S4=dat['votos'][dat['candidato']=='IVÁN DUQUE']
S5=dat['votos'][dat['candidato']=='JORGE ANTONIO TRUJILLO SARMIENTO']
S6=dat['votos'][dat['candidato']=='SERGIO FAJARDO']
S7=dat['votos'][dat['candidato']=='VIVIANE MORALES']
frame = { 'Vargas Lleras': S1, 'Petro': S2, 'De la Calle': S3, 'Duque': S4, 'Trujillo Sarmiento': S5,
         'Fajardo':S6 , 'Morales':S7} 
dat4=pd.DataFrame(frame)
#explode = (0, 0.1, 0, 0.1,0,0,0.1,0,0,0,0) 
dat6 = dat.where(dat['zona']==1)
dat6 = dat6.dropna(axis=0,how='all')
dat7 = dat[['mesa','votos']]
dat8 = dat[['zona','votos']]
dat8 = dat8.groupby('zona').sum() 
dat8 = dat8.reset_index() 
dat9 = dat[['mesa','votos']]
'-------------------------------------------------------------------------------------------------'

tam1 = 9  # Anchura de las gráfricas
tam2 = 9  # Altura de las gráficas

'Subplots con las gráficas'
'-------------------------------------------------------------------------------------------------'
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.viridis(np.linspace(0,1,6)))
fig, axes = plt.subplots(figsize=(tam1, tam2))
dat3['mesa'].cumsum().plot(ax=axes) #Linea
axes.set_title('Votos acumulados por mesa')
axes.set_xlabel('Mesa')
axes.set_ylabel('Votos')
fig5, axes5 = plt.subplots(figsize=(tam1, tam2))
dat5['zona'].cumsum().plot.area(ax=axes5,stacked=False) #Area
axes5.set_title('Votos acumulados por Zona')
axes5.set_xlabel('Zona')
axes5.set_ylabel('Votos Acumulados')
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.plasma(np.linspace(0,1,6)))
fig2, axes2 = fig, axes = plt.subplots(figsize=(tam1, tam2))
dat2['mesa'].value_counts().sort_index(ascending=True).plot.bar(ax=axes2, figsize=(tam1+10, tam2)) #Barras
axes2.set_title('Votos por mesa')
axes2.set_xlabel('Mesa')
axes2.set_ylabel('Votos')
fig6, axes6 = fig, axes = plt.subplots(figsize=(tam1, tam2))
dat4.plot.box(ax=axes6,figsize=(tam1+10, tam2)) #Caja
axes6.set_title('Tendencia de votos en mesa por candidato')
axes6.set_xlabel('Candidato')
axes6.set_ylabel('Votos por mesa')
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.inferno(np.linspace(0,1,6)))
fig3, axes3 = plt.subplots(figsize=(tam1, tam2))
dat4.plot.hist(ax=axes3,figsize=(tam1, tam2), bins=10) #Histrograma
fig7, axes7 = plt.subplots(figsize=(tam1, tam2))
dat7.plot.scatter(ax=axes7,x='mesa', y='votos') #Scatter
axes7.set_title('Relacion mesa y votos')
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.magma(np.linspace(0,1,6)))
fig4, axes4 = plt.subplots(figsize=(tam1, tam2))
pd.plotting.radviz(dat8,'votos',ax=axes4) #RadViz
axes4.set_title('Relacion mesa y votos por RadViz')
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.cividis(np.linspace(0,1,6)))
mat = pd.plotting.scatter_matrix(dat9) #Matriz Scatter
fig1, ax1 = plt.subplots(figsize=(tam1, tam2)) #Circular
plt.rcParams.update({'font.size': 10})
dat6.groupby('candidato')['candidato'].count().plot.pie(ax=ax1,figsize=(tam1, tam2), explode = (0,0.1,0,0.1,0,0,0.1,0,0,0,0), autopct='%1.1f%%')
fig1.subplots_adjust(right=0.75, left=0.3)
ax1.set_title('Proporcion de votos por candidato')





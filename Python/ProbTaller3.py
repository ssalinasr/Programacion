# -*- coding: utf-8 -*-
"""
Created on Mon May 18 10:07:26 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd

'DataFrame'
dat = pd.read_csv('Casos_positivos_de_COVID-19_en_Colombia.csv')

'La función mask, muestra los resultados donde la condicion dada es FALSA, dejando los verdaderos con NaN'
data_mask = dat.mask(dat['Ciudad de ubicación'] == 'Medellín',0)

'Filtra la fila edad, y establece que valores cumplen la condicion >=36'
filter_edad = dat['Edad'] >= 31

filter_edad.loc[50:,['Edad']].plot(kind='bar')

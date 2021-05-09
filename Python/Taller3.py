# -*- coding: utf-8 -*-
"""
Created on Wed May 13 11:01:11 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd
import numpy as np

'--------------------------------------------------------------------------------'

'1. Creación del DataFrame'
dat = pd.read_csv('Casos_positivos_de_COVID-19_en_Colombia.csv')

'Modificacion para los casos datafill_na3, datafill_mean_edad'
datafixPol = dat.replace(11001,np.NaN)

'Modificacion para los casos datadrop_index_all, data_fill_backfill '
datafixRow = dat
datafixRow.loc[1]=np.NaN

'--------------------------------------------------------------------------------'

'2. Filtros de Limpieza'

'Elimina las filas en donde existe un valor NaN en alguno de sus valores asociados'
datadrop_index_any = datafixPol.dropna(axis=0, how='any') 

'Elimina las filas en donde TODOS sus valores asociados son NaN'
datadrop_index_all = datafixRow.dropna(axis=0, how='all')

'Elimina las Columnas en donde existe un valor NaN en alguna de sus filas asociadas'  
datadrop_columns_any = dat.dropna(axis=1, how='any')

'Reemplaza TODOS los valores NaN por 3' 
datafill_na3 = datafixPol.fillna(value=3)

'Reemplaza TODOS los valores NaN por la media de la Edad, seleccionado por ser de '
'valores numericos, mean realiza la media de la edad'
datafill_mean_edad = datafixPol.fillna(dat['Edad'].mean(skipna=True))

'Reemplaza los valores del dataframe donde la fila 1 era NaN, por los valores originales del DataFrame dat'
data_fill_backfill = datafixRow.fillna(method='bfill', limit=1)

'Filtra la fila edad, y establece que valores cumplen la condicion >=36'
filter_edad= dat['Edad'] >= 36

'Filtra las filas de los casos cuya ID es igual o mayor a 1000'
filter_case = dat[dat['ID de caso'] >= 1000]

'Muestra las filas de los casos cuyo filtro consiste en que la edad sea mayor o igual a 31'
filter_age31 = dat['ID de caso'][dat['Edad'] >= 31]

'Hace filtro tanto de las IDs de caso y de los Códigos DIVIPOLA'
filter_two_columns = dat[(dat['Codigo DIVIPOLA'] >= 10000) & (dat['ID de caso'] >= 25)]

'--------------------------------------------------------------------------------'

'3. Filtros de búsqueda'

'Reasignación de dataframe de casos para el punto 3'
new_dat = pd.read_csv('Casos_positivos_de_COVID-19_en_Colombia.csv')

'La función where, muestra los resultados dada una condicion específica, y lo demás pasa a ser NaN'
data_where = new_dat.where(new_dat['Edad'] == 31)

'La función mask, muestra los resultados donde la condicion dada es FALSA, dejando los verdaderos con NaN'
data_mask = new_dat.mask(new_dat['Ciudad de ubicación'] == 'Medellín',0)

'''
La diferencia de where y mask, consiste en la forma en que filtran los datos: where muestra los
datos cuya condición se cumple y mask realiza totalmente lo opuesto
'''

'Retorna True si el valor coincide con el de la condición expresada'
data_isin = new_dat.isin({'Tipo':['Importado']})

'Filtra en forma de consulta, las filas en donde la condicion dada se cumpla'
data_query = new_dat.query('Edad > 35')

'Realiza operaciones entre datos almacenados en las columnas del Dataframe'
data_eval = new_dat.eval('Edad = Edad * 20')

'--------------------------------------------------------------------------------'





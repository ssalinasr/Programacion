# -*- coding: utf-8 -*-
"""
Created on Fri May 29 11:36:55 2020

@author: FliaSalinasRodriguez
"""
import pandas as pd
import dateutil
 

'1. Carga del csv a un dataframe'
print('primer punto')
print()
data = pd.read_csv('phone_data.csv', index_col='index')
data['date'] = data['date'].apply(dateutil.parser.parse, dayfirst=True)
print('Datos cargados...')

'2. Duración de los items'
print('segundo punto')
print()
print('Valor maximo de la columna duración:')
print(data['duration'].max())
print()
print('toma la fila, donde la duración es máxima:')
print(data[data['duration']==data['duration'].max()])
print()
df_item_llamada = data.where(data['item']=='call')
df_item_llamada = df_item_llamada.dropna(axis=0, how='all')
print('El evento llamada de mayor duración es:')
print(df_item_llamada['duration'].max())
print()
df_item_data = data.where(data['item']=='data')
df_item_data = df_item_data.dropna(axis=0, how='all')
print('El evento datos de mayor duración es:')
print(df_item_data['duration'].max())

'3. Total de segundos'
print('tercer punto')
print()
print()
print('Total de segundos de todas las llamadas:')
print(data['duration'][data['item'] == 'call'].sum())

df_item_sms = data.where(data['item']=='sms')
df_item_sms = df_item_sms.dropna(axis=0, how='all')

print()
print('Total de segundos de los eventos sms y data:')
print(data['duration'][data['item'] == 'sms'].sum()+data['duration'][data['item'] == 'data'].sum())

print()
'4. Cantidades de elementos'
print('cuarto punto')
print()
print('Entadas por meses:')
print(data['month'].value_counts())
print()
df_groupby_network_items = data.groupby('network')['item'].value_counts()
print(df_groupby_network_items)
print()
print('entradas de datos por redes:')
print('data:' ,end=" ")
print(df_groupby_network_items[8])
print()
print('entradas de datos por llamadas:')
print('meteor:' ,end=" ")
print(df_groupby_network_items[0])
print('Tesco:' ,end=" ")
print(df_groupby_network_items[2])
print('Three:' ,end=" ")
print(df_groupby_network_items[4])
print('Vodafone:' ,end=" ")
print(df_groupby_network_items[7])
print('Landline:' ,end=" ")
print(df_groupby_network_items[9])
print('voicemail:' ,end=" ")
print(df_groupby_network_items[11])


'5. Operaciones con Groupby'
print('quinto punto')
print()
print()
print('suma de la duracion por mes:')
print(data.groupby('month')['duration'].sum())

df_group_by_item_network_mean = data.groupby(['item','network']).mean()
df_group_by_item_network = data.groupby(['item','network'])['item'].value_counts()

print()
print('promedio de los eventos por llamadas:')
print(df_group_by_item_network_mean[df_group_by_item_network_mean['duration'] >= 36])

print()
print('promedio de los eventos por datos:')
print(df_group_by_item_network_mean[6:7])
print()

'6. Número de entradas'
print('sexto punto')
print()
print('Número de entradas por mes:')
print(data.groupby('month')['date'].count())
print()

print('Número de llamadas por red:')
print(df_group_by_item_network[:6])
print()

print('Número de sms por red:')
print(df_group_by_item_network[7:])
print()

'7. Eventos de llamada, sms y datos por mes:'
print('séptimo punto')
print()
print('Eventos de llamada, sms y datos por mes:')
print(data.groupby(['month', 'item'])['date'].count())
print()

print('uso de redes por mes:')
print(data.groupby(['month', 'network'])['date'].count())
print()

print('uso de redes por mes según el evento:')
print(data.groupby(['month', 'network','item'])['date'].count())
print()


# -*- coding: utf-8 -*-
"""
Created on Wed May  6 11:23:49 2020

@author: sebas
"""

import numpy as np
from random import randint

'función de cambio de posiciones de los bloques'
def change (i,j):
    
    aux_a=lista[i]
    aux_b=lista[j]
    
    lista[j]=aux_a
    lista[i]=aux_b

'-----------------------------------------------'

'creación del cubo 9x9x9 y los minicubos 3x3x3'
cube= np.arange(0,729,1).reshape(9,9,9)
minicube = cube.reshape(27,3,3,3)

'construcción lista de minicubos'
lista = [None] * 27
i=0
while i<27:
    lista[i]=minicube[i,:,:,:]
    i+=1

'cambio en la lista de minicubos'

x=0
for x in range (5):
    rand_index1 = randint(0,26)
    rand_index2 = randint(0,26)
    change(rand_index1, rand_index2)
    print("cambio de:" + str(rand_index1) +" y "+str(rand_index2))
    print('\n')
    
'impresion de la lista de minicubos'
for i in range(27):
    print("\n")
    print("Cubo "+str(i))
    print(lista[i])
    print("\n")

'-----------------------------------------------'


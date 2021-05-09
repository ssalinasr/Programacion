# -*- coding: utf-8 -*-
"""
Created on Wed Dec  2 14:41:11 2020

@author: FliaSalinasRodriguez
"""

# Generación de 10 números aleatorios entre 1 y 100 sin repetición  

import random  
import numpy as np

lista = []
rand = random.sample(range(1,145), 144)
c = 0

for i in range(0,144,2):  
    lista.append(rand[i:i+2])
    c += 1
    print('Partido '+str(c)+':', end="")
    print(rand[i:i+2])

    


           

       
        
    
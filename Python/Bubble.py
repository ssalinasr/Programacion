# -*- coding: utf-8 -*-
"""
Created on Fri May 15 06:17:31 2020

@author: FliaSalinasRodriguez
"""

from random import randint

def bubble(array):
    beg = False
    interc = 0
    for i in array:
        if(not(beg) or interc > 0):
            for j in range (0,len(array)-1):
                if(array[j] > array[j+1]):
                     array[j] , array[j+1] = array[j+1] , array[j]
                     interc +=1
            beg = True  
    return array
                
lista = [None]*10

k = 0
rand = 0
while k < 10:
    rand = randint(0,500)
    lista[k] = rand
    k+=1

print(bubble(lista))




# -*- coding: utf-8 -*-
"""
Created on Tue May 19 11:01:36 2020

@author: FliaSalinasRodriguez
"""

def mayor(st):
    if(st%2==0):
        st = st//2
        cad = '1' * st
    elif(st%2!=0 and st>3):
        st = st - 3
        cad = '7'+('1' * st)
    elif(st==3):
        cad = '7'
    else:
        cad = '0'
               
    return cad

def menor(n):
    lista =[0,0,1,7,4,2,6,8,10,18,22,20,28,68] 
    c8 = int(n/7)
    c8 = c8-1
    pos = n%7+7
    if(n<14):
        return lista[n]
    else:
        cad = str(lista[pos])
        for i in range (c8):
            cad = cad + '8'
        
        return cad

pos=int(input())

'''
1 = 2p
2 = 5p 
3 = 5p
4 = 4p
5 = 5p
6 = 6p
7 = 3p
8 = 7p
9 = 6p
0 = 6p
'''

while(pos>0):
    sticks = int(input()) 
    print(mayor(sticks))
    print(menor(sticks))
    pos-=1

    





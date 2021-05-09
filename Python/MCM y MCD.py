# -*- coding: utf-8 -*-
"""
Created on Tue May 12 10:24:53 2020
"""
from random import randint

def mcm(n,m):
    return (n*m//mcd(n,m))
    
    
def mcd(n,m):
        if m == 0:
            return n
        else:
            return mcd(m, n%m)
        
        
def mcm_it(n,m):
    maximo=max(n,m)
    while(maximo%n !=0 or maximo%m !=0):
        maximo+=1
    return maximo
        

def mcd_it(n,m):
    minimo=min(n,m)
    for div in range(minimo,0,-1):
        if (n% div==0 and m%div==0):
            return div

rand1=randint(1,1000)
rand2=randint(1,1000)
print(mcm_it(rand1,rand2))
print(mcm(rand1,rand2))
print(mcd(rand1,rand2))
print(mcd_it(rand1,rand2))


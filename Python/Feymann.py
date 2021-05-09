# -*- coding: utf-8 -*-
"""
Created on Tue May 19 10:26:07 2020

@author: FliaSalinasRodriguez
"""

def feynmann(n):
    suma = 0
    while(n>0):
        suma += (n*n)
        n-= 1
    return suma
        
def feynmannR(n):
    if(n==1):
        return 1
    return (n*n)+feynmannR(n-1)

def feynmannF(n):
    return (n*(n+1)*(2*n+1))//6
    
stat = True
while(stat):
    val = int(input())
    if(val<=0):
        stat=False
    else:
        print(feynmannR(val))
    
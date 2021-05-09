# -*- coding: utf-8 -*-
"""
Created on Tue May 12 10:24:53 2020

@author: FliaSalinasRodriguez
"""
def factorial(n):
    if(n==0 or n==1):
        return 1;
    else:
        return n*factorial(n-1)
    
def sumaC(n):
    if(n==1):
        return 1
    return sumaC(n-1)+(n*n)
 
def fibonacci(n):
    if(n==0):
        return 0
    if(n==1):
        return 1
    return fibonacci(n-1)+fibonacci(n-2)

def mcm(n,m):
    return (n*m//mcd(n,m))
    
    
def mcd(n,m):
        if m == 0:
            return n
        else:
            return mcd(m, n%m)
        
        
def mcmi(n,m):
    maximo=max(n,m)
    while(maximo%n !=0 or maximo%m !=0):
        maximo+=1
    return maximo
        

def mcdi(n,m):
    for div in range(min(n,m),0,-1):
        if (n% div==0 and m%div==0):
            return div







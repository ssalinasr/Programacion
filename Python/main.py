# -*- coding: utf-8 -*-
"""
Created on Tue Jun  2 11:04:00 2020

@author: FliaSalinasRodriguez
"""
if __name__ == '__main__':
    
    n , m = map(int, input().split()) # N: Cantidad de puntos, M: Cantidad de caminos existentes entre dos puntos
    s , d = map(int, input().split()) # S: Punto de inicio, D: Punto de llegada

    for i in range(m):
        u , v, p  = map(int, input().split()) #U: Punto inicial del camino M, V: Punto final del camino M, P: Peso del camino M 

# -*- coding: utf-8 -*-
"""
Created on Mon May 11 10:48:51 2020

@author: FliaSalinasRodriguez
"""

import numpy as np

a=np.array([[3,5,5],[2,1,0],[4,2,8]])
bt=a.T
inver=np.linalg.inv(a)
deter=np.linalg.det(a)
traza=np.trace(a)
print("transpuesta:")
print(bt)
print("inversa:")
print(inver)
print("determinante:")
print(deter)
print("traza:")
print(traza)


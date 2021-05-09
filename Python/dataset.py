# -*- coding: utf-8 -*-
"""
Created on Mon May 11 11:19:29 2020

@author: FliaSalinasRodriguez
"""
import pandas as pd
import numpy as np

s=pd.Series(8., index=['a','b','c','d','e'])

d={'one':[1,2,3,4],'two':[5,6,7,8]}
df=pd.DataFrame(d,index=['a','b','c','d'])
print(df)

s2=np.array([[0,0,0],[1,1,1],[0,1,0]])
df2=pd.DataFrame(s2,columns=["one","two","three"])
print(df2)

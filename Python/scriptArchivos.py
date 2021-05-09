# -*- coding: utf-8 -*-
"""
Created on Fri Jul 31 14:20:01 2020

@author: FliaSalinasRodriguez
"""
import shutil
import pandas as pd

def to_lower(s):
    return s.lower()

dat = pd.read_csv("C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/data/legend.csv")
dat['emotion'] = dat['emotion'].apply(to_lower)
names = dat['image'].tolist()
types = dat['emotion'].tolist()

n = dat['emotion'].value_counts()

for i in range(13690):
    if(types[i]=='anger'):
        source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
        dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/anger/"+names[i]
        d = shutil.copy(source,dest)
    elif(types[i]=='contempt'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/contempt/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='disgust'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/disgust/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='fear'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/fear/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='happiness'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/happiness/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='neutral'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/neutral/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='sadness'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/sadness/"+names[i]
            d = shutil.copy(source,dest)
    elif(types[i]=='surprise'):
            source = "C:/Users/FliaSalinasRodriguez/.spyder-py3/RetoFinal/facial_expressions-master/images/"+names[i]
            dest = "C:/Users/FliaSalinasRodriguez/Documents/imgs/surprise/"+names[i]
            d = shutil.copy(source,dest)
            
        
        
    

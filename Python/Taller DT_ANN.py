# -*- coding: utf-8 -*-
"""
Created on Wed Jul 22 10:22:29 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd
from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.metrics import confusion_matrix
from sklearn.metrics import plot_confusion_matrix
import matplotlib.pyplot as plt

from sklearn.metrics import classification_report
from sklearn.metrics import accuracy_score 
from sklearn.metrics import precision_score
from sklearn.metrics import recall_score
from sklearn.metrics import f1_score
from sklearn.metrics import cohen_kappa_score 

dat = pd.read_csv('glass.data') #dataset numérico
digits = datasets.load_digits() #dataset de imágenes

'Árbol de decisión'
'-----------------------------------------------------------------------------'
'Dataset numérico'
'-----------------------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(dat.iloc[:,:10],dat.iloc[:,10:11],test_size=0.3, random_state=30)
clf = tree.DecisionTreeClassifier()
clf = clf.fit(x_train, y_train)
predict_num = clf.predict(x_test)

print(confusion_matrix(y_test,predict_num))  
plot_confusion_matrix(clf, x_test, y_test,cmap='bone')
plt.title('Matriz de confusión: dataset Numérico, Tree')  
plt.show()

print("Evaluación:")

print(classification_report(y_test,predict_num)) 

accuracy=accuracy_score(y_true=y_test, y_pred=predict_num)
print('Exactitud: %f' % accuracy)


precision=precision_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Precisión:', precision)

recall = recall_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Exhaustividad: %f' % recall)

f1 = f1_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('F1 score: %f' % f1)

kappa=cohen_kappa_score (y1= y_test, y2= predict_num)
print('Cohens kappa: %f' % kappa)
print()
'-----------------------------------------------------------------------------'

'Dataset de imágenes'
'-----------------------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(digits.data,digits.target)
clf = tree.DecisionTreeClassifier()
clf = clf.fit(x_train, y_train)
predict_img = clf.predict(x_test)

print(confusion_matrix(y_test,predict_img))  
plot_confusion_matrix(clf, x_test, y_test, cmap='Purples')
plt.title('Matriz de confusión: dataset Imagenes, Tree')  
plt.show()

print("Evaluación:")
print(classification_report(y_test,predict_img)) 

accuracy=accuracy_score(y_true=y_test, y_pred=predict_img)
print('Exactitud: %f' % accuracy)

precision=precision_score(y_true=y_test, y_pred=predict_img, average='weighted')
print('Precisión:', precision)


recall = recall_score(y_true=y_test, y_pred=predict_img, average='weighted')
print('Exhaustividad: %f' % recall)


f1 = f1_score(y_true=y_test, y_pred=predict_img, average='weighted')
print('F1 score: %f' % f1)

kappa=cohen_kappa_score (y1= y_test, y2= predict_img)
print('Cohens kappa: %f' % kappa)
print()
'-----------------------------------------------------------------------------'
'-----------------------------------------------------------------------------'

'Red Neuronal Artificial (MultiPerceptron Layer)'
'-----------------------------------------------------------------------------'
'Dataset numérico'
'-----------------------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(dat.iloc[:,:10],dat.iloc[:,10:11],test_size=0.35, random_state=45)

'Pre-procesamiento'
from sklearn.preprocessing import StandardScaler
scaler = StandardScaler()
scaler.fit(x_train)
x_train_scale = scaler.transform(x_train)
x_test_scale = scaler.transform(x_test)

from sklearn.neural_network import MLPClassifier
iterations=1500  
hidden_layers=[15,15,15] 
 
mlp = MLPClassifier(hidden_layer_sizes=(hidden_layers), max_iter=iterations) 
mlp.fit(x_train_scale, y_train) 
predict_num = mlp.predict(x_test_scale)  

print(confusion_matrix(y_test,predict_num))  
plot_confusion_matrix(mlp, x_test_scale, y_test, cmap='Reds')
plt.title('Matriz de confusión: dataset Numérico, MLP')  
plt.show()

print("Evaluación:")
print(classification_report(y_test,predict_num)) 


accuracy=accuracy_score(y_true=y_test, y_pred=predict_num)
print('Exactitud: %f' % accuracy)

precision=precision_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Precisión:', precision)

recall = recall_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Exhaustividad: %f' % recall)

f1 = f1_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('F1 score: %f' % f1)


kappa=cohen_kappa_score (y1= y_test, y2= predict_num)
print('Cohens kappa: %f' % kappa)
print()
'-----------------------------------------------------------------------------'

'Dataset de imágenes'
'-----------------------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(digits.data,digits.target,test_size=0.35, random_state=45)

'Pre-procesamiento'
from sklearn.preprocessing import StandardScaler
scaler = StandardScaler()
scaler.fit(x_train)
x_train_scale = scaler.transform(x_train)
x_test_scale = scaler.transform(x_test)

from sklearn.neural_network import MLPClassifier
iterations=1500  
hidden_layers=[15,15,15] 
 
mlp = MLPClassifier(hidden_layer_sizes=(hidden_layers), max_iter=iterations) 
mlp.fit(x_train_scale, y_train) 
predict_num = mlp.predict(x_test_scale)  

print(confusion_matrix(y_test,predict_num))  
plot_confusion_matrix(mlp, x_test_scale, y_test, cmap ='GnBu')
plt.title('Matriz de confusión: dataset Imagenes, MLP')
plt.show()

print("Evaluación:")
print(classification_report(y_test,predict_num)) 


accuracy=accuracy_score(y_true=y_test, y_pred=predict_num)
print('Exactitud: %f' % accuracy)

precision=precision_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Precisión:', precision)

recall = recall_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('Exhaustividad: %f' % recall)

f1 = f1_score(y_true=y_test, y_pred=predict_num, average='weighted')
print('F1 score: %f' % f1)


kappa=cohen_kappa_score (y1= y_test, y2= predict_num)
print('Cohens kappa: %f' % kappa)
print()
'-----------------------------------------------------------------------------'

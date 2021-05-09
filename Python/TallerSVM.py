# -*- coding: utf-8 -*-
"""
Created on Fri Jul 10 10:17:10 2020

@author: FliaSalinasRodriguez
"""

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

'Primer dataset, muchas instancias, pocos atributos'
'Categorías: (0,1)'
'-----------------------------------------------------------------'
dat = pd.read_excel('default of credit card clients.xls')
dat = dat.drop([0],axis = 0)
dat = dat.drop(['Unnamed: 0'],axis = 1)
dat = dat[:5000]
dat = dat.astype(int)

'-----------------------------------------------------------------'
'Segundo dataset, muchos atributos, pocas instancias'
'Categorías: (1,2)'
'-----------------------------------------------------------------'
dat2 = pd.read_excel('Z-Alizadeh sani dataset.xlsx') #Reemplazar categoría
dat2 = dat2.replace('Cad',1)
dat2 = dat2.replace('Normal',2)
dat2 = dat2.drop(['VHD','BBB'],axis=1)
dat2 = dat2.replace('Y',1)
dat2 = dat2.replace('N',0)
dat2 = dat2.replace('Male',5)
dat2 = dat2.replace('Fmale',10)
'-----------------------------------------------------------------'
'Tercer dataset, pocas instancias, pocos atributos'
'Categorías: (0.3[1],0.5[2],0.7[3])'
'-----------------------------------------------------------------'
dat3 = pd.read_csv('Container_Crane_Controller_Data_Set.csv')
dat3 = dat3.replace(0.3,1)
dat3 = dat3.replace(0.5,2)
dat3 = dat3.replace(0.7,3)
'-----------------------------------------------------------------'

'Parámetros a variar'
'-----------------------------------------------------------------'
C_i = [1,10,50,100]    
gamma_i = [1.5,3,0.5,'scale']
coef0_i = [0.2,1,5,25]
'-----------------------------------------------------------------'


#lineal(x,x')
#polinomial (g(x,x')+r)^d, d = degree, r=coef0
#rbf e^(-g||x-x'||^2), g = gamma g > 0
#sigmoidal tanh(g(x,x')+r) r = coef0

'Primer dataset'
'-----------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(dat.iloc[:,:23],dat.iloc[:,23:24])

for i in range(4):
    print('Prueba '+str(i+1)+': C= '+str(C_i[i])+', coef0= '+str(coef0_i[i])+' y gamma= '+str(gamma_i[i]))
    clf = SVC(C=C_i[i], kernel = 'rbf', gamma=gamma_i[i])
    clf.fit(x_train,y_train)
    scoreA = clf.score(x_test,y_test)
    print('Score con rbf: '+str(scoreA))
    print()

    clf = SVC(C=C_i[i], kernel = 'sigmoid', coef0 = coef0_i[i])
    clf.fit(x_train,y_train)
    scoreA = clf.score(x_test,y_test)
    print('Score con sigmoidal: '+str(scoreA))
    print()

'Para el tipo de kernel lineal y polinomial, el tiempo de respuesta en ejecución'
'es demasiado extenso, se hace uso de un C muy pequeño para su correcto funcionamiento'

for i in range(4):
    print('Prueba '+str(i+1)+': C= '+str(0.0000000000000000000000000001)+' y coef0= '+str(coef0_i[i]))
    clf = SVC(C=0.0000000000000000000000000001, kernel = 'linear')
    clf.fit(x_train,y_train)
    scoreA = clf.score(x_test,y_test)
    print('Score con lineal: '+str(scoreA)) #F
    print()

    clf = SVC(C=0.0000000000000000000000000001, kernel = 'poly', coef0 = coef0_i[i])
    clf.fit(x_train,y_train)
    scoreA = clf.score(x_test,y_test)
    print('Score con polinomial: '+str(scoreA)) #F
    print()
'-----------------------------------------------------------------'

'Segundo dataset'
'-----------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(dat2.iloc[:,:53],dat2.iloc[:,53:54])

for i in range(4):
    print('Prueba '+str(i+1)+': C= '+str(C_i[i])+', coef0= '+str(coef0_i[i])+' y gamma= '+str(gamma_i[i]))
    clf = SVC(C=C_i[i], kernel = 'rbf', gamma=gamma_i[i])
    clf.fit(x_train,y_train)
    scoreB = clf.score(x_test,y_test)
    print('Score con rbf: '+str(scoreB))
    print()

    clf = SVC(C=C_i[i], kernel = 'sigmoid', coef0=coef0_i[i])
    clf.fit(x_train,y_train)
    scoreB = clf.score(x_test,y_test)
    print('Score con sigmoidal: '+str(scoreB))
    print()
    
'Para el tipo de kernel lineal y polinomial, el tiempo de respuesta en ejecución'
'es demasiado extenso, se hace uso de un C muy pequeño para su funcionamiento'

for i in range(4):  
    print('Prueba '+str(i+1)+': C= '+str(0.0000000000000000000000000001)+' y coef0= '+str(coef0_i[i]))
    clf = SVC(C=0.0000000000000000000000000001, kernel = 'linear')
    clf.fit(x_train,y_train)
    scoreB = clf.score(x_test,y_test)
    print('Score con lineal: '+str(scoreB)) #F
    print()

    clf = SVC(C=0.0000000000000000000000000001,kernel = 'poly', coef0=coef0_i[i])
    clf.fit(x_train,y_train)
    scoreB = clf.score(x_test,y_test)
    print('Score con polinomial: '+str(scoreB)) #F
    print()

'-----------------------------------------------------------------'

'Tercer dataset'
'-----------------------------------------------------------------'
x_train, x_test, y_train, y_test = train_test_split(dat3.iloc[:,:2],dat3.iloc[:,2:3])

for i in range(4):
    print('Prueba '+str(i+1)+': C= '+str(C_i[i])+', coef0= '+str(coef0_i[i])+' y gamma= '+str(gamma_i[i]))
    clf = SVC(C=C_i[i], kernel = 'rbf', gamma=gamma_i[i])
    clf.fit(x_train,y_train)
    scoreC = clf.score(x_test,y_test)
    print('Score con rbf: '+str(scoreC))
    print()

    clf = SVC(C=C_i[i], kernel = 'sigmoid', coef0= coef0_i[i])
    clf.fit(x_train,y_train)
    scoreC = clf.score(x_test,y_test)
    print('Score con sigmoidal: '+str(scoreC))
    print()

    clf = SVC(C=C_i[i], kernel = 'linear')
    clf.fit(x_train,y_train)
    scoreC = clf.score(x_test,y_test)
    print('Score con lineal: '+str(scoreC))
    print()

    clf = SVC(C=C_i[i], kernel = 'poly', coef0= coef0_i[i])
    clf.fit(x_train,y_train)
    scoreC = clf.score(x_test,y_test)
    print('Score con polinomial: '+str(scoreC))
    print()
'-----------------------------------------------------------------'

'Conclusiones:'
print('Conclusiones:')
print()
print('1. Una baja cantidad de atributos y/o instancias, provoca que la '
      +'precisión de la SVM se reduzca considerablemente.')
print()

print('2. En los casos en donde se utiliza un kernel tipo lineal o polinomial '
      +'se requiere el uso de un valor C(penalización) muy bajo, si la cantidad de '
      +'atributos y/o instancias son mayores, esto debido a que un valor alto en C,'
      +'implica mayor tiempo de entrenamiento debido a la exigencia en reducir errorres.')
print()

print('3. Los kernel sigmoidal y rbf, son más precisos y más eficientes en tiempo de ejecución, '
      +'al ser aplicables en una mayor cantidad de datasets de prueba. A diferencia de los kernel '
      +'polinomial y lineal, que son aplicables, si la dimensión y clasificación de los datos es sencilla.'
      +'Como el caso del dataset 3, que se clasifica de acuerdo a dos atributos únicamente.')
print()

print('4. Como en el caso del método KNN, el uso de mayor cantidad de instancias, suele mejorar la precisión '
      +'en las predicciones del método SVM.')
print()

print('5. El uso del valor scale en gamma, supuso una mejora en la precisión de los kernel rbf y '
      +'sigmoidal, esto es visible en el dataset 1.')
print()

print('6. El cambio del valor de coef0 en los kernel polinomial y sigmoidal, no tuvo un resultado significativo,'
      +'sobre la precisión del método SVM, esto quizá por la dimensión de los datasets')
print()





# -*- coding: utf-8 -*-
"""
Created on Fri Jun  5 10:32:17 2020

@author: FliaSalinasRodriguez
"""
import numpy as np
from matplotlib import pyplot as plt

rng = np.random.default_rng()
size = 1000000

plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.plasma(np.linspace(0,1,2000)))
'Distribucion Normal'
loc = [0, 1, 2, -1, -2,-3]
scale = [0.2, 2.8, 6.3, 1.2, 0.1, 3.7]
plt.figure(figsize=(12, 15))
for i in range(6):
    normal = rng.normal(loc[i],scale[i],size)
    plt.subplot(3,2,i+1).set_title('center ='+str(loc[i])+'; width ='+str(scale[i]))
    plt.hist(normal)
plt.show()

print('Distribucion Normal:')
print('loc = centro de la curva , width = ancho de la curva')
print('1: loc=0, width=2; el centro de la curva se ubica en 0, la curva es de anchura 2')
print('2: loc=1, width=2.8; el centro se desplaza 1, la curva es de anchura 2.8 ahora')
print('3: loc=2, width=6.3; el centro se desplaza 1, la curva es de anchura 6.3 ahora')
print('4: loc=-1, width=1.2; el centro se desplaza -3, la curva es de anchura 1.2 ahora')
print('5: loc=-2, width=0.1; el centro se desplaza -1, la curva es de anchura 0.1 ahora')
print('6: loc=-3, width=3.7; el centro se desplaza -1, la curva es de anchura 3.7 ahora')
print('Conclusion: si el ancho es más pequeño, los valores se encuentran distribuidos de forma más \n ordenada sobre el centro')
print()
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.cividis(np.linspace(0,1,2000)))
'Distribucion de laplace'
peak = [0, 0.5, 1, -0.5, -1, 2 , -2 , 0]
scale = [1, 2, 2.5, 3, 3.5 , 1.8, 1.5, 0.5]
plt.figure(figsize=(12, 15))
for i in range(8):
    laplace = rng.laplace(peak[i],scale[i],size)
    plt.subplot(4,2,i+1).set_title('peak ='+str(peak[i])+'; exp.decay ='+str(scale[i]))
    plt.hist(laplace)
plt.show()
    
print('Distribucion de Laplace:')
print('loc = pico de la curva , scale = Caida exponencial de la curva')
print('1: loc=0, scale=1; el pico de la curva se ubica en 0, la caida exponencial es de 1')
print('2: loc=0.5, scale=2; el centro se desplaza 0.5, la caida exponencial es de 2 ahora')
print('3: loc=1, scale=2.5; el centro se desplaza 0.5, la caida exponencial es de 2.5 ahora')
print('4: loc=-0.5, scale=3; el centro se desplaza -1.5, la caida exponencial es de 3 ahora')
print('5: loc= -1, scale=3.5; el centro se desplaza -0.5, la caida exponencial es de 3.5 ahora')
print('6: loc= 2, scale=1.8; el centro se desplaza 3, la caida exponencial es de 1.8 ahora')
print('7: loc=-2, scale=1.5; el centro se desplaza -4,la caida exponencial es de 1.5 ahora')
print('8: loc= 0, scale=0.5; el centro se desplaza 2, la caida exponencial es de 0.5 ahora')
print('Conclusion: A medida que la caida exponencial aumenta, los datos tienden a concentrarse sobre el pico de la curva')
print()

plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.magma(np.linspace(0,1,2000)))
'Distribucion Gamma'
shape = [1, 2, 3, 5, 9, 16]
scale = [0.1, 1, 0.2, 0.9, 0.3 , 0.8]
plt.figure(figsize=(12, 15))
for i in range(6):
    gamma = rng.gamma(shape[i],scale[i],size)
    plt.subplot(3,2,i+1).set_title('shape ='+str(shape[i])+'; scale ='+str(scale[i]))
    plt.hist(gamma)
plt.show()

print('Distribucion Gamma:')
print('shape = forma de la curva , scale = escala de la curva')
print('1: shape=1, scale=0.1; la forma de la curva es 0, su escala es de 0.1')
print('2: shape=2, scale=1; la forma de la curva es ahora 2, su escala es de 1')
print('3: shape=3, scale=0.2; la forma de la curva es ahora 3, su escala es de 0.2')
print('4: shape=5, scale=0.9; la forma de la curva es ahora 5, su escala es de 0.9')
print('5: shape=9, scale=0.3; la forma de la curva es ahora 9, su escala es de 0.3')
print('6: shape=16, scale=0.8; la forma de la curva es ahora 16, su escala es de 0.8')
print('Conclusion: Si la escala es más alta, los datos dejan de concentrarse de forma uniforme sobre \n el centro.')
print()
plt.rcParams["axes.prop_cycle"] = plt.cycler("color", plt.cm.inferno(np.linspace(0,1,2000)))
'Distribucion Poisson'
lam = [1, 4, 7, 10, 15, 36]
plt.figure(figsize=(12, 15))
for i in range(6):
    poisson = rng.poisson(lam[i],size)
    plt.subplot(3,2,i+1).set_title('lam ='+str(lam[i]))
    plt.hist(poisson)
plt.show()

print('Distribucion Poisson:')
print('lam = cantidad esperada de que se encuentre ese valor')
print('1: lam=1; se ubica el valor esperado en 1')
print('2: lam=4; se ubica el valor esperado en 4')
print('3: lam=7; se ubica el valor esperado en 7')
print('4: lam=10; se ubica el valor esperado en 10')
print('5: lam=15; se ubica el valor esperado en 15')
print('6: lam=36; se ubica el valor esperado en 36')
print('Conclusion: A medida que lambda aumenta, la concentracion de valores se distribuye en el rango que cubre \n a lambda, y no únicamente sobre lambda')
print()
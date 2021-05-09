# -*- coding: utf-8 -*-
"""
Created on Sat Oct 10 15:38:48 2020

@author: FliaSalinasRodriguez
"""

from __future__ import division
from sympy import *
from IPython.display import Markdown as md
from IPython.display import display
from sympy import solve_poly_inequality, reduce_abs_inequality
from sympy.solvers.inequalities import solve_univariate_inequality, reduce_rational_inequalities
from sympy.parsing.latex import parse_latex

x, y, z, t = symbols('x y z t')
k, m, n = symbols('k m n', integer=True)
f, g, h = symbols('f g h', cls=Function)
init_printing(use_latex=False)
X1,X2=symbols('X1 X2')


eq4 = plot_implicit(y<=5, (x,-10,10), (y,-10,10), line_color = 'b', show = True, title = 'Región solución: y<=5')

eq1 = plot_implicit(2*x+3*y<=60, (x,-40,40), (y,-40,40), line_color = 'g', show = True, title = 'Ecuación 1 : 2*x+3*y<=60')
eq2 = plot_implicit(x>=0, (x,-40,40), (y,-40,40), line_color = 'y', show = True, title = 'Ecuación 2: x>=0')
eq3 = plot_implicit(y>=0, (x,-40,40), (y,-40,40), line_color = 'r', show = True, title = 'Ecuación 3: y>=0')

solution = plot_implicit(And(2*x+3*y<=60,x>=0, y>=0 ) , (x,-5,40), (y,-5,40), line_color = 'b', show = True, 
                         title = 'Región solución ecuaciones 1, 2 y 3')
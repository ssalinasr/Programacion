import tkinter as tk
import numpy as np
import matplotlib.pyplot as plt
plt.style.use('ggplot')
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
from scipy.stats import geom
import statistics as st

def geometric(p):
    x = np.arange(geom.ppf(0.01, float(p)),
              geom.ppf(0.99, float(p)))
    
    print('Con valor p='+str(p))
    print('Mediana: '+  str(st.median(x)))
    print('Media: '+ str(st.mean(x)))
    print('Varianza: ' + str(st.variance(x)))
    print('Desv.Estándar: '+ str(np.std(x)))
    print()
    
    ax.plot
    ax.clear()
    ax.plot(x, geom.pmf(x, float(p)), 'bo', ms=8, label='geom pmf'), ax.grid(True)
    ax.set_xlabel('# de eventos'),ax.set_ylabel('Probabilidad')
    ax.set_title('Distribución Geométrica')
    line.draw()
    

#--- Raiz ---
root = tk.Tk()
root.geometry('940x450')
root.title("Gráfica")
#------------

#-- Frames ---
left_frame = tk.Frame(root)
left_frame.place(relx=0.03, rely=0.05, relwidth=0.25, relheight=0.9)

right_frame = tk.Frame(root, bg='#C0C0C0', bd=1.5)
right_frame.place(relx=0.3, rely=0.05, relwidth=0.65, relheight=0.9)
#---------------

#--- Agregar figura ---
figure = plt.Figure(figsize=(5,6), dpi=100)
ax = figure.add_subplot(111)
ax.grid(True),ax.set_xlabel('# de eventos'),ax.set_ylabel('Probabilidad')
ax.set_title('Distribución geométrica')
line = FigureCanvasTkAgg(figure, right_frame)
line.get_tk_widget().pack(side=tk.LEFT, fill=tk.BOTH,expand=1)
#----------------------

#--- Botones ---
RH = 0.05

B0 = tk.Button(left_frame,text="Calcular",command = lambda: geometric(B2.get()))
B0.place(relheight=RH, relwidth=1)

B1 = tk.Button(left_frame,text="Salir",command = root.destroy)
B1.place(rely=(0.1 + RH*1.44) ,relheight=RH, relwidth=1)

B2 = tk.Entry(left_frame)
B2.place(rely=(0.1 + RH*0.01) ,relheight=RH, relwidth=1)


#------------
root.mainloop()


from graficos.Ventana import Ventana
from modelo.figuras.Cuadrilatero import Cuadrilatero
from modelo.figuras.Circulo import Circulo
global ventana

if __name__ == '__main__':
    ventana = Ventana('MiniPaint')
    c = Cuadrilatero(100,100,1,'red',25,30)
    circ = Circulo(150,180,3,"white",100)
    c.dibujar(ventana.canvas)
    circ.dibujar(ventana.canvas)
    ventana.ventana.mainloop()



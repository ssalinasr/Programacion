from modelo.figuras.Figura import Figura
import math


class Circulo(Figura):
    def dibujar(self, lienzo):
        lienzo.create_oval(self.posX-self.radio, self.posY-self.radio, 2*self.radio, 2*self.radio, fill=self.color, width=self.grosor)

    def __init__(self,posx,posy,grosor,color,radio):
        Figura.__init__(self,posx,posy,grosor,color)
        self.radio = radio

    def calcularPerimetro(self):
        return 2*self.radio*math.pi

    def calcularArea(self):
        return math.pow(self.radio, 2)*math.pi
from modelo.figuras.Figura import Figura


class Cuadrilatero(Figura):
    def dibujar(self, lienzo):
        lienzo.create_rectangle(self.posX, self.posY, self.ancho, self.alto, fill=self.color)

    def __init__(self,posx,posy,grosor,color,ancho,alto):
        Figura.__init__(self,posx,posy,grosor,color)
        self.ancho = ancho
        self.alto = alto

    def calcularPerimetro(self):
        return 2*self.alto+2*self.ancho

    def calcularArea(self):
        return self.alto*self.ancho
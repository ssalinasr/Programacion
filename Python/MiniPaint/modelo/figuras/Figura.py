import abc
from abc import ABCMeta

class Figura(object):
    __metaclass__ = ABCMeta
    def __init__(self, posx, posy, grosor, color):
        self.posX = posx
        self.posY = posy
        self.grosor = grosor
        self.color = color

    @abc.abstractmethod
    def calcularArea(self):
        pass

    @abc.abstractmethod
    def calcularPerimetro(self):
        pass

    @abc.abstractmethod
    def dibujar(self, lienzo):
        pass
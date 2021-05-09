from tkinter import *
from tkinter import ttk

class Ventana:
    def __init__(self, titulo):
        self.ventana = Tk()
        self.ventana.geometry('700x500')
        self.ventana.configure(bg='AliceBlue')
        self.ventana.title(titulo)
        self.canvas = Canvas(self.ventana, width=400,height=300, bg='black')
        self.canvas.pack()
        ttk.Button(self.ventana, text='Salir', command=self.ventana.destroy).pack(side=BOTTOM)

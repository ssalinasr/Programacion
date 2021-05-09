# -*- coding: utf-8 -*-
"""
Created on Fri Jun 12 07:24:01 2020

@author: FliaSalinasRodriguez
"""

from sys import stdin
if __name__ == "__main__":
  contenedores = stdin.readline()[:-1]
  caso=0
  while (contenedores != "end"):
    pilas = []
    for i in contenedores:
      if len(pilas) == 0:
        pilas.append(i)
      else:
        dondeColocar = 26
        disCorta = 26
        for j in pilas:
          if j == i:
            dondeColocar = pilas.index(j)
            break
          else:
            if i<j:
              if ord(j)-ord(i) < disCorta:
                disCorta = ord(j)-ord(i)
                dondeColocar = pilas.index(j)
        if dondeColocar < 26:
          pilas[dondeColocar] = i
        else:
          pilas.append(i)
    caso = caso + 1
    print('Case ' + str(caso) + ': ' + str(len(pilas) ) )
    contenedores = stdin.readline()[:-1]
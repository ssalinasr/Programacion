def evaluar_pos(expresion):
  
  simbolos = expresion.split()
  pilaOperandos = []
  for x in simbolos:
    if x not in "*/+-^": # Agregar números a la pila
      pilaOperandos.append(float(x))
    else: # Evaluación de operaciones
      if x == "*":
          aux = pilaOperandos[-2]*pilaOperandos[-1]
      elif x == "/":
          aux = pilaOperandos[-2]/pilaOperandos[-1]
      elif x == "+":
          aux = pilaOperandos[-2]+pilaOperandos[-1]
      elif x == "^":
          aux = pilaOperandos[-2]**pilaOperandos[-1]
      elif x == "-":
          aux = pilaOperandos[-2]-pilaOperandos[-1]
      
      pilaOperandos.pop()
      pilaOperandos.pop()
      pilaOperandos.append(aux)
  # retorno de resultados
  if len(pilaOperandos)!=1:
      return "La expresión sufija no era correcta" 
  else:
    return pilaOperandos.pop() 


def conversion(expresion):
  precedencia = {}
  precedencia["^"] = 4
  precedencia["*"] = 3
  precedencia["/"] = 3
  precedencia["+"] = 2
  precedencia["-"] = 2
  precedencia["("] = 1
  
  pilaOperadores = []
  listaSufija = []
  listaSimbolos = expresion.split()
  
  for simbolo in listaSimbolos:
    if simbolo not in "*/+-()^":
      listaSufija.append(simbolo)
    elif simbolo == "(":
      pilaOperadores.append(simbolo)
    elif simbolo == ")":
      simboloTope = pilaOperadores.pop()
      while simboloTope !=  "(":
        listaSufija.append(simboloTope)
        simboloTope = pilaOperadores.pop()
    else:
      while (not len(pilaOperadores)==0) and (precedencia[pilaOperadores[-1]] >= precedencia[simbolo]):
        listaSufija.append(pilaOperadores.pop())
      pilaOperadores.append(simbolo)
  while len(pilaOperadores) != 0:
    listaSufija.append(pilaOperadores.pop())
  return " ".join(listaSufija) 



print(evaluar_pos(conversion("2 * 3 + 6 * 1")))
print(conversion("( 1 + 2 ) * 3 - ( 4 - 5 ) * ( 6 + 7 )"))
#conversion("27 / 9 - 3 * 3 + 7")
print(evaluar_pos(conversion("( 9 + 3 ) / 6 "))) 
print(evaluar_pos("9 3 + 6 / ")) 
print(evaluar_pos(conversion("27 / 9 - 3 * 3 + 7")))

#ya estuvo no? yo diria que si :)
# :v 
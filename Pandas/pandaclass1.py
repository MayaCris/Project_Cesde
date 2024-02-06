
#Las series son listas, tuplas o lista que tiene adentro diccionarios
#La serie está etiquetada

#Un dataframe es un diccionario
# parentesis () = Tuplas
# [] Corchetes = Listas
# {} Llaves = Diccionarios
import pandas as pd

print(f'Imprime lista de Python')
nameStudent = ['Melissa', 'Mateo', 'David', 'Alejandro']
print(nameStudent)

print(f'Imprime las series tomadas en pandas')
serieNames =pd.Series(nameStudent)
print(serieNames)

#Imprimir un elemento de la serie
print(f'Imprimir un elemento de la serie, dando la posición')
print(len(serieNames))
print(serieNames [len(serieNames)-2])



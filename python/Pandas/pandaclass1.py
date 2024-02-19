
#Las series son listas, tuplas o lista que tiene adentro diccionarios
#La serie está etiquetada

#Un dataframe es un diccionario
# parentesis () = Tuplas
# [] Corchetes = Listas
# {} Llaves = Diccionarios
import pandas as pd

print(f'Imprime lista de Python')
datos = {
    "nombres": ["Juan", "Laura","Clara", "melissa"],
    "edad": [10,20,30,35],
    "ciudad":["Bogota", "Medellin", "Cali", "Barranquilla"]
}
print(datos)

print(f'Imprime las series tomadas en pandas')
dfdatos = pd.DataFrame(datos)
print(dfdatos)
print("___________________________________________")
print(dfdatos.head(1))
print("___________________________________________")
print(dfdatos["nombres"])
print(len(dfdatos["edad"]))
print("___________________________________________")
print(dfdatos.info())
print(dfdatos["edad"] > 20)
print("___________________________________________")
#print(dfdatos[dfdatos["edad" > 20]])

dfdatos["genero"] = ["M","F","F","F"]
print(dfdatos)



#Imprimir un elemento de la serie
#print(f'Imprimir un elemento de la serie, dando la posición')
#print(len(serieNames))
#print(serieNames [len(serieNames)-2])



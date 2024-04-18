import random
import pandas as pd

# Definir variables
numero_filas = 980
nombres_columnas = ["Nombres", "Lenguaje", "Nota"]

# Generar datos aleatorios
nombres = ["Ana", "Juan", "Maria", "Pedro", "Sofia", "David", "Laura", "Carlos", "Camila", "Martin"]
lenguajes = ["Python", "HTML", "CSS"]

datos_aleatorios = []
for i in range(numero_filas):
    fila = []
    # Nombre aleatorio
    nombre = random.choice(nombres)
    fila.append(nombre)
    # Lenguaje aleatorio
    lenguaje = random.choice(lenguajes)
    fila.append(lenguaje)
    # Nota aleatoria entre 1 y 5
    nota = round(random.uniform(1, 5), 1)
    fila.append(nota)
    datos_aleatorios.append(fila)

# Crear DataFrame
df = pd.DataFrame(datos_aleatorios, columns=nombres_columnas)

# Exportar DataFrame a archivo CSV
df.to_csv("notas.csv")

print("Archivo notas.csv creado con éxito!")
import pandas as pd

def series():
    # serie en pandas ----> listas o tuplas
    # nombreEstudiante = pd.Series(['Mateo','Felipe','Alejandra','Juan','Cristian'])
    # estudiantes = pd.DataFrame(
    #     {'Name': ['Geraldin', 'Esther', 'Patricio', 'Cristian', 'Juan'], 'Id': [123, 456, 789, 987, 654],
    #      'Carrera': ['Ingenieria', 'Sistemas', 'Contabilidad', 'Programacion', 'Derecho'], 'nota': [4, 5, 3, 4, 5]})
    # print(estudiantes)
    pass




def leercsv():
    df = pd.read_csv("notas.csv")
    print(df.tail(10))

if __name__ == '__main__':
    leercsv()

# mockaroo.com Página para generar datos
# https://www.kaggle.com/ Pagina para obtener datos
# https://www.youtube.com/watch?v=2KCQQHpi2Qk&list=PLg9145ptuAig5cwvUCn9FNSUJyXBiFcVg
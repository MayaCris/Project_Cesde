def Valcontraseña():
    contra = "contrasena"
    passw = str(input("Digite su contraseña "))

    if  contra == passw.lower():
        print("Contraseña correcta")

    else:
        print("Contraseña incorrecta")


def EjercDivision():
    print("Algoritmo para realizar una división")
    Dividendo = int(input("Digite el dividendo "))
    Divisor = int(input("Digite el divisor "))


    if  Divisor == 0:
        print("Error. No se puede dividir por cero")

    else:
        Division = Dividendo / Divisor
        print(f'El resultado de la división es {Division}')


def NumEntero():
    print("Validación de número par o impar")
    numb = float(input("Digite el número a validar "))


    if  numb % 2 == 0:
        print("El número es par")
    else:
        print("El número es impar")



def Dicciona():

    Nom = str(input("Digite su nombre "))
    edad1 = int(input("Digite su edad "))
    dir = str(input("Digite su dirección "))
    tel = int(input("Digite su telefono "))

    informacion = {"Nombre": Nom, "edad":edad1, "direccion": dir, "telefono": tel}

    print(informacion['Nombre'], 'tiene', informacion['edad'], 'años')

def Diccio():
    nombre = input('¿Cómo te llamas? ')
    edad = input('¿Cuántos años tienes? ')
    direccion = input('¿Cuál es tu dirección? ')
    telefono = input('¿Cuál es tu número de teléfono? ')
    persona = {'nombre': nombre, 'edad': edad, 'direccion': direccion, 'telefono': telefono}

    print(persona['nombre'], 'tiene', persona['edad'], 'años, vive en', persona['direccion'],
          'y su número de teléfono es', persona['telefono'])


def Cadena():
    nombre = input("introduzca su nombre ")

    conteo = len(nombre)
    print(f'Su nombre es {nombre} y tiene {conteo} caracteres')


#Crear un diccionario de cualquier objeto. Una key del diccionario es una lista.
#Luego, agregar key que se llame precio
#Eliminar cualquier key
#Consultar como imprimir un diccionario con el ciclo For

def CyberAttacks():
    Attacks = {'malware':['troyano','virus','gusano','rasonware'], 'ataques de red':'DDoS', 'inyeccion':'XSS', 'social':'phishing'}
    print(Attacks)
    print("Incluir la nueva key 'Costo'")
    Attacks.update({'costo': 2000})
    print(Attacks)
    del Attacks['social']
    print(Attacks)

    for list in Attacks:
        print(list)
        




if __name__ == '__main__':
    CyberAttacks()


def Saludo():
    print("Holaaaaaa")

def SaludoName(name):
    print(f"Hola {name} como estás?")
    name = str(input("Digite su nombre: "))


def Multiplicar():
    valor1 = int(input("Valor 1: "))
    valor2 = int(input("Valor 2: "))
    resultado = valor1*valor2
    return resultado

def Validacion(x):
    if x >= 10:
        print("Es mayor que 10")
    else:
        print("Es menor que 10")

def menu():

    opcion = int(input("\t1. Sumar\n\t2. Restar \n\t3. Multiplicar \n\t4. Dividir\n\t Ingrese una de las opciones: "))
    while (opcion != 0):
        if  opcion == 1:
            suma()
        elif opcion == 2:
            resta()
        elif opcion == 3:
            multiplicar()

        elif opcion == 4:
            dividir()
        else:
            print("Ingrese una opción valida")


def numeros():
    valor1 = int(input("Ingrese el valor 1: "))
    valor2 = int(input("Ingrese el valor 2: "))
    return valor1, valor2



def suma():
    valores = numeros()
    adition = valores[0] + valores[1]
    print(valores)
    print(adition)
    return adition

def resta():
    print("Resta")

def multiplicar():
    print("Mult")
def dividir():
    print("Divid")

if __name__ == '__main__':
    menu()




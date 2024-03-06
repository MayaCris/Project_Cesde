def Saludo():
    print("Holaaaaaa")


def SaludoName(name):
    print(f"Hola {name} como estás?")
    name = str(input("Digite su nombre: "))


def Multiplicar():
    valor1 = int(input("Valor 1: "))
    valor2 = int(input("Valor 2: "))
    resultado = valor1 * valor2
    return resultado


def Validacion(x):
    if x >= 10:
        print("Es mayor que 10")
    else:
        print("Es menor que 10")


def Menu():
    print("┌" + "".center(35, "─") + "┐")
    print("|" + "Calculadora".center(35, " ") + "|")
    print("└" + "".center(35, "─") + "┘")

    opcion = int(input(
        "\t1. Sumar\n\t2. Restar \n\t3. Multiplicar \n\t4. Dividir\n\t5. Salir \n\t  Ingrese una de las opciones: "))
    Validar(opcion)

    while (True):
        if opcion == 1:
            Suma()
            Menu()

        elif opcion == 2:
            Resta()
            Menu()

        elif opcion == 3:
            Multiplicar()
            Menu()

        elif opcion == 4:
            Dividir()
            Menu()

        elif opcion == 5:
            break


        else:
            print("Ingrese una opción valida")
            Menu()


def numeros():
    valor1 = float(input("Ingrese el valor 1: "))
    valor2 = float(input("Ingrese el valor 2: "))
    return valor1, valor2


def Suma():
    valores = numeros()
    adition = valores[0] + valores[1]
    print(valores)
    print(f"El resultado de la operación es: {adition}")
    return adition


def Resta():
    valores = numeros()
    rest = valores[0] + valores[1]
    print(valores)
    print(f"El resultado de la operación es: {rest}")


def Multiplicar():
    valores = numeros()
    mult = valores[0] + valores[1]
    print(valores)
    print(f"El resultado de la operación es: {mult}")


def Dividir():
    Valores = numeros()
    if Valores[1] != 0:
        division = Valores[0] / Valores[1]
        print(f"El resultado de la operación es: {division}")
    else:
        print("No se puede realizar la operación")


def Validar(opcion):
    if opcion >= 1 and opcion <= 5:
        print("Voy bien")
    else:
        print("Concentrado. Error en Nro. Intente nuevamente")
        Menu()


if __name__ == '__main__':
    Menu()




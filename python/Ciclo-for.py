#for i in "python":
    #print(i)

#Realizar un programa que imprima la tabla de multiplicar del 123

def num():
    number= 8 % 2
    return number

def cicloFor():
    multiplo = int(input("Digite el numero a multiplicar"))
    for i in range (11):
        print(f'Tabla = {multiplo} * {i} = {i*multiplo}')

def forLetra():
    palabra = "Desarrollo"

    for i in palabra:
        print(i)

def ventas():

    acumuVentasMenos = 0
    acumuVentasMayores = 0
    contVentasMenos = 0
    contVentasMayores = 0
    acumVentas = 0

    print("----Registro de ventas----")

    for i in range (2):
        nombrePro = input("Producto -->")
        precio = int(input("Precio -->"))
        cantidad = int(input("Cantidad -->"))
        subtotal = precio * cantidad
        print(f"Subtotal --> {subtotal} \n")
        if (subtotal > 2000000):
            contVentasMayores = contVentasMayores + 1
            acumuVentasMayores = acumuVentasMayores + subtotal

        else:
            contVentasMenos = contVentasMenos + 1
            acumuVentasMenos =  acumuVentasMenos + subtotal
        acumVentas = acumVentas + subtotal

    print("---------------------------------------------------------")
    print("      RESUMEN VENTAS DEL DIA")
    print(f" Total ventas               ----> {acumVentas}")
    print(f"Total ventas Mayores        ----> {acumuVentasMayores}")
    print(f"Total ventas Menores        ----> {acumuVentasMenos}")
    print(f"Cantidad de ventas mayores  ----> {contVentasMayores}")
    print(f"Cantidad de ventas menores  ----> {contVentasMenos}")
    print("---------------------------------------------------------")


def clasep():
    notas = []
    name = []
    ganadores = []
    perdedores = []
    print("Bienvenido al Cesde")
    name.append(input("Digite el nombre del estudiante"))

    menu = int(input(f"""Ingrese una de las siguientes opciones de materias:
                        1. Python
                        2. Logica"""))
    while menu != 0:
        if (menu = 1):
            nota = float(input("Ingrese la nota: "))
            if (nota > 3.0):
                ganadores.append(name)
                contarganadores = len(ganadores)
            else:
                perdedores.append(name)






if __name__ == '__main__':
    #cicloFor()
    #forLetra()
    ventas()
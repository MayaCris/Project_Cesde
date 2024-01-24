def menu():
    print("____________________________________")
    print("Desarrollador. Cristian Maya")
    print("Tema. Introducción")
    print("Correo cmaya@cesde.net")
    print("____________________________________")


def Concatenar():
    print("Concatenar es le comando que me permite unir un texto")
    mensaje1 ="como estas........."
    mensaje2 ="Bienvenido al curso de Python"
    nombre ="Cristian"
    print(mensaje1)
    print(mensaje2)
    print(mensaje1 + mensaje2)
    print(f'Hola {nombre} {mensaje1} {mensaje2}')

def sumar():
    nro1 = int(input("Digite nro 1 -> "))
    nro2 = int(input("Digite nro 2 -> "))
    suma = nro1 + nro2
    print(f'{nro1} + {nro2} = {suma}')


def Colilla_de_pago():
    Name = input("Digite su nombre ->")
    Salary = int(input("Digite su salario ->"))
    Child = int(input("Digite cuantos hijos tiene ->"))
    Valordia = int(Salary / 30)
    Valorhora = int(Valordia / 8)
    Bonificacion = int(Child * Valorhora * 20)
    Neto = Salary + Bonificacion
    print(f"""      
        ┌────────────────────────────────────────────────┐
         Empresa EL EJEMPLO SAS
         ________________________________________________

         Colilla de pago de    {Name}
         Su salario es de      {Salary}
         Cantidad de hijos     {Child}
         Su bonificación es de {Bonificacion}
         ________________________________________________
         Por tanto, el valor neto a pagar es de {Neto}
        └────────────────────────────────────────────────┘                                               
                                                        """)

def CadenaString():
    mensaje = "    hola... Bienvenido al curso de Python            "
    print(mensaje)
    print(mensaje.upper()) #pasa todas las letras a Mayusculas
    print(mensaje.lower()) #Pasa todas las letras a minusculas
    print(mensaje.title()) #Pasa la primera letra de cada palabra a Mayuscula


def condicional():

    print(" *** COMPARAR DOS NROS ***")
    nro1 = int(input("Nro 1 -->"))
    nro2 = int(input("Nro 2 -->"))

    if (nro1 > nro2):

        print("el número 1 es mayor")
        print(f'{nro1} es mayor que {nro2}')

    else:
        print("el número 2 es mayor")
        print(f'{nro2} es mayor que {nro1}')



def NotaFinal():
    name1 = str(input("Digite su nombre "))
    nota1 = float(input("Digite su primer nota "))
    nota2 = float(input("Digite su segunda nota "))
    nota3 = float(input("Digite su tercer nota "))

    notaprom = (nota1 + nota2 + nota3) / 3

    print(f'{name1} su nota definitiva es {notaprom}')

    if (notaprom > 3):
        print("Felicidades, ganó el semestre")
    else:
        print("Lastimosamente, perdió la materia")


def Factura():
    producto = str(input( "Digite el producto "))
    cantidad = int(input("Digite la cantidad "))
    precio = int(input( "Digite el precio unitario "))

    subtotal = cantidad * precio

    if (cantidad > 20):
        descuento = subtotal * 0.20
    else:
        descuento = subtotal * 0.05

    iva = (subtotal - descuento) * 0.19
    netopago = subtotal - descuento + iva

    print(f'Producto         ----> {producto}')
    print(f'Precio           ----> {precio}')
    print(f'Cantidad         ----> {cantidad}')
    print(f'Subtotal         ----> {subtotal}')
    print(f'Descuento        ----> {descuento}')
    print(f'IVA              ----> {iva}')
    print(f'Neto a pagar     ----> {netopago}')


def CadenasTxt():
    cadena = "Manejo de cadenas de texto "
    print("Mensaje en MAYUSCULAS ---->", cadena.upper())
    print("Mensaje en minúsculas ---->", cadena.lower())
    print("Tamaño del texto ---->", len(cadena))
    print("Texto en primera mayúscula ---->", cadena.title())

    print("\n\n\n")

    cadena = "Cambie la cadena de texto "
    print("Mensaje en MAYUSCULAS ---->", cadena.upper())
    print("Mensaje en minúsculas ---->", cadena.lower())
    print("Tamaño del texto ---->", len(cadena))
    print("Texto en primera mayúscula ---->", cadena.title())


def Listas():

    nombres =['Melissa', 'Mateo', 'Geraldin','Esther', 'Felipe']
    print("Elementos de la lista ---->", nombres)
    print("Primer elemento de la lista", nombres[0])
    print("Ultimo elemento de la lista", nombres[4])
    print("Tamaño de la lista --->", len(nombres))
    nombres.append("David")
    print("Segundo tamaño de la lista --->", len(nombres))
    print("Ultimo elemento de la lista ", nombres[len(nombres)-1])
    print("Elementos de la lista ---->", nombres)

    nombres.sort()
    print("Elementos de la lista ordenada de la a -z ---->", nombres)

    nombres.reverse()
    print("Elementos de la lista ordenada de la z -a ---->", nombres)

if __name__ == '__main__':
    Listas()


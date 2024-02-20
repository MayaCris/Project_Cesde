#Librerías
import pandas as pd

#Variables globales
option1 = 0
option2 = 0
users = []
user: {}
costAdult = 0
costChildren = 0

#Función principal del programa
def main():
    #Imprime mensaje de bienvenida
    print("Bienvenido a la agencia de viajes XYZ")
    print("En donde todos tus sueños se hacen realidad")
    #Se crea el for para el ingreso de 10 usuarios
    for i in range(10):
        #Se llama a la función menu() para que muestre el menu principal
        menu()

        #Se crea el desarrollo de cada una de las opciones descritas en el menu
        if option1 == 1:
            #Integramos el diccionario user{} dentro de la función main() para poderle ingresar datos
            user = {}
            #Se crea la llave "name" en el diccionario y en el valor se almacena el input
            user["name"] = str(input("Ingrese su nombre:-----------------------------------> "))
            #Se crea la llave "quantityAdult" en el diccionario y en el valor se almacena el input
            user["quantityAdult"] = int(input("Ingrese la cantidad de personas adultas:-------------> "))
            #Se crea la llave "quantityChildren" en el diccionario y en el valor se almacena el input
            user["quantityChildren"] = int(input("Ingrese la cantidad de niños (menores de 12 años):---> "))
            #funciónque muestra las opciones de destino vigentes
            destiny()
            #Llama a la función subtotal que requiere el argumento "user" (la información en el diccionario) para ejecutarse
            subtotal(user)
            #Agrega toda la información del diccionario user{} a la lista users[]
            users.append(user)
            print("Cotización registrada con exito")

        #Esta opción llama la función para imprimir la cotización
        elif option1 == 2:
            printquote()

        #Esta opción imprime el reporte según lo requerido
        elif option1 == 3:
            reports()

        #Esta opción finaliza el programa
        elif option1 == 4:
            break

        #Esta opción retorna al menu en caso de ingresar un número diferente
        else:
            print("Ingrese una opción válida")
            menu()

#Función que muestra el menú principal y permite ingresar un input
def menu():
    print("\nIngrese una de las siguientes opciones")
    print("1. Realizar cotización")
    print("2. Ver cotizaciones")
    print("3. Ver reportes")
    print("4. Salir")
    global option1
    option1 = int(input())

#Función para escoger el destino ingresando una opción según el menu
def destiny():
    #Se instancia la variable global option2
    global option2
    #Se imprime el menu de destinos y se registra el input
    print("\nDestinos actualmente disponibles")
    print("Ingrese una de las siguientes opciones: ")
    print("1. Guajira")
    print("2. Cañon del Chicamocha")
    print("3. LLanos Orientales")
    option2 = int(input())

#Función que calcula el costo y establece el destino según lo ingresado por el usuario
def subtotal(user):
    global option2
    #Si escoge Guajira, calcula el costo de los adultos, los niños, establece el destino seleccionado y suma el subtotal para la cotización
    if  option2 == 1:
        costAdult = user["quantityAdult"] * 1450000
        costChildren = user["quantityChildren"] * 870000
        user["destiny"] = "Guajira"
        user["subtotal"] = costAdult + costChildren
    # Si escoge Cañon, calcula el costo de los adultos, los niños, establece el destino seleccionado y suma el subtotal para la cotización
    elif option2 == 2:
        costAdult = user["quantityAdult"] * 1600000
        costChildren = user["quantityChildren"] * 960000
        user["destiny"] = "Cañon del Chicamocha"
        user["subtotal"] = costAdult + costChildren
    # Si escoge Llanos, calcula el costo de los adultos, los niños, establece el destino seleccionado y suma el subtotal para la cotización
    elif option2 == 3:
        costAdult = user["quantityAdult"] * 1200000
        costChildren = user["quantityChildren"] * 720000
        user["destiny"] = "Llanos Orientales"
        user["subtotal"] = costAdult + costChildren
    #Si digita otro numero, se retorna al menu de destino
    else:
        print("Ingrese una opción válida")
        destiny()

#Función para imprimir la cotización
def printquote():
    #Un pequeño menu para escoger la forma en que se quiere imprimir
    option3 = int(input("""Ingrese una opción para imprimir la cotización: 
    1. Imprimir en formato tabla
    2. Imprimir en lista \n"""))
    #Validacion de la opción ingresada
    if option3 == 1:
        print("print con pandas")
        #Usa pandas para imprimirlo en tabla
        global dfusers
        dfusers = pd.DataFrame(users)
        print("Las cotizaciones ingresadas son: ")
        print(dfusers)

    #Usa el for para recorrer el diccionario e imprimir todos las cotizaciones realizadas en listas individuales
    elif option3 == 2:
        for user in users:
            print("Nombre del cliente --------------> ", user["name"])
            print("Nombre del destino --------------> ", user["destiny"])
            print("Cantidad de personas adultas ----> ", user["quantityAdult"])
            print("Cantidad de niños ---------------> ", user["quantityChildren"])
            print("Subtotal cotización -------------> ", user["subtotal"])
            print()
    #Si digita un numero diferente imprime mensaje y lo retorna al menu principal
    else:
        print("Ingrese una opción válida")
        menu()

#Función para imprimir contadores y sumas según las especificaciones del proyecto
def reports ():
    #Contador para las personas que van a la Guajira accediendo al diccionario user{} registrado en la lista users[] validando el destino registrado e imprime mensaje
    peopleGuajira = 0
    for user in users:
        if user["destiny"] == "Guajira":
            peopleGuajira = peopleGuajira + user["quantityAdult"] + user["quantityChildren"]
    print("Cantidad de personas que viajan para la guajira --------------> ", peopleGuajira)

    # Contador para las personas que van a Chicamocha accediendo al diccionario user{} registrado en la lista users[] validando el destino registrado e imprime mensaje
    peopleChicamocha = 0
    for user in users:
        if user["destiny"] == "Cañon del Chicamocha":
            peopleChicamocha = peopleChicamocha + user["quantityAdult"] + user["quantityChildren"]
    print("Cantidad de personas que viajan para Cañon del Chicamocha ----> ", peopleChicamocha)

    # Contador para las personas que van a los Llanos accediendo al diccionario user{} registrado en la lista users[] validando el destino registrado e imprime mensaje
    peopleLlanos = 0
    for user in users:
        if user["destiny"] == "Llanos Orientales":
            peopleLlanos = peopleLlanos + user["quantityAdult"] + user["quantityChildren"]
    print("Cantidad de personas que viajan para los Llanos Orientales ---> ", peopleLlanos)

    #Acumulador para sumar el total costo de los que viajan a la Guajira, usando el for
    totalGuajira = 0
    for user in users:
        if user["destiny"] == "Guajira":
            totalGuajira = totalGuajira + user["subtotal"]
    print("Total dinero de los viajes para la Guajira -------------------> ", totalGuajira)

    # Acumulador para sumar el total costo de los que viajan a la Chicamocha, usando el for
    totalChicamocha = 0
    for user in users:
        if user["destiny"] == "Cañon del Chicamocha":
            totalChicamocha = totalChicamocha + user["subtotal"]
    print("Total dinero de los viajes para Cañon del Chicamocha ---------> ", totalChicamocha)

    # Acumulador para sumar el total costo de los que viajan a los Llanos, usando el for
    totalLanos = 0
    for user in users:
        if user["destiny"] == "Llanos Orientales":
            totalLanos = totalLanos + user["subtotal"]
    print("Total dinero de los viajes para los Llanos Orientales --------> ", totalLanos)

    #Contador para saber cuantos adultos viajan en todas las cotizaciones
    totalAdults = 0
    for user in users:
        if user["quantityAdult"] > 0:
            totalAdults = totalAdults + user["quantityAdult"]
    print("Total personsas adultas --------------------------------------> ", totalAdults)

    # Contador para saber cuantos niños viajan en todas las cotizaciones
    totalChildren = 0
    for user in users:
        if user["quantityChildren"] > 0:
            totalChildren = totalChildren + user["quantityChildren"]
    print("Total de niños -----------------------------------------------> ", totalChildren)

    #Acumulador para sumar el total costo de todas las cotizaciones
    totalCost = 0
    for user in users:
        if user["subtotal"] > 0:
            totalCost = totalCost + user["subtotal"]
    print("Total dinero de todos los destinos ---------------------------> ", totalCost)



if __name__ == '__main__':
    main()
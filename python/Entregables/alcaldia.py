#Librerías
import pandas as pd


#Variables globales

option1 = 0
users = []

#Función principal para calcular los bonos
def bonuses():
    #Mensaje de bienvenida
    print("Bienvenido al menu de la Alcaldía de Xochimilco")
    print("Su bienestar es nuestra prioridad.")

    #For para iterar el menu 1o veces e ingresar 10 beneficiarios
    for i in range(10) :
        #Llama a la función que muestra el menu principal
        mainmenu()
        #Opción para registrar datos
        if option1 == 1:
            #Crea un diccionario para almacenar la información de los usuarios
            user = {}
            user["name"] = str(input("Ingrese el nombre del beneficiario:---> "))
            user["estrato"] = int(input("Ingrese el estrato: ------------------> "))
            user["children"] = int(input("Ingrese el número de hijos: ----------> "))
            user["bonus"] = 0

            #Validaciones para calcular el bono según la tabla suministrada
            if user["children"] == 0 and user["estrato"] == 1:
                user.update({"bonus": 20000})
            elif user["children"] == 0 and user["estrato"] == 2:
                user.update({"bonus": 16500})
            elif user["children"] > 0 and user["children"] < 3 and user["estrato"] == 1:
                user.update({"bonus": 25000})
            elif user["children"] > 0 and user["children"] < 3 and user["estrato"] == 2:
                user.update({"bonus": 21500})
            elif user["children"] >= 3 and user["estrato"] == 1:
                user.update({"bonus": 30000})
            elif user["children"] >= 3 and user["estrato"] == 2:
                user.update({"bonus" : 26500 })

            #Agrega la información del diccionario user{} a la lista users[]
            users.append(user)

            #Se crea un Dataframe de pandas para imprimir en formato tabla
            global dfusers
            dfusers = pd.DataFrame(users)
            print("\nLa información ingresada es: ")
            print(dfusers)

        #Opción para generar un reporte de los usuarios
        elif option1 == 2:
            reporteUsers()

        #Opción para salir del programa
        elif option1 == 3:
            break

        #Mensaje de error si se digita un numero diferente y retorna al menu principal
        else:
            print("Ingrese una opción valida")
            mainmenu()


#Función para mostrar el menu principal
def mainmenu():
    print("\nMenu Principal para la entrega de bonos")
    print("Por favor ingrese una de las siguientes opciones")
    #Almacena el input en la variable global option1
    global option1
    option1 = int(input(f"""1. Ingresar datos 
2. Generar reporte
3. Salir \n"""))


def reporteUsers():
    #Contadores y acumuladores para el reporte según lo solicitado

    countEstrato1 = 0
    countEstrato2 = 0
    moneyEstrato1 = 0
    moneyEstrato2 = 0
    countnochildren = 0
    countchildren2 = 0
    countchildren3 = 0
    bonusnochildren = 0
    bonuschildren2 = 0
    bonuschildren3 = 0
    netbonus = 0

    #Recorre la lisa de usuarios y se calculan las diferentes estadisticas

    for user in users:

        if user["estrato"] == 1:
            countEstrato1 = user["children"] + countEstrato1 + 1
            moneyEstrato1 += user["bonus"]

        elif user["estrato"] == 2:
            countEstrato2 = user["children"] + countEstrato2 + 1
            moneyEstrato2 += user["bonus"]

        if user["children"] == 0:
            countnochildren += 1
            bonusnochildren += user["bonus"]

        elif 0 < user["children"] < 3:
            countchildren2 += 1
            bonuschildren2 += user["bonus"]

        elif user["children"] >= 3 :
            countchildren3 += 1
            bonuschildren3 += user["bonus"]

        netbonus += user["bonus"]

    print("Cantidad de personas del estrato 1: -----------------------> ", countEstrato1)
    print("Cantidad de personas del estrato 2: -----------------------> ", countEstrato2)
    print("Dinero entregado al estrato 1: ----------------------------> ", moneyEstrato1)
    print("Dinero entregado al estrato 2: ----------------------------> ", moneyEstrato2)
    print("Cantidad de personas que no tienen hijos: -----------------> ", countnochildren)
    print("Cantidad de personas que tienen hasta 2 hijos: ------------> ", countchildren2)
    print("Cantidad de personas que tienen mayor o igual a 3 hijos: --> ", countchildren3)
    print("Dinero entregado a beneficiarios sin hijos: ---------------> ", bonusnochildren)
    print("Dinero entregado a beneficiarios con hasta 2 hijos: -------> ", bonuschildren2)
    print("Dinero entregado a beneficiarios con 3 o más hijos: -------> ", bonuschildren3)
    print("Dinero total entregado en bonos: --------------------------> ", netbonus)



if __name__ == '__main__':
    bonuses()
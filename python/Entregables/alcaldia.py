import pandas as pd


#Variables globales

option1 = 0
users = []

def bonuses():
    print("Bienvenido al menu de la Alcaldía de Xochimilco")
    print("Su bienestar es nuestra prioridad.")

    for i in range(10) :
        mainmenu()
        if option1 == 1:
            user = {}
            user["name"] = str(input("Ingrese el nombre del beneficiario:---> "))
            user["estrato"] = int(input("Ingrese el estrato: ------------------> "))
            user["children"] = int(input("Ingrese el número de hijos: ----------> "))
            user["bonus"] = 0

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

            users.append(user)

            global dfusers
            dfusers = pd.DataFrame(users)
            print(dfusers)


        elif option1 == 2:
            reporteUsers()
        elif option1 == 3:
            break
        else:
            print("Ingrese una opción valida")
            mainmenu()



def mainmenu():
    print("\nMenu Principal para la entrega de bonos")
    print("Por favor ingrese una de las siguientes opciones")
    global option1
    option1 = int(input(f"""1. Ingresar datos 
2. Generar reporte
3. Salir \n"""))

def reporteUsers():

    countEstrato1 = 0
    for user in users:
        if user["estrato"] == 1:
            countEstrato1 +=1
    print("Cantidad de personas del estrato 1: --> ", countEstrato1)

    countEstrato2 = 0
    for user in users:
        if user["estrato"] == 2:
            countEstrato2 += 1
    print("Cantidad de personas del estrato 2: --> ", countEstrato2)

    moneyEstrato1 = 0
    for user in users:
        if user["estrato"] == 1:
            moneyEstrato1 += user["bonus"]
    print("Dinero entregado al estrato 1: --> ", moneyEstrato1)

    moneyEstrato2 = 0
    for user in users:
        if user["estrato"] == 2:
            moneyEstrato2 += user["bonus"]
    print("Dinero entregado al estrato 2: --> ", moneyEstrato2)

    countnochildren = 0
    for user in users:
        if user["children"] == 0:
            countnochildren += 1
    print("Cantidad de personas que no tienen hijos: --> ", countnochildren)

    countchildren2 = 0
    for user in users:
        if user["children"] > 0 and user["children"] < 3 :
            countchildren2 += 1
    print("Cantidad de personas que tienen hasta 2 hijos: --> ", countchildren2)


    countchildren3 = 0
    for user in users:
        if user["children"] >= 3 :
            countchildren3 += 1
    print("Cantidad de personas que tienen mayor o igual a 3 hijos: --> ", countchildren3)

    bonusnochildren = 0
    for user in users:
        if user["children"] == 0:
            bonusnochildren += user["bonus"]
    print("Dinero entregado a beneficiarios sin hijos: --> ", bonusnochildren)

    bonuschildren2 = 0
    for user in users:
        if user["children"] > 0 and user["children"] < 3:
            bonuschildren2 += user["bonus"]
    print("Dinero entregado a beneficiarios con hasta 2 hijos: --> ", bonuschildren2)

    bonuschildren3 = 0
    for user in users:
        if user["children"] >= 3 :
            bonuschildren3 += user["bonus"]
    print("Dinero entregado a beneficiarios con 3 o más hijos: --> ", bonuschildren3)

    netbonus = 0
    for user in users:
        if user["bonus"] > 0 :
            netbonus += user["bonus"]
    print("Dinero total entregado en bonos: --> ", netbonus)


if __name__ == '__main__':
    bonuses()
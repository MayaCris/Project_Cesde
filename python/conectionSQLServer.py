# import pyodbc
#
# conn = pyodbc.connect('Driver={SQL Server};'
#                       'Server=MSSQLSERVER01'
#                       ';Database=HiperAlmacen'
#                       )
# pass
#
# def menu():
#     opcion = int(input('Ingrese la opcion: '))
#
#     match opcion:
#         case 1:
#             print("1. Escogió la opción 1")
#
#         case 2:
#             print("2. Escogió la opción 2")
#
# menu()

def provideAccess(user):
    return {
        "username": user,
        "password": "admin"
    }


def runMatch():
    user = str(input("Write your username -: "))
    allowedDataBaseUsers = ["Rishabh"]
    match user:
        case "Rishabh" if user in allowedDataBaseUsers:
            print("You are allowed to access the database !")
            data = provideAccess("Rishabh")
            print(data)
        case _:
            print("You are not a company memeber , \
            you are not  allowed to access the code !")


if __name__ == "__main__":
    for _ in range(2):
        runMatch()

from persona import persona
from Estudiante import Estudiante
def Registrar(self):
    Users =[] #Lista de usuarios
    print("Registrar datos")
    id = input("Cedula ---> ")
    apellido = input("Apellido ---> ")
    nombre = input("Nombre ---> ")
    edad = input("edad --->")
    user = {"Cedula": id,"Apellido":apellido, "Nombre": nombre, "Edad":edad} #Diccionario que guarda cada atributo del user
    Users.append(user)
    return (user)






if __name__ == '__main__':
    #persona1 = persona(123,'Gallego','Cristian',20)
    #persona2 = persona(456,'Correa', 'Maia',24)
    #persona1.ImprimirDatos()
    #persona2.ImprimirDatos()
    Registrar()
    #user.Imprimir




    estud1 = Estudiante(369,'Bedoya', 'Alejandra',16, 'Software', 1000000)
    estud1.ImprimirDatos()

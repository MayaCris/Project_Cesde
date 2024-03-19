from persona import persona

class Estudiante(persona):

    def __init__(self, idPersona, apellido, nombre, edad, programa,matricula):
        super().__init__(idPersona, apellido, nombre, edad)
        self.programa = programa
        self.matricula = matricula

    def ImprimirDatos(self):
        super().ImprimirDatos()
        print(f"Programa ---> {self.programa}")
        print(f"Matricula ---> {self.matricula}")



class persona:
    persona = {}
    #idPersona = 0
    #apellido = ""
    #nombre = ""
    #edad = 0


    def __init__(self, persona):
        self.persona = persona
        #self.idPersona = cedula
        #self.apellido = apellido
        #self.nombre = nombre
        #self.edad = edad


    def ImprimirDatos(self):
        print("".center(50, '-') )
        print("Datos Persona:")
        print(f"Cedula --> {self.persona['Cedula']}")
        print(f"Nombre --> {self.persona['Apellido']}")
        print(f"Apellido --> {self.persona['Nombre']}")
        print(f"Edad --> {self.persona['Edad']}")

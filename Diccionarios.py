def estudiantes():
    Student = {
        'id': 123,
        'apellidos':'Arroyave',
        'nombre' : 'Mateo'
    }
    print(Student)
    #Actualizar o editar o modificar función update()
    Student.update({'apellidos':'Maya Gallego'})

    print(Student['apellidos'])
    Student.update({'edad': 28})
    print(Student.get('edad'))
    print(Student)

    #del ---> borra todo el diccionario o una key
    del(Student['edad'])
    print(Student)

    #Borrar apellido con pop
    print("utilizando POP")
    borrado = Student.pop('apellidos', 'El dato no existe o está mal digitado')

    print('la información borrada fue: ', borrado)
    print('la información actual es: ', Student)
    #Student.pop('apellidos')
    #print(Student.items())

def tuplas():
    #Las TUPLAS no son mutables. No se pueden modificar

    Estudiantes = ('Mateo', 'Juan Pablo', 'Melissa')
    print(Estudiantes)
    print(Estudiantes[2])
    #Estudiantes[2]="Pepito"
    #print(Estudiantes[2])



if __name__ == '__main__':
    tuplas()
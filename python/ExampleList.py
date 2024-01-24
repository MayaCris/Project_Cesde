#Definir una función que calcule la longitud de una lista o una cadena dada.
#No vale usar len()

def Longitu():
    conta= 0
    lista= [10,20,30,40,50]

    for x in lista:
        conta += 1
        print(conta)

    print(f'la longitud de la lista es {conta}')

def longitud(valor):
    # Simple validación. No aceptamos otra cosa que no sea
    # una lista (list) o una cadena (str)
    if type(valor) is not list and type(valor) is not str:
        return -1
    # Contador que vamos incrementando en cada iteración
    contador = 0
    # Mientras haya datos que iterar, aumentar el contador
    # Nota: si es str, iteramos letra por letra.
    # si es list, iteramos elemento por elemento
    for elemento in valor:
        contador += 1
    return contador


# Probar
cadena = "Hola"
print("Longitud de cadena:", longitud(cadena))
cadena = ""
print("Longitud de cadena:", longitud(cadena))
lista = ["Panic in Detroid", "Let me go", "Shattered"]
print("Longitud de lista:", longitud(lista))



#if __name__ == '__main__':

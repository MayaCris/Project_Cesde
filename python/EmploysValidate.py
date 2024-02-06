
def nomina():
    
    name = str(input("Digite su nombre: "))
    income = float(input("Digite su salario: "))
    quantityhour = float(input("Digite la cantidad de horas trabajadas: "))
    hourvalue = income/240
    hextras = float(input("Digite el número de horas extras: "))

    valuesalary = hourvalue * quantityhour
    vextras = hextras * hourvalue * 1.35
    netpay = vextras + valuesalary

    print("Estimado ", name)
    print("-----------------------------------------------------")
    print("El valor de las horas ordinarias es: ", valuesalary)
    print("El valor de las horas extras es: ", vextras )
    print("El neto a pagar es: ", netpay)


if __name__ == '__main__':
    nomina()
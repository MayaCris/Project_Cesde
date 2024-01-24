#Examen punto 1

def Nomina():
    nameemploy = str(input("Digite el nombre del empleado: "))
    children = int(input("Digite el número de hijos que tiene: "))
    quantityhour = float(input("Digite la cantidad de horas trabajadas: "))
    hourvalue = 5532

    if children >= 3:
        bonusvalue = (children * 10) * hourvalue
        totalhour = quantityhour + bonusvalue
        extrahour = quantityhour - 47

        if extrahour > 0:
            valueextra = extrahour * hourvalue * 1.35
        else:
            valueextra = 0
            extrahour = 0

    else:
        bonusvalue = (children * 5) * hourvalue
        totalhour = quantityhour + bonusvalue
        extrahour = quantityhour - 47
        if extrahour > 0:
            valueextra = extrahour * hourvalue * 1.35
        else:
            valueextra = 0
            extrahour = 0

    valueweek = (quantityhour - extrahour) * hourvalue
    earn = valueweek + valueextra

    print(f'Nombre del empleado:                {nameemploy}')
    print(f'Número de hijos:                    {children}')
    print(f'Bonificacion por hijos:             {bonusvalue}')
    print(f'Valor hora:                         {hourvalue}')
    print(f'Total horas trabajadas:             {quantityhour}')
    print(f'Valor horas ordinarias:             {valueweek}')
    print(f'Horas extras:                       {extrahour}')
    print(f'Valor horas extras:                 {valueextra}')
    print(f'Devengado. Ordinarias + extras:     {earn}')
    print(f'Neto a pagar (Devengado + Bonus):   {earn + bonusvalue}')

def matricula():
    namestudent = str(input("Digite el nombre del estudiante: "))
    regvalue = float(input("Digite el valor de la matricula: "))
    strata = int(input("Digite el número de su estrato: "))
    surcharge = 0

    if strata == 1:
        discount = regvalue * 0.4
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')

    elif strata == 2:
        discount = regvalue * 0.3
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')


    elif strata == 3:
        discount = regvalue * 0.1
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')

    elif strata == 4:
        discount = 0
        surcharge = regvalue * 0.1
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')

    elif strata == 5:
        discount = 0
        surcharge = regvalue * 0.2
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')

    elif strata == 6:
        discount = 0
        surcharge = regvalue * 0.4
        netvalue = regvalue - discount + surcharge
        print(f'Nombre de estudiante:           {namestudent}')
        print(f'Valor de la matricula:          {regvalue}')
        print(f'Estrato:                        {strata}')
        print(f'Descuento:                      {discount}')
        print(f'Recargo:                        {surcharge}')
        print(f'Neto a pagar:                   {netvalue}')

    else:
        print("La opción digitada no es valida. Hasta luego")

if __name__ == '__main__':
    Nomina()


def listSum(numbers):
    if not numbers:
        return 0
    else:
        (f, rest) = numbers
        return f + listSum(rest)

myList = (1, (2, (3, None)))  # Aquí he cambiado (3, None) por (3, None)
total = listSum(myList)
print(total)



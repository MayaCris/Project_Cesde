
class Calculator {
    constructor() {
        this.counters = {
            countSum: 0,
            countSubtract: 0,
            countMultiply: 0,
            countDivide: 0,
            countExponentiation: 0,
            countRootExtraction: 0,
            countAreaTriangle: 0,
            countAreaRectangle: 0,
            countAreaSquare: 0,
            countPerimeterTriangle: 0,
            countPerimeterRectangle: 0,
            countPerimeterSquare: 0,
        };
        this.operations = [];
    }

    registerOperation(numbersInput, operationType, registerResult) {
        this.operations.push({
            numbersInput,
            operationType,
            registerResult
        });
    }

    inputNumbers (){
        let number1 = parseFloat(prompt('Ingrese el primer número: '));
        let number2 = parseFloat(prompt('Ingrese el segundo número: '));
        if (isNaN(number1) || isNaN(number2)) {
            console.log('Ingrese un número válido');
            return;
        }
        return [number1,number2];
    }

    sum(number1, number2) {
        this.counters.countSum++;
        const result = number1 + number2;
        this.registerOperation([number1, number2], 'suma', result);
        console.log(`El resultado de la operación es: ${result}`);
        return result;

    }

    subtract(number1, number2) {
        this.counters.countSubtract++;
        const result = number1 - number2;
        this.registerOperation([number1, number2], 'resta', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }
    multiply(number1, number2) {
        this.counters.countMultiply++;
        const result = number1 * number2;
        this.registerOperation([number1, number2], 'multiplicación', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    divide(number1, number2) {
        if (number2 === 0) {
            console.log('No se puede dividir por 0');
            return;
        }
        this.counters.countDivide++;
        const result = number1 / number2;
        this.registerOperation([number1, number2], 'división', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }
   
    showOperations() {
        console.log('Registro de las operaciones realizadas:');
        console.log("-------------------------------------------------");
        
        if (this.operations.length === 0) {
            console.log('No se han realizado operaciones.');
        } else {
            this.operations.forEach((operation, index) => {
                console.log(`${index + 1}. Operación: ${operation.operationType}`);
                console.log(`   Entradas: ${operation.numbersInput.join(', ')}`);
                console.log(`   Resultado: ${operation.registerResult}`);
                console.log("-------------------------------------------------");
            });
        }
    
        console.log("Contadores de las operaciones realizadas:");
        console.log("-------------------------------------------------");
        for (let counter in this.counters) {
            console.log(`${counter}: -------> ${this.counters[counter]}`);
        }
        console.log("-------------------------------------------------");
        
        return this.operations;
    }
    

}

class ScientificCalculator extends Calculator {
    constructor() {
        super();

    }

    exponentiation(number1, number2) {
        this.counters.countExponentiation++;
        const result = Math.pow(number1, number2);
        this.registerOperation([number1, number2], 'potenciación', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    rootExtraction(number1, number2) {
        if (number2 === 0) {
            console.log('No se puede radicar con índice 0');
            return;
        }
        this.counters.countRootExtraction++;
        const result = Math.pow(number1, 1/ number2);
        this.registerOperation([number1, number2], 'radicación', result);
        return result;
    }
}

class SpecialCalculator extends Calculator {
    constructor() {
        super();

    }

    areaTriangle(base, height) {
        this.counters.countAreaTriangle++;
        const result = (base * height) / 2;
        this.registerOperation([base, height], 'área de un triángulo', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    
    }

    perimeterTriangle(side1, side2, side3) {
        this.counters.countPerimeterTriangle++;
        const result = side1 + side2 + side3;
        this.registerOperation([side1, side2, side3], 'perímetro de un triángulo', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    areaRectangle(base, height) {
        this.counters.countAreaRectangle++;
        const result = base * height;
        this.registerOperation([base, height], 'área de un rectángulo', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    perimeterRectangle(base, height) {
        this.counters.countPerimeterRectangle++;
        const result = 2 * (base + height);
        this.registerOperation([base, height], 'perímetro de un rectángulo', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    areaSquare(side) {
        this.counters.countAreaSquare++;
        const result = side * side;
        this.registerOperation([side], 'área de un cuadrado', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

    perimeterSquare(side) {
        this.counters.countPerimeterSquare++;
        const result = 4 * side;
        this.registerOperation([side], 'perímetro de un cuadrado', result);
        console.log(`El resultado de la operación es: ${result}`)
        return result;
    }

}



class CalculatorApp {
    constructor() {
        this.calculator = new Calculator();
        this.scientificCalculator = new ScientificCalculator();
        this.specialCalculator = new SpecialCalculator();
    }

    mainMenu() {
        let option = Number(prompt('Bienvenido a la app calculadora. \n\nSeleccione una opción: \n1. Calculadora normal \n2. Calculadora científica \n3. Calculadora especial \n4. Ver registro de operaciones \n5. Salir'));
        switch (option) {
            case 1:
                this.menuCalculator();
                break;
            case 2:
                this.menuScientificCalculator();
                break;
            case 3:
                this.menuSpecialCalculator();
                break;
            case 4:
                this.calculator.showOperations();
                this.mainMenu();
                break;
            case 5:
                console.log('Gracias por usar nuestra app');
                break;
            default:
                console.log('Opción no válida');
                this.mainMenu();
                break;
        }
        
    }
    
    menuCalculator() {
        let validate = true;
        while (validate) {
            let option = Number(prompt('Seleccione una opción: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Regresar al menú principal \n6. Salir'));
            switch (option) {
                case 1:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.calculator.sum(number1, number2);
                    break;
                case 2:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.calculator.subtract(number1, number2);
                    break;
                case 3:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.calculator.multiply(number1, number2);
                    break;
                case 4:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.calculator.divide(number1, number2);
                    break;
                case 5:
                    this.mainMenu();
                    break;
                case 6:
                    console.log('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    console.log('Opción no válida');
                    this.menuCalculator();
                    break;
            }
        }
    }
    
    menuScientificCalculator() {
        let validate = true;
        while (validate) {
            let option = Number(prompt('Seleccione una opción: \n1. Elevar a la potencia \n2. Raíz cuadrada \n3. Regresar al menú principal \n4. Salir'));
            switch (option) {
                case 1:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.scientificCalculator.exponentiation(number1, number2);
                    break;
                case 2:
                    var [number1, number2] = this.calculator.inputNumbers();
                    this.scientificCalculator.rootExtraction(number1, number2);
                    break;
                case 3:
                    this.mainMenu();
                    break;
                case 4:
                    console.log('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    console.log('Opción no válida');
                    this.menuScientificCalculator();
                    break;
            }
        }
    }
    
    menuSpecialCalculator() {
        let validate = true;
        while (validate) {
            let option = Number(prompt('Seleccione una opción: \n1. Calcular area y perimetro de un triangulo\n2. Calcular area y perimetro de un cuadrado \n3. Calcular area y perimetro de un rectangulo \n4. Regresar al menú principal \n5. Salir'));
            switch (option) {
                case 1:
                    triangle();
                    break;
                case 2:
                    rectangle();
                    break;
                case 3:
                    square();
                    break;
                case 4:
                    this.mainMenu();
                    break;
                case 5:
                    console.log('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    console.log('Opción no válida');
                    this.menuSpecialCalculator();
                    break;
            }
        }
    }

 
}




const app = new CalculatorApp();
app.mainMenu();


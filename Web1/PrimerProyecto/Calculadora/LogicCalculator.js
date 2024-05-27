class LogOperations {
    constructor() {

        this.operations = [];
    }

    registerOperation(numbersInput, operationType, registerResult) {
        this.operations.push({
            numbersInput,
            operationType,
            registerResult
        });
    
    }

    showOperations() {
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
        
    }

    
}

class Calculator extends LogOperations{
    constructor() {
        super();

        this.counters = {
            countSum: 0,
            countSubtract: 0,
            countMultiply: 0,
            countDivide: 0,
        };

    }

    inputNumber (){
        let number = parseFloat(prompt('Ingrese el primer número: '));
        if (isNaN(number)) {
            console.log('Ingrese un número válido');
            return;
        }
        return number;
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

    showCounters() {
        console.log("-------------------------------------------------");
        for (let counter in this.counters) {
            console.log(`${counter}: -------> ${this.counters[counter]}`);
        }
        console.log("-------------------------------------------------");
        
        return this.operations;
    }
       

}

class ScientificCalculator extends LogOperations {
    constructor() {
        super();
        
        this.counters = {
            countExponentiation: 0,
            countRootExtraction: 0,
        };

    };

    exponentiation(number1, number2) {
        this.counters.countExponentiation++;
        const result = Math.pow(number1, number2);
        this.registerOperation([number1, number2], 'potenciación', result);
        console.log(`El resultado de la operación es: ${result}`)
        console.log(this.counters.countExponentiation)
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
        console.log(`El resultado de la operación es: ${result}`);
        return result;
    }

    showCounters() {
        console.log("-------------------------------------------------");
        for (let counter in this.counters) {
            console.log(`${counter}: -------> ${this.counters[counter]}`);
        }
        console.log("-------------------------------------------------");
        
        return this.operations;
    }


}

class SpecialCalculator extends LogOperations{
    constructor() {
        super();
        this.counters = {
            countAreaTriangle:  0,
            countAreaRectangle: 0,
            countAreaSquare: 0,
            countPerimeterTriangle: 0,
            countPerimeterRectangle: 0,
            countPerimeterSquare: 0,
            
        };
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

    showCounters() {
        console.log("-------------------------------------------------");
        for (let counter in this.counters) {
            console.log(`${counter}: -------> ${this.counters[counter]}`);
        }
        console.log("-------------------------------------------------");
        
        return this.operations;
    }

}



class CalculatorApp  extends LogOperations {
    constructor() {
        super();
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
                console.log('\n\nContador de operaciones de la calculadora normal:');
                this.calculator.showCounters();

                console.log('\n\nContador de operaciones de la calculadora cientifica:');
                this.scientificCalculator.showCounters();
                
                console.log('\n\nContador de operaciones de la calculadora especial:');
                this.specialCalculator.showCounters();

                console.log('\n\nRegistro de las operaciones de la calculadora normal:');
                this.calculator.showOperations();

                console.log('\n\nRegistro de las operaciones de la calculadora cientifica:');
                this.scientificCalculator.showOperations();

                console.log('\n\nRegistro de las operaciones de la calculadora especial:');
                this.specialCalculator.showOperations();


                this.mainMenu();
                break;
            case 5:
                alert('Gracias por usar nuestra app');
                break;
            default:
                alert('Opción no válida');
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
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.sum(number1, number2);
                    break;
                case 2:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();

                    this.calculator.subtract(number1, number2);
                    break;
                case 3:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.multiply(number1, number2);
                    break;
                case 4:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.divide(number1, number2);
                    break;
                case 5:
                    this.mainMenu();
                    break;
                case 6:
                    alert('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    alert('Opción no válida');
                    this.menuCalculator();
                    break;
            }
        }
    }
    
    menuScientificCalculator() {
        let validate = true;
        while (validate) {
            let option = Number(prompt('Seleccione una opción: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Potenciación \n6. Radicación \n7. Regresar al menú principal \n8. Salir'));
            switch (option) {
                case 1:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.sum(number1, number2);
                    break;
                case 2:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.subtract(number1, number2);
                    break;
                case 3:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.multiply(number1, number2);
                    break;
                case 4:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.calculator.divide(number1, number2);
                    break;
                case 5:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.scientificCalculator.exponentiation(number1, number2);
                    break;
                case 6:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.scientificCalculator.rootExtraction(number1, number2);
                    break;
                case 7:
                    this.mainMenu();
                    break;
                case 8:
                    alert('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    alert('Opción no válida');
                    this.menuScientificCalculator();
                    break;
            }
        }
    }
    
    menuSpecialCalculator() {
        let validate = true;
        while (validate) {
            let option = Number(prompt(`Seleccione una opción: \n1. Calcular area de un triangulo \n2. Calcular perimetro de un triangulo \n3. Calcular area de un cuadrado \n4. Calcular perimetro de un cuadrado \n5. Calcular area de un rectangulo \n6. Calcular perimetro de un rectangulo \n7. Regresar al menú principal \n8. Salir`));
            switch (option) {
                case 1:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.specialCalculator.areaTriangle(number1, number2);
                    break;
                case 2:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    var number3 = this.calculator.inputNumber();
                    this.specialCalculator.perimeterTriangle(number1, number2, number3);
                    break;
                case 3:
                    var number1 = this.calculator.inputNumber();
                    this.specialCalculator.areaSquare(number1);
                    break;
                case 4:
                    var number1 = this.calculator.inputNumber();
                    this.specialCalculator.perimeterSquare(number1);
                    break;
                case 5:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.specialCalculator.areaRectangle(number1, number2);
                    break;
                case 6:
                    var number1 = this.calculator.inputNumber();
                    var number2 = this.calculator.inputNumber();
                    this.specialCalculator.perimeterRectangle(number1, number2);
                    break;
                case 7:
                    this.mainMenu();
                    break;
                case 8:
                    alert('Gracias por usar nuestra app');
                    validate = false;
                    break;
                default:
                    alert('Opción no válida');
                    this.menuSpecialCalculator();
                    break;
            }
        }
    }

 
}




const app = new CalculatorApp();
app.mainMenu();


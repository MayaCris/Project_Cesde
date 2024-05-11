// Funciones ---> Bloque de codigo que encapsula una función o tarea que podrá ser llamada o utilizada en cualquier parte del archivo
// y la cantidad de veces que se requira.

//! Tipos de funciones:
// 1. Funciones declarativas
// 2. Expresiones de funciones
// 3. Funciones anónimas
// 4. Funciones autoinvocadas
// 5. Funciones flecha

//Las funciones tienen dos partes:
//1. Declaración de la función
//2. Llamada de la función


//* 1. Funciones declarativas
// Se pueden definir o crear en cualquier parte del código y se pueden llamar en cualquier parte del código.
// Se asignan a la memoria global del archivo.

// Se declaran con la palabra reservada function, seguida de un nombre, lista de parametros y el bloque de código que se ejecutará
// al llamar la función.

//? Se recomienda que una función haga una sola tarea, para que sea más fácil de mantener y de depurar.
//? Se recomienda que el nombre de la función se llame bajo el formato camelCase.


// function calculateAge() {
//     let age = prompt('Ingrese su año de nacimiento:');
//     let year = 2024;
//     let ageUser = year - age;
//     if (ageUser >= 18) {
//         console.log('Your age is: ' + ageUser + ' y eres mayor de edad');

//     }else {
//         console.log('Your age is: ' + ageUser + 'y eres menor de edad');
//     }

// }

// // Llamada de la función
// calculateAge();

//* 2. Expresiones de funciones **Ya no se usa**
//Se pueden definir o crear en cualquier parte del código y se pueden llamar solo después de haber sido definidas o creadas.
// Se asignan a una variable del archivo.

// let logIn = function() {
//     let user = prompt('Ingrese su usuario:');
//     let password = prompt('Ingrese su contraseña:');
//     if (user === 'admin' && password === 'admin123') {
//         console.log('Bienvenido a la plataforma de administración');
//     }else {
//         console.log('Usuario o contraseña incorrectos');
//     }
// }

// // Llamada de la función
// logIn();

//*5. Funciones flecha (ES6+)


// let logInFlecha = (user, password) => {

//     if (user === 'admin' && password === 'admin123') {
//         return "tokenAdmin"
//     }else {
//         console.log('Usuario o contraseña incorrectos');
//     }

// }

// let user = prompt('Ingrese su usuario:');
// let password = prompt('Ingrese su contraseña:');

// logInFlecha(user, password);
// if (logInFlecha = "tokenAdmin") {
//     console.log('Bienvenido a la plataforma de administración');
//     console.log(logInFlecha)
// }

//* Argumentos y parámetros de una función
// Los argumentos son los valores que se pasan a la función al momento de llamarla.
// Los parámetros son los valores que recibe la función al momento de ser declarada. ==> 

// function suma(a, b) { //(a, b) son los parametros de la función
//     c = a + b;
//     console.log("El resultado de la suma es: " + c);
// }
// suma(5, 5); // (5, 5) son los argumentos de la función

// var suma2 = (a, b) => {
//     c = a + b;
//     console.log("El resultado de la suma es: " + c);
// }

// suma2(10, 10);

// var suma3 = (numero1, numero2, numero3, numero4) => {
//     console.log("Resultado de suma3: " + numero1, numero2, numero3, numero4);

// }

// suma3("25", true, [23,54,12], 4);


// var valoruno = prompt('Ingrese el valor uno: ');
// var valordos = prompt('Ingrese el valor dos: ');

// var sumaValores = (valoruno, valordos) => {
//     var resultado = valoruno + valordos;
//     console.log('El resultado de la suma es: ' + resultado);
// }
// sumaValores(valoruno, valordos);

//*Funciones con retorno de un valor

// function calcularSalario() {
//     let valorHora = 10000
//     let cantidadHoras = prompt('Ingrese la cantidad de horas trabajadas: ')
//     let salario = valorHora * cantidadHoras
//     return salario
// }



// function calcularAuxilioTransporte(salario) {
//     let auxTransporte = 162000
//     console.log("El salario sin auxilio de transporte es:" + salario)
//     if (salario <= 2600000) { //Se puede validar con el resultado de una función
//         salario += auxTransporte //Pero no se puede usar operadores unarios con el resultado de una función directamente, por eso debo guardar el resultado de la función en una variable
//         console.log("El salario con auxilio de transporte es:" + salario)
//     }
// }
// calcularAuxilioTransporte(calcularSalario());



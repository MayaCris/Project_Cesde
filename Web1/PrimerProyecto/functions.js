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


let logInFlecha = (user, password) => {
    
    if (user === 'admin' && password === 'admin123') {
        return "tokenAdmin"
    }else {
        console.log('Usuario o contraseña incorrectos');
    }
    
}

let user = prompt('Ingrese su usuario:');
let password = prompt('Ingrese su contraseña:');

logInFlecha(user, password);
if (logInFlecha = "tokenAdmin") {
    console.log('Bienvenido a la plataforma de administración');
    console.log(logInFlecha)
}
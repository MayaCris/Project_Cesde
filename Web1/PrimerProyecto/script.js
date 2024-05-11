//*Tipos de variables en JavaScript:
// 1. var --> Se puede reasignar y redeclarar
// 2. let --> Se puede reasignar pero no redeclarar
// 3. const --> No se puede reasignar ni redeclarar

//


// var mensaje = 'Hola, Mundo!';
// console.log(mensaje);
// var nombre = 'Juan';
// var apellido = 'Perez';

// console.log(nombre + ' ' + apellido);

// nombre = 'Cristian';
// apellido = 'Maya';
// console.log(nombre + ' ' + apellido);

// var edad = 30;
// if (true){
//     var nombre2 = 'Alejandro';
//     console.log(edad);
// }
// console.log(nombre2);

// var nombre = 'Andres';
// console.log(nombre);
// var fecha = new Date();
// console.log(typeof(fecha));

// var otravariable = "";
// console.log(typeof(otravariable));


//*  --> atajo para para comentar varias lineas de codigo = ctrl + }
// let numero = [1,2,3,4,5,6,7,8,9,10];

// console.warn('Advertencia');
// console.trace('Esto es un trazo');
// console.table(numero)
// alert(numero)

// let numero2 = Number(prompt('Ingrese un numero'));

// console.log(numero2);
// console.log(typeof(numero2));


//let numero3 = prompt('Ingrese un numero');
// console.log(Number(numero3));
// console.log(typeof(numero3));
// console.log(parseFloat(numero3));
// console.log(parseInt(numero3));


//! --> Condicionales simples:
// Se ejecuta solo si el valor a evaluar es true
// if es la palabra reservada para evaluar una condicion
// () Espacio para el resultado de la expresión booleana
// {} Espacio para el bloque de código a ejecutar




// if (!false) {
//     console.log('Esto es un condicional simple');
// }

//! --> Expresiones booleanas:
// == Comparación simple    
// === Comparación estricta
// >= Mayor o igual - Comparación incluyente
// <= Menor o igual - Comparación incluyente
// > Mayor que - Comparación excluyente
// < Menor que - Comparación excluyente

// let edad = Number(prompt('Ingrese su edad'));

// if (edad == '18') { //* == es un operador de comparación = es un operador de asignación
//     console.log('Esto es una validación de comparación simple');
// }

// if (edad === '18') { //* === es un operador de comparación estricta - Compara contenido y tipo de dato
//     console.log('Esto es una validación de comparación estricta');
// }

// if (edad >= 18) { 
//     console.log('Esto es una validación de comparación incluyente');
// }

// if (edad > 18) { 
//     console.log('Esto es una validación de comparación incluyente');
// }

//! --> Condicionales compuestos:
// if Palabra reservada para evaluar una condición
// () Espacio para el resultado de la expresión booleana
// {} Espacio para el bloque de código a ejecutar
// else Segunda condición si la primera no se cumple
// () Espacio para el resultado de la expresión booleana


// if(edad > 18){
//     console.log('Eres mayor de edad');
// } else {
//     console.log('Eres menor de edad');
// }

//! --> Condicionales anidados:
// if Palabra reservada para evaluar una condición
// () Espacio para el resultado de la expresión booleana
// {} Espacio para el bloque de código a ejecutar
// else if Segunda condición si la primera no se cumple
// () Espacio para el resultado de la expresión booleana
// else ultima condición si ninguna de las anteriores se cumple
// () Espacio para el resultado de la expresión booleana

// if(edad < 12){
//     console.log('Tienes menos de 12 años');
// } else if(edad < 18){
//     console.log('Eres menor de edad');
// } else if(edad < 30){
//     console.log('Eres un adulto joven');
// } else {
//     console.log('Eres un adulto');
// }

//! --> Condicionales multiples:
// Menu de opciones a elegir
// switch palabra reservada para evaluar una condición
// () Valor a comparar (preferiblemente número o char) 
// {} Espacio para el bloque de código a ejecutar
// case palabra reservada para evaluar una condición
// break palabra reservada para finalizar la ejecución del bloque de código
// default palabra reservada para evaluar una condición si ninguna de las anteriores se cumple


// let opcion = Number(prompt('Ingrese un número del 1 al 3\n1. Opción 1\n2. Opción 2\n3. Opción 3'));
// switch(opcion){
//     case 1:
//         let edad = prompt('Ingrese su edad')
//         if(edad >= 18){
//             console.log('Puedes votar');
//         } else {
//             console.log('Eres menor de edad. No puedes votar');
//         }
//         break;
//     case 2:
//         console.log('Elegiste la opción 2');
//         break;
//     case 3:
//         console.log('Elegiste la opción 3');
//         break;
//     default:
//         console.log('Opción no válida');
//         break;
// }

//! --> Operador ternario:
// Es una forma simplificada de escribir un condicional
// Expresion ? 'true' : 'false'


//!Bucles o estructuras de reptición
//? Para estudiar o revisar a que corresponde
// --> For, While, Do While
//For of, For in
//ForEach, map, filter, reduce, find, some, every, includes, findIndex --> Arrays

//! --> Bucle For:
//Bucle o estructura de repetición que se ejecuta n cantidad de veces
//Es necesario saber el valor de n
//for palabra reservada para iniciar el bucle
//() Espacio para la declaración de la variable, la condición y el incremento
//Inicio; Variable iteradora que controla el ciclo 
//Condición; Expresión booleana que permite la ejeción del ciclo
//fin; La cantidad de repretición que ejecutará
//Incremento; El control de la variable iteradora
//{} Espacio para el bloque de código a repetir



//! --> Operadores Unarios:
    // Contadores y acumuladores
        // Contadores --> Incrementan o disminuyen el valor de una variable
        // Acumuladores --> Suma o resta el valor de una variable
    // n++ --> Incrementa en 1 el valor de n (n tiene que estar definido)
    // n-- --> Disminuye en 1 el valor de n (n tiene que estar definido) 

    // for(let index = 1; index <= 10; index++){
    // console.log(index);
    // }

    //Contador no unario
    //n+=2 --> Incrementa en 2 el valor de n (n tiene que estar definido)
    //n-=2 --> Disminuye en 2 el valor de n (n tiene que estar definido)


    // let salario = 0;
    // let total = 0;

    // for(let index = 1; index <= 4; index++){
    //     salario = Number(prompt('Ingrese su salario'));
    //     total += salario;
    //     console.log(total);
    // }
    // console.log(total);

    //! --> Ciclos, bucles o estructuras de repetición
    // --> For, While, Do While
    //--> (Propios) For of, For in
    //--> (Metodos de arreglos) ForEach, map, filter, reduce, find, some, every, includes, findIndex

    //* --> Bucle For:
    // for(let index = 0; index < 10; index++){
    //     if (index === 5){
    //         console.log('index es igual a: ' + index);
    //         break;
    //     }        
    // }
    
    //* --> Bucle While:
    // --> Bucle o estructura de repetición que se ejecuta mientras una condición sea verdadera
    // Puede hacer lo mismo que un for (pero no es reciproco)
    // Controlado por una expresión booleana --> Ciclo finito
    // Controlado por una bandera o centinela (true) --> Ciclo infinito
    // 
    //Validar o configurar primero la variable de control
    //La condición es lo último que se pone en while para que no se ejecute infinitamente

    // let index = 0;
    // while(index < 10){
    //     console.log('Hola Mundo: ' + index);
    //     if (index === 4) {
    //         break;
    //     }
    //     index=+1;
    // }

    //Bandera

    // let index = 0;
    // let repetir = true;
    // while(repetir){
        // console.log('Hola Mundo: ' + index);
        // let respuesta = prompt('¿Desea repetir el ciclo?');
        // if(respuesta === 'no'){
        //     console.log('Adios');
        //     repetir = false;
        //     break
        // }
        // else(respuesta === 'si'); {
        //     index++;
        //     repetir = true;
        // }
    // }

    //* --> Bucle Do While:
    // let index = 0; 

    // do {
    //     console.log('Hola Mundo: ' + index);
    //     let respuesta = prompt('¿Desea repetir el ciclo?');
    //     if(respuesta === 'no'){
    //         console.log('Adios');
    //         repetir = false;
    //         break
    //     }
    //     else(respuesta === 'si'); {
    //         index++;
    //         repetir = true;
    //     }
        
    // } while (repetir);




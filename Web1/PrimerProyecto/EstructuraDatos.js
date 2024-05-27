//! Estructuras de datos en JavaScript
//Manejo de los objetos.
//Hacen referencia a una colección de información conformada por una llave y un valor que agrupa información de un mismo contenido o elemento
// Viene del paradigma de la programación orientada a objetos POO
// Se tiene un objeto:
    //Literal
    //Constructor
    //Clase

//for (let index = 0; index < array.length; index++) {

//El Objeto se puede definir de la siguiente manera, puede ser con const, var o let:
//     const estudiante = {
//         nombre: prompt('Ingrese un nombre: '),
//         edad: prompt('Ingrese una edad: '),
//         estatura: prompt('Ingrese una estatura: '),
//         estudiar: function() {
//             console.log('El estudiante está estudiando');
//         }
//     };

    //Se accede a las propiedades del objeto con la notación de punto: objeto.propiedad
//     console.log(estudiante.nombre);   

//     if (estudiante.edad > 18) {
//         console.log('Es mayor de edad');
//     }

    //Se puede reescribir el valor de una propiedad
//     estudiante.nombre = 'Camilo';
//     console.log(estudiante.nombre);
    //Si se asigna un valor a una propiedad que no existe, se crea una nueva propiedad pero no se guarda en el objeto

//     estudiante.nota = 4.5;

//     console.log(estudiante);

    //Un Objeto tiene prpiedades y comportamientos
    //---> Propiedades: Características del objeto
        //LLave: valor
    //---> Comportamientos: Acciones que puede realizar el objeto
        //Llave: Valor(función())



let nombre = prompt('Ingrese su nombre: ');
let edad = prompt('Ingrese su edad: ');
//si el atributo y el valor son iguales se puede simplificar solo con el nombre del atributo.
const persona = {
    nombre,
    edad,
    // caminar: function() {
    //     console.log(`La persona ${this.nombre} está caminando`); //En una función regular se usa la palabra reservada this
    // },
    dormir: function() {
        const that = this;
        console.log(`La persona ${this.nombre} está durmiendo`); //En una función flecha no funciona la palabra reservada this
    }
}

// console.log(`Esta persona se llama ==> ${persona.nombre}`);
// console.log(`Esta persona tiene ==> ${persona.edad} años`);
// persona.caminar();
// persona.dormir();

ubicacion = {
    pais: "Colombia",
    ciudad: "Bogotá",
    direccion: {
        calle: "123",
        carrera: "45"
    },
};

let trabajar = function () {
    console.log(`La persona ${this.nombre} está trabajando`);
}

const persona2 = {
    nombre: "Jaime",
    edad: 33,
    correo: "correo@correo.com",
    trabajar,
    ubicacion,
    
};

// console.log(persona2.ubicacion.direccion.calle); //Se accede a la propiedad de un objeto anidado

console.log(`Atributo estructurado ${persona.nombre}`)

let estudiante = {
    nombreEstudiante: "Juan",
    edadEstudiante: 23,
    estaturaEstudiante: 1.70
} //Estructuración de un objeto vacío -> Se crea un objeto 

//Desestructuración de objetos

let {edadEstudiante, estaturaEstudiante} = estudiante; //Se extraen las propiedades del objeto y se asignan a variables

console.log(`Nombre del estudiante: ${nombreEstudiante}`);






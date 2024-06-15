console.log(document.getElementsByTagName('img'));
console.log(document.getElementsByClassName('img')); // Muestra una coleccion de elementos pero no se puede manipular como un array

console.log('Muestra el primer elemento con el id: ');
console.log(document.getElementById('img'));

console.log('Mostrar el primer elemento con querySelector por nombre de la etiqueta: ');
console.log(document.querySelector('img'));
console.log(document.querySelector('.img'));
console.log(document.querySelector('#img'));

console.log('Mostrar todos los elementos con querySelectorAll por nombre de la etiqueta: ');
console.log(document.querySelectorAll('img'));
console.log(document.querySelectorAll('.img'));
console.log(document.querySelectorAll('#img'));

//NodeList No es un array,  pero si puede implementar un forEach. Todos los metodos que generan un nuevo array no se pueden usar en un NodeList

//Convertir un NodeList a un array
console.log('\n\nMostrar la conversión al array');
let arregloNodos = [...(document.getElementsByClassName('img'))];
console.log(arregloNodos);

console.log('Recorrer el arreglo de nodos con un forEach');
arregloNodos.forEach((nodo) => {
    console.log(nodo);
});
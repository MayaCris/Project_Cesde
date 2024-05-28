package org.example;

import java.time.LocalDate;

import org.example.modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //Dentro del main uso las clases
        //? Como se usa una clase??
        //La idea es tener los atributos sin inicializar
        //Usar las clases es asignarle valores a los atributos
        //Usar una clase es llamar los metodos

        //Un objeto es tomar los atributos y asignarle valores para que me represente un objeto
        //Un objeto es una variable pero especial.
        // Un objeto es una variable que inicializa los atributos de la clase
        // Ejemplo:
        //Integer edad=31;

        //Un objeto se crea utilizando un metodo especial llamado constructor
        //Vehiculo objeto = new Vehiculo();

        //Que es un constructor?
        //Un constructor es un metodo especial que se encarga de inicializar los atributos de la clase

        //Gestor de dependencias es un software que permite la administración de librerías y dependencias
        //2 Gestores de depencias : Maven y Gradle

        //Existen dos tipos de constructores:
        //El Constructor vacío, inicializa el objeto sin datos
        //El Constructor lleno, inicializa el objeto con datos

        //Para usar una clase debo crear un objeto de la clase

        //Software de control de versiones
        //Github  es un servidor para guardar codigo
        //Git es el software que se instala en la computadora y crea versiones de los archivos
//
//        Integer edad=34;
//        Vehiculo objeto = new Vehiculo();
//        Vehiculo objetoDos = new Vehiculo(5,"volvo", LocalDate.now(), 2500.5, "blanco","Volvo 2021", "Automovil", 800.0, 255.0, 100000000);

        //Mostrando uno de los atributos del objeto
//        System.out.println("La marca del objeto uno es:" + objeto.marca);
//        System.out.println("La marca del objeto dos es:" + objetoDos.marca);

        //Creando un objeto de la clase Prueba. No se importa la clase Prueba porque esta en el mismo paquete
//        Prueba objetoPrueba = new Prueba();
//        Prueba objetoPrueba2 = new Prueba("Toyota");
//        System.out.println("\nLa marca del objeto prueba:" + objetoPrueba.marca);
//        System.out.println("La marca del objeto prueba2:" + objetoPrueba2.marca);

        //Conclusión: Abstracción es la capacidad de representar objetos reales en un programa
        //public es accesible desde cualquier clase, 
        //protected es accesible desde el mismo paquete
        //private es accesible solo desde la misma clase
        //El modificador de acceso por defecto es protected      
//    }
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo(1, "Toyota", LocalDate.now(), 1000.0, "Blanco",
                "Toyota 2021", "Automovil", -800.0, 255.0, 100000000);

        //Metodos de encapsulamiento ==> Getters y Setters
        //Getters: Obtener el valor de un atributo

        //Llamar setters
        vehiculo1.setMarca("Nissan");
        vehiculo1.setAutonomia(-500.0);

        System.out.println("La marca del vehiculo 1 es: " + vehiculo1.getMarca());
        System.out.println("La autonomia del vehiculo 2 es: " + vehiculo1.getAutonomia());



    }
}

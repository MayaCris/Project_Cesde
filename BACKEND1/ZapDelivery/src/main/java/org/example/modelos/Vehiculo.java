package org.example.modelos;

import org.example.helpers.validations.VehiculoValidation;

import java.time.LocalDate;

public class Vehiculo {

    //Inyectando una dependencia de la clase vehiculoValidation
    private final VehiculoValidation vehiculoValidation = new VehiculoValidation();


    //id
    private Integer id; //Solo enteros positivos

    //marca
    private String marca; // Solo letras y espacios y maximo 50 caracteres sin caracteres especiales

    //modelo
    private String modelo; //Con el profe (MM-YY)

    //kilometraje
    private Double kilometraje; //Solo numeros positivos y maximo 100.000

    //color
    private String color; //Solo letras y espacios y maximo 20 caracteres

    //descripcion
    private String descripcion; // Máximo 100 caracteres

    //tipo
    private String tipo; //Solo letras sin espacios

    private Double autonomia; // Solo numeros positivos y máximo 72

    //capacidadCarga
    private Double capacidadCarga; //Solo numeros positivos y máximo 1000

    //avaluo
    private Integer avaluo; //Solo numeros positivos

    //Constructores de la clase


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, String modelo, Double kilometraje, String color, String descripcion, String tipo, Double autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            vehiculoValidation.validateId(id);
            this.id = id;
            System.out.println("Id validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        try {
            vehiculoValidation.validateMarca(marca);
            this.marca = marca;
            System.out.println("Marca validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        try {
            vehiculoValidation.validateModelo(modelo);
            this.modelo = modelo;
            System.out.println("Modelo validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        try {
            vehiculoValidation.validateKilometraje(kilometraje);
            this.kilometraje = kilometraje;
            System.out.println("Kilometraje validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            vehiculoValidation.validateColor(color);
            this.color = color;
            System.out.println("Color validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            vehiculoValidation.validateDescripcion(descripcion);
            this.descripcion = descripcion;
            System.out.println("Descripción validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            vehiculoValidation.validateTipo(tipo);
            this.tipo = tipo;
            System.out.println("Tipo validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        try {
            vehiculoValidation.validateAutonomia(autonomia);
            this.autonomia = autonomia;
            System.out.println("Autonomía validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        try {
            vehiculoValidation.validateCapacidadCarga(capacidadCarga);
            this.capacidadCarga = capacidadCarga;
            System.out.println("Capacidad de carga validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        try {
            vehiculoValidation.validateAvaluo(avaluo);
            this.avaluo = avaluo;
            System.out.println("Avalúo validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}

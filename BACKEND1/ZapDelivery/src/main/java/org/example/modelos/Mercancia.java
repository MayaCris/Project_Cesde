package org.example.modelos;

import org.example.helpers.validations.MercanciaValidation;

public class Mercancia {

    //Inyectando una dependencia de la clase mercanciaValidation
    private final MercanciaValidation mercanciaValidation = new MercanciaValidation();


    //id
    private Integer id; //Solo enteros positivos

    //volumen
    private Double volumen; //Solo numeros positivos y maximo 100

    //tipo
    private String tipo; //Solo letras sin espacios

    //peso
    private Double peso; //Solo numeros positivos y maximo 1000

    //descripcion
    private String descripcion; // Máximo 100 caracteres

    //avaluo
    private Integer avaluo; //Solo numeros positivos


    //direccionRemitente
    private String direccionRemitente; // Máximo 200 caracteres

    //direccionDestinatario
    private String direccionDestinatario; // Máximo 200 caracteres

    public Mercancia() {
    }

    public Mercancia(Integer id, Double volumen, String tipo, Double peso, String descripcion, Integer avaluo, String remitente, String direccionRemitente, String direccionDestinatario) {
        this.id = id;
        this.volumen = volumen;
        this.tipo = tipo;
        this.peso = peso;
        this.descripcion = descripcion;
        this.avaluo = avaluo;
//        this.remitente = remitente;
        this.direccionRemitente = direccionRemitente;
        this.direccionDestinatario = direccionDestinatario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            mercanciaValidation.validateId(id);
            this.id = id;
            System.out.println("Id validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        try {
            mercanciaValidation.validateVolumen(volumen);
            this.volumen = volumen;
            System.out.println("Volumen validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            mercanciaValidation.validateTipo(tipo);
            this.tipo = tipo;
            System.out.println("Tipo validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        try {
            mercanciaValidation.validatePeso(peso);
            this.peso = peso;
            System.out.println("Peso validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            mercanciaValidation.validateDescripcion(descripcion);
            this.descripcion = descripcion;
            System.out.println("Descripción validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        try {
            mercanciaValidation.validateAvaluo(avaluo);
            this.avaluo = avaluo;
            System.out.println("Avaluo validado correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        try {
            mercanciaValidation.validateDireccionRemitente(direccionRemitente);
            this.direccionRemitente = direccionRemitente;
            System.out.println("Dirección del remitente validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        try {
            mercanciaValidation.validateDireccionDestinatario(direccionDestinatario);
            this.direccionDestinatario = direccionDestinatario;
            System.out.println("Dirección del destinatario validada correctamente");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}

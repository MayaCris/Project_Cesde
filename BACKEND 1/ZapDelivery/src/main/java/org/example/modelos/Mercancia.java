package org.example.modelos;

public class Mercancia {
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
        this.id = id;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        this.avaluo = avaluo;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }
}

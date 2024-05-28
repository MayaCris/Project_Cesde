package org.example.modelos;

public class Mercancia {
    //id
    private Integer id;

    //volumen
    private Double volumen;

    //tipo
    private String tipo;

    //peso
    private Double peso;

    //descripcion
    private String descripcion;

    //avaluo
    private Integer avaluo;

    //remitente
    private String remitente;

    //direccionRemitente
    private String direccionRemitente;

    //direccionDestinatario
    private String direccionDestinatario;

    public Mercancia() {
    }

    public Mercancia(Integer id, Double volumen, String tipo, Double peso, String descripcion, Integer avaluo, String remitente, String direccionRemitente, String direccionDestinatario) {
        this.id = id;
        this.volumen = volumen;
        this.tipo = tipo;
        this.peso = peso;
        this.descripcion = descripcion;
        this.avaluo = avaluo;
        this.remitente = remitente;
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

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
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

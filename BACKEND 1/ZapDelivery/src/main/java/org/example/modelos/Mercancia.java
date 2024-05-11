package org.example.modelos;

public class Mercancia {
    //id
    Integer id;

    //volumen
    Double volumen;

    //tipo
    String tipo;

    //peso
    Double peso;

    //descripcion
    String descripcion;

    //avaluo
    Integer avaluo;

    //remitente
    String remitente;

    //direccionRemitente
    String direccionRemitente;

    //direccionDestinatario
    String direccionDestinatario;

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
}

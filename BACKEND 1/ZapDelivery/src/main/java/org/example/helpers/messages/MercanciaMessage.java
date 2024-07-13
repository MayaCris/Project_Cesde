package org.example.helpers.messages;

public enum MercanciaMessage {
    ID_POSITIVO("El id debe ser un número positivo"),
    VOLUMEN_POSITIVO("El volumen debe ser un número positivo"),
    VOLUMEN_MAXIMO("El volumen debe ser menor a 100"),
    TIPO_CARACTERES("El tipo debe ser solo letras sin espacios"),
    PESO_POSITIVO("El peso debe ser un número positivo"),
    PESO_MAXIMO("El peso debe ser menor a 1000"),
    DESCRIPCION_CARACTERES("La descripción debe tener menos de 100 caracteres"),
    AVALUO_POSITIVO("El avaluo debe ser un número positivo"),
    DIRECCION_REMITENTE_CARACTERES("La dirección del remitente debe tener menos de 200 caracteres"),
    DIRECCION_DESTINATARIO_CARACTERES("La dirección del destinatario debe tener menos de 200 caracteres");

    private String messageError;

    MercanciaMessage() {
    }

    MercanciaMessage(String messageError) {
        this.messageError = messageError;
    }

    public String getMessageError() {
        return messageError;
    }
}

package org.example.helpers.messages;

public enum VehiculoMessage {
    ID_POSITIVO("El id debe ser un número positivo"),
    ID_NUMERO("El id debe ser un número"),
    MARCA_CARACTERES("La marca solo puede contener letras y espacios y un máximo de 50 caracteres sin caracteres especiales"),
    MODELO("El modelo debe ser una fecha"),
    KILOMETRAJE_POSITIVO("El kilometraje debe ser un número positivo y máximo 100.000"),
    COLOR_CARACTERES("El color solo puede contener letras y espacios y un máximo de 20 caracteres"),
    DESCRIPCION_CARACTERES("La descripción debe tener un máximo de 100 caracteres"),
    TIPO_CARACTERES("El tipo solo puede contener letras sin espacios"),
    AUTONOMIA_POSITIVO("La autonomía debe ser un número positivo y máximo 72"),
    CAPACIDAD_CARGA_POSITIVO("La capacidad de carga debe ser un número positivo y máximo 1000"),
    AVALUO_POSITIVO("El avalúo debe ser un número positivo")
    ;

    private String messageError;

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    VehiculoMessage() {
    }

    VehiculoMessage(String messageError) {
        this.messageError = messageError;
    }
}

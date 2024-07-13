package org.example.helpers.validations;

import org.example.helpers.Regex.RegexValidator;
import org.example.helpers.messages.GeneralRegex;
import org.example.helpers.messages.MercanciaMessage;

public class MercanciaValidation {

    RegexValidator regexValidator = new RegexValidator();

    public boolean validateId(Integer id) throws Exception{
        if (id < 0) {
            throw new Exception(MercanciaMessage.ID_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateVolumen(Double volumen) throws Exception {
        if (volumen < 0) {
            throw new Exception(MercanciaMessage.VOLUMEN_POSITIVO.getMessageError());
        } else if (volumen > 100) {
            throw new Exception(MercanciaMessage.VOLUMEN_MAXIMO.getMessageError());
        }
        return true;
    }

    public boolean validateTipo(String tipo) throws Exception {
        boolean validation = regexValidator.validarRegexString(GeneralRegex.VALIDATION_TIPO.getRegex(), tipo);
        if (!validation) {
            throw new Exception(MercanciaMessage.TIPO_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validatePeso(Double peso) throws Exception {
        if (peso < 0) {
            throw new Exception(MercanciaMessage.PESO_POSITIVO.getMessageError());
        } else if (peso > 1000) {
            throw new Exception(MercanciaMessage.PESO_MAXIMO.getMessageError());
        }
        return true;
    }

    public boolean validateDescripcion(String descripcion) throws Exception {
        if (descripcion.length() > 100) {
            throw new Exception(MercanciaMessage.DESCRIPCION_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateAvaluo(Integer avaluo) throws Exception {
        if (avaluo < 0) {
            throw new Exception(MercanciaMessage.AVALUO_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateDireccionRemitente(String direccionRemitente) throws Exception {
        if (direccionRemitente.length() > 200) {
            throw new Exception(MercanciaMessage.DIRECCION_REMITENTE_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateDireccionDestinatario(String direccionDestinatario) throws Exception {
        if (direccionDestinatario.length() > 200) {
            throw new Exception(MercanciaMessage.DIRECCION_DESTINATARIO_CARACTERES.getMessageError());
        }
        return true;
    }

}

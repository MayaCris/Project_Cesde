package org.example.helpers.validations;

import org.example.helpers.messages.GeneralRegex;
import org.example.helpers.Regex.RegexValidator;
import org.example.helpers.messages.VehiculoMessage;

import java.time.LocalDate;

public class VehiculoValidation {

    RegexValidator regexValidator = new RegexValidator();


    public boolean validateId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(VehiculoMessage.ID_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateMarca(String marca) throws Exception {
        boolean validation =  regexValidator.validarRegexString(GeneralRegex.VALIDATION_MARCA.getRegex(), marca);
        if (!validation) {
            throw new Exception(VehiculoMessage.MARCA_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateModelo(String modelo) throws Exception {
        boolean validation =  regexValidator.validarRegexString(GeneralRegex.VALIDATION_MODELO.getRegex(), modelo);
        if (!validation) {
            throw new Exception(VehiculoMessage.MODELO.getMessageError());
        }
        return true;
    }

    public boolean validateKilometraje(Double kilometraje) throws Exception {
        if (kilometraje < 0 || kilometraje > 100000) {
            throw new Exception(VehiculoMessage.KILOMETRAJE_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateColor(String color) throws Exception {
        boolean validation =  regexValidator.validarRegexString(GeneralRegex.VALIDATION_COLOR.getRegex(), color);
        if (!validation) {
            throw new Exception(VehiculoMessage.COLOR_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateDescripcion(String descripcion) throws Exception {
        boolean validation =  regexValidator.validarRegexString(GeneralRegex.VALIDATION_DESCRIPCION.getRegex(), descripcion);
        if (!validation) {
            throw new Exception(VehiculoMessage.DESCRIPCION_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateTipo(String tipo) throws Exception {
        boolean validation =  regexValidator.validarRegexString(GeneralRegex.VALIDATION_TIPO.getRegex(), tipo);
        if (!validation) {
            throw new Exception(VehiculoMessage.TIPO_CARACTERES.getMessageError());
        }
        return true;
    }

    public boolean validateAutonomia(Double autonomia) throws Exception {
        if (autonomia < 0 || autonomia > 72) {
            throw new Exception(VehiculoMessage.AUTONOMIA_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateCapacidadCarga(Double capacidadCarga) throws Exception {
        if (capacidadCarga < 0 || capacidadCarga > 1000) {
            throw new Exception(VehiculoMessage.CAPACIDAD_CARGA_POSITIVO.getMessageError());
        }
        return true;
    }

    public boolean validateAvaluo(Integer avaluo) throws Exception {
        if (avaluo < 0) {
            throw new Exception(VehiculoMessage.AVALUO_POSITIVO.getMessageError());
        }
        return true;
    }

}

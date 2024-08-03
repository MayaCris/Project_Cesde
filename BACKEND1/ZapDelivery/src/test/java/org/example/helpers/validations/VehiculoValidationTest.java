package org.example.helpers.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoValidationTest {

    //La clase sujeta a prueba
    private VehiculoValidation vehiculoValidation;

    //Configuración inicial de la prueba

    //Las anotaciones son funciones que reciben otras funciones


    @BeforeEach
    public void setUp(){
        this.vehiculoValidation = new VehiculoValidation();
    }

    //Pruebas unitarias para cada metodo de la clase que estoy probando

    //ValidarID opera correctamente
    @Test
    public void validarIdOperaCorrectamente(){
        //Prepare
        Integer idPrueba = 20;

        //Apunte //Verifique
        Assertions.assertDoesNotThrow(()->this.vehiculoValidation.validateId(idPrueba));

    }

    //ValidarID Falla por id erroneo
    @Test
    public void validarIdConNumeroNegativo(){
        //Prepare
        Integer idPrueba = -10;

        //Apunte
        Assertions.assertThrows(Exception.class, ()-> this.vehiculoValidation.validateId(idPrueba));

    }

}
package org.example.modelos;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasJava {
    public void probarFechas(){

        //1. Configurar fecha desde el usuario
        int anio = 1992;
        int mes = 10;
        int dia = 21;
        LocalDate fechaUsuario = LocalDate.of(anio, mes, dia);
        System.out.println("Fecha desde el usuario: " + fechaUsuario);

        //2. Configurar fecha desde el sistema
        LocalDate fechaSistema = LocalDate.now();
        System.out.println("Fecha desde el sistema: " + fechaSistema);

        //3. Operaciones comunes con fechas
        //3.1. Calcular la diferencia entre dos fechas
        Long diferenciaDias = ChronoUnit.DAYS.between(fechaUsuario, fechaSistema);
        Long diferenciaMeses = ChronoUnit.MONTHS.between(fechaUsuario, fechaSistema);
        Long diferenciaAnios = ChronoUnit.YEARS.between(fechaUsuario, fechaSistema);

        System.out.println("Diferencia en días: " + diferenciaDias);
        System.out.println("Diferencia en meses: " + diferenciaMeses);
        System.out.println("Diferencia en años: " + diferenciaAnios);

        //3.2. Sumar o restar días a una fecha
        DayOfWeek diaSemana = fechaSistema.getDayOfWeek(); // Obtener el día de una fecha
        System.out.println("Día de la semana: " + diaSemana);

        LocalDate fechaSuma = fechaUsuario.plusDays(10);
        System.out.println("Fecha sumada: " + fechaSuma);

        LocalDate fechaResta = fechaUsuario.minusDays(10);
        System.out.println("Fecha restada: " + fechaResta);

        //3.3. Obteniendo datos de una fecha
        DayOfWeek diaSemanaFecha = fechaSistema.getDayOfWeek();
        int diaMes = fechaSistema.getDayOfMonth();
        int diaAnio = fechaSistema.getDayOfYear();

        System.out.println("Fecha del sistema: " + fechaSistema);
        System.out.println("Día de la semana: " + diaSemanaFecha);
        System.out.println("Día del mes: " + diaMes);
        System.out.println("Día del año: " + diaAnio);

        //3.4. Cambiar el formato de una fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaSistema.format(formato);

        System.out.println("Fecha del sistema: " + fechaSistema);
        System.out.println("Fecha formateada: " + fechaFormateada);


    }

}

package com.sofka.ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    LocalDateTime fechaHora;

    public void mostrarFechaYHoraActual()
    {
        this.fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:SS");

        System.out.println(formatter.format(this.fechaHora));
    }
}

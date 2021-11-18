package com.sofka.ejercicio8;

public class Dia {
    String nombreDia;

    public Dia(String dia) {
        this.nombreDia = dia;
    }

    public void esDiaLaboral()
    {
        switch (this.nombreDia)
        {
            case "lunes":
                System.out.println("Si es un día laboral");
                break;
            case "martes":
                System.out.println("Si es un día laboral");
                break;
            case "miercoles":
                System.out.println("Si es un dia laboral");
                break;
            case "jueves":
                System.out.println("Si es un día laboral");
                break;
            case "viernes":
                System.out.println("Si es un día laboral");
                break;
            case "sabado":
                System.out.println("No es un día laboral");
                break;
            case "domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Lo ingresado no es un dia de la semana");
                break;
        }
    }
}

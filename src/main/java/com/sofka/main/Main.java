package com.sofka.main;

import com.sofka.ejercicio1y2.NumeroMayor;
import com.sofka.ejercicio3.Circulo;

import java.util.Scanner;

public class Main {

    static Scanner lector = new Scanner(System.in);;

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("Ingrese la opcion que deseea ejecutar: \n" +
                    "1. Ejecutar ejercicio 1\n" +
                    "2. Ejecutar ejercicio 2\n");
            option = lector.nextInt();

            switch (option)
            {
                case 1: ejecutarEjercicio1();
                    break;
                case 2: ejecutarEjercicio2();
                    break;
                case 3: ejecutarEjercicio3();
            }
        }while (option != 0);
    }

    public static void ejecutarEjercicio1() {
        NumeroMayor numeroMayor = new NumeroMayor();
        numeroMayor.indicarNumeroMayor();
    }
    public static void ejecutarEjercicio2() {
        System.out.println("Ingrese el primer numero");
        double primer_numero = lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        double segundo_numero = lector.nextInt();

        NumeroMayor numeroMayor = new NumeroMayor(primer_numero, segundo_numero);
        numeroMayor.indicarNumeroMayor();
    }
    private static void ejecutarEjercicio3() {
        System.out.println("Digite el radio del circulo");
        double radio = Double.parseDouble(lector.next());

        Circulo circulo = new Circulo(radio);
        circulo.calcularArea();
    }
}

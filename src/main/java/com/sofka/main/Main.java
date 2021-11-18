package com.sofka.main;

import com.sofka.ejercicio1y2.NumeroMayor;
import com.sofka.ejercicio3.Circulo;
import com.sofka.ejercicio4.Producto;
import com.sofka.ejercicio5y6.ParesEImpares;
import com.sofka.ejercicio7.MayorOIgualACero;
import com.sofka.ejercicio8.Dia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("Ingrese el ejercicio que deseea ejecutar: \n" +
                    "1. Conocer cual numero es mayor\n" +
                    "2. Dar dos numeros y conocer cual es mayor\n" +
                    "3. Calcular area de un circulo\n" +
                    "4. Calcular precio de un prducto con IVA incluido\n" +
                    "5. Consultar numeros pares e impares del 1 al 100 (ciclo while)\n" +
                    "6. Consultar numeros pares e impares del 1 al 100 (ciclo for)\n" +
                    "7. Comprobar si un numero es mayor o igual que cero");
            option = lector.nextInt();

            switch (option)
            {
                case 1: ejecutarEjercicio1();
                    break;
                case 2: ejecutarEjercicio2();
                    break;
                case 3: ejecutarEjercicio3();
                    break;
                case 4: ejecutarEjercicio4();
                    break;
                case 5: ejecutarEjercicio5();
                    break;
                case 6: ejecutarEjercicio6();
                    break;
                case 7: ejecutarEjercicio7();
                    break;
                case 8: ejecutarEjercicio8();
                    break;
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
    private static void ejecutarEjercicio4() {
        System.out.println("Digite el precio del producto");
        double precio = lector.nextDouble();
        Producto producto = new Producto(precio);

        producto.calcularPrecioFinal();
        producto.mostrarPrecioFinal();
    }
    private static void ejecutarEjercicio5() {
        ParesEImpares paresEImpares = new ParesEImpares();

        paresEImpares.cargarArrayLists();
        paresEImpares.imprimirConCicloWhile();
    }
    private static void ejecutarEjercicio6() {
        ParesEImpares paresEImpares = new ParesEImpares();

        paresEImpares.cargarArrayLists();
        paresEImpares.imprimirConCicloFor();
    }
    private static void ejecutarEjercicio7() {
        MayorOIgualACero objeto = new MayorOIgualACero();
        objeto.ingresarNumero();
        objeto.mostrarNumero();
    }
    private static void ejecutarEjercicio8() {
        System.out.println("Ingrese el dia de la semana del que desea conocer si es dia laboral");
        String nombreDia = lector.next().toLowerCase(Locale.ROOT);

        Dia dia = new Dia(nombreDia);
        dia.esDiaLaboral();
    }

}

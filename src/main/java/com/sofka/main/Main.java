package com.sofka.main;

import com.sofka.ejercicio1y2.NumeroMayor;
import com.sofka.ejercicio3.Circulo;
import com.sofka.ejercicio4.Producto;
import com.sofka.ejercicio5.Ejercicio5;

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
                    "5. Consultar numeros pares e impares del 1 al 100\n");
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
        Ejercicio5 ejercicio5 = new Ejercicio5();

        ejercicio5.cargarArrayLists();
        ejercicio5.imprimirImpares();
        ejercicio5.imprimirPares();
    }
}

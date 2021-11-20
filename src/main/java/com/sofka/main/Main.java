package com.sofka.main;

import com.sofka.ejercicio12.EjercicioDoce;
import com.sofka.ejercicio13.Fecha;
import com.sofka.ejercicio16.ControladorPersona;
import com.sofka.ejercicio16.Persona;
import com.sofka.ejercicio17.Electrodomestico;
import com.sofka.ejercicio17.Lavadora;
import com.sofka.ejercicio17.Television;
import com.sofka.ejercicio18.Serie;
import com.sofka.ejercicio18.VideoJuego;
import com.sofka.ejercicio1_2.NumeroMayor;
import com.sofka.ejercicio3.Circulo;
import com.sofka.ejercicio4.Producto;
import com.sofka.ejercicio5_6.ParesEImpares;
import com.sofka.ejercicio7.MayorOIgualACero;
import com.sofka.ejercicio8.Dia;
import com.sofka.ejercicio9_10_11.Texto;

import javax.naming.PartialResultException;
import java.time.LocalTime;
import java.util.ArrayList;
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
                    "7. Comprobar si un numero es mayor o igual que cero\n" +
                    "8. Conocer si un dia de la semana ingresado es dia laboral\n" +
                    "9. Reemplazar las 'a' de una frase por la 'e' y concatenar una frase\n" +
                    "10. Ingresar frase y eliminar espacios\n" +
                    "11. Ingresar frase para conocer su longitud y cantidad de vocales\n" +
                    "12. Digitar dos palabras y compararlas.\n" +
                    "13. Consultar fecha y hora actual\n" +
                    "14. Numeros de 2 en 2 hasta mil desde un dato ingresado\n" +
                    "15. Menú de opciones GESTIÓN CINEMATOGRAFICA\n" +
                    "16. Ingresar datos de objeto Persona\n" +
                    "17. Conocer precioFinal de los electrodomesticos por medio de herencia\n" +
                    "18. Implementación de interface para entregar libros, series y mostrar su info");
            option = Integer.parseInt(lector.next());

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
                case 9: ejecutarEjercicio9();
                    break;
                case 10: ejecutarEjercicio10();
                    break;
                case 11: ejecutarEjercicio11();
                    break;
                case 12: ejecutarEjercicio12();
                    break;
                case 13: ejecutarEjercicio13();
                    break;
                case 14: ejecutarEjercicio14();
                    break;
                case 15: ejecutarEjercicio15();
                    break;
                case 16: ejecutarEjercicio16();
                    break;
                case 17: ejecutarEjercicio17();
                    break;
                case 18: ejecutarEjercicio18();
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
    private static void ejecutarEjercicio9() {
        String frase = "La sonrisa sera la mejor arma contra la tristeza.";
        String fraseAConcatenar = " Usala, no te la guardes.";

        Texto texto = new Texto(frase);
        texto.reemplazarLetraYConcatenarFrase(fraseAConcatenar);
        texto.mostrarFrase();
    }
    private static void ejecutarEjercicio10() {
        lector.nextLine();
        System.out.print("Ingrese la frase: ");
        String frase = lector.nextLine();

        Texto texto = new Texto(frase);
        texto.eliminarEspacios();
        texto.mostrarFrase();
    }
    private static void ejecutarEjercicio11() {
        lector.nextLine();
        System.out.print("Ingrese la frase: ");
        String frase = lector.nextLine();

        Texto texto = new Texto(frase);
        texto.asignaryMostrarLongitud(true);
        texto.contarVocalesYMostrar();
    }
    private static void ejecutarEjercicio12() {
        System.out.println("Ingrese la primera palabra ");
        String primeraPalabra = lector.next();
        System.out.println("Ingrese la primera palabra ");
        String segundaPalabra = lector.next();

        EjercicioDoce objeto = new EjercicioDoce(primeraPalabra, segundaPalabra);
        objeto.compararPalabras();
    }
    private static void ejecutarEjercicio13() {
        Fecha fecha = new Fecha();

        fecha.mostrarFechaYHoraActual();
    }
    private static void ejecutarEjercicio14() {
        System.out.print("Ingresa el numero desde donde quieres empezar los saltos: ");
        int numero =Integer.parseInt(lector.next());

        while (numero<=1000)
        {
            System.out.println(numero);
            numero +=2;
        }
    }
    private static void ejecutarEjercicio15() {

        int opcion;
        do {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR ");
            opcion =Integer.parseInt(lector.next());

            switch (opcion)
            {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        }while (opcion != 8);
    }
    private static void ejecutarEjercicio16() {
        ControladorPersona controladorPersona = new ControladorPersona();
        controladorPersona.iniciarFlujo();
    }
    private static void ejecutarEjercicio17() {
        Television television;
        Lavadora lavadora;
        String preciosTelevisores = "PRECIOS TELEVISORES:\n";
        String preciosLavadoras = "PRECIOS LAVADORAS:\n";
        String preciosElectrodomesticos = "PRECIOS ELECTRODOMESTICOS:\n";
        double sumaPreciosTelevisores = 0;
        double sumaPreciosLavadoras = 0;
        double sumaPreciosElectrodomesticos = 0;

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
        electrodomesticos.add(new Lavadora(100,"Azul", 'E',153,50));
        electrodomesticos.add(new Lavadora(135,"Purpura", 'K',15,50));
        electrodomesticos.add(new Television(250,"Azul", 'A',35,50,true));
        electrodomesticos.add(new Electrodomestico(400,"Negro", 'A',15));
        electrodomesticos.add(new Lavadora(135,"Purpura", 'K',15,50));
        electrodomesticos.add(new Television(300,"Negro", 'E',10,32,false));
        electrodomesticos.add(new Electrodomestico(200,"Rojo", 'A',15));
        electrodomesticos.add(new Television(85,"Negro", 'F',15,65,false));

        for (Electrodomestico electrodomestico:
             electrodomesticos) {
            if(electrodomestico instanceof Television) {
                television = ((Television)electrodomestico);
                television.PrecioFinal();
                preciosTelevisores += television.getPrecioFinal() + "\n";
                sumaPreciosTelevisores += television.getPrecioFinal();
            }
            else if(electrodomestico instanceof Lavadora) {
                lavadora = ((Lavadora)electrodomestico);
                lavadora.PrecioFinal();
                preciosLavadoras += lavadora.getPrecioFinal() + "\n";
                sumaPreciosLavadoras += lavadora.getPrecioFinal();
            }
            else
            {
                electrodomestico.PrecioFinal();
                preciosElectrodomesticos += electrodomestico.getPrecioFinal() + "\n";
                sumaPreciosElectrodomesticos += electrodomestico.getPrecioFinal();
            }
        }

        System.out.println(preciosTelevisores + " TOTAL: " + sumaPreciosTelevisores + "\n"
                + preciosLavadoras + " TOTAL: " + sumaPreciosLavadoras + "\n"
                + preciosElectrodomesticos + " TOTAL: " + sumaPreciosElectrodomesticos);
        System.out.println("PARA UN RESULTADO TOTAL DE: " + (sumaPreciosTelevisores+sumaPreciosLavadoras+sumaPreciosElectrodomesticos));
    }
    private static void ejecutarEjercicio18() {
        ArrayList<Serie> series = new ArrayList<>(5);
        ArrayList<VideoJuego> videoJuegos = new ArrayList<>(5);

        series.add(new Serie("Cazadores de sombras", "Cassandra Clare"));
        series.add(new Serie("Sex Education",3,"Drama-Comedia", "Cassandra Clare"));
        series.add(new Serie("The Umbrella Academy", "Kevin Lafferty"));
        series.add(new Serie("Titans", 3, "Accion","Cassandra Clare"));
        series.add(new Serie("la saga Winx", "Archery Pictures"));

        videoJuegos.add(new VideoJuego("Minecraft", LocalTime.of(2,00)));
        videoJuegos.add(new VideoJuego("Halo", LocalTime.of(1,00)));
        videoJuegos.add(new VideoJuego());
        videoJuegos.add(new VideoJuego("Minions", LocalTime.of(0,30), "infantil", "Gameloft"));
        videoJuegos.add(new VideoJuego("Crash", LocalTime.of(3,00)));

        series.get(0).entregar();
        series.get(1).entregar();
        videoJuegos.get(2).entregar();
        videoJuegos.get(4).entregar();

        System.out.println("Hay " + videoJuegos.stream().filter(x->x.isEntregado()).count() + " video juegos entregados.");
        System.out.println("Hay " + series.stream().filter(x->x.isEntregado()).count() + " series entregadas.");

        series.get(0).devolver();
        series.get(1).devolver();
        videoJuegos.get(2).devolver();
        videoJuegos.get(4).devolver();

    }
}

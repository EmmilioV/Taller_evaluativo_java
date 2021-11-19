package com.sofka.ejercicio16;

import java.util.Scanner;

public class ControladorPersona
{

    public void iniciarFlujo()
    {
        Scanner lector = new Scanner(System.in);

        System.out.print("ingrese el nombre de la persona: ");
        String nombre = lector.nextLine();
        System.out.println("ingrese la edad de la persona: ");
        int edad = Integer.parseInt(lector.next());
        System.out.println("ingrese el sexo de la persona H para hombre ó M para mujer: ");
        char sexo = lector.next().charAt(0);
        System.out.println("ingrese el peso de la persona: ");
        double peso = Double.parseDouble(lector.next());
        System.out.println("ingrese la altura de la persona: ");
        double altura = Double.parseDouble(lector.next());

        Persona[] personas = crearObjetos(nombre, edad, sexo, peso, altura);
        comprobarPersonasEnPesoIdeal(personas);
        comprobarMayoriaDeEdad(personas);
        mostrarInformacion(personas);
    }

    private Persona[] crearObjetos(String nombre, int edad, char sexo, double peso, double altura) {
        //objeto1
        Persona persona1 = new Persona( nombre,  edad, sexo,  peso,  altura);

        //objeto2
        Persona persona2 = new Persona( nombre,  edad, sexo);
        persona2.setPeso(53);
        persona2.setAltura(1.68);

        //objeto3
        Persona persona3 = new Persona();
        persona3.setNombre("Pablo Emilio");
        persona3.setEdad(20);
        persona3.setSexo('H');
        persona3.setPeso(60.6);
        persona3.setAltura(1.78);

        Persona[] personas = {persona1, persona2, persona3};
        return personas;

    }

    private void comprobarPersonasEnPesoIdeal(Persona[] personas) {
        for (Persona persona:
             personas) {
            long estadoDePeso = persona.calcularIMC();
            if(estadoDePeso == -1)
                System.out.println("la persona con el nombre de " + persona.getNombre() + " está en su peso ideal");
            else if(estadoDePeso == 0)
                System.out.println("la persona con el nombre de " + persona.getNombre() + " está por debajo de su peso ideal");
            else
                System.out.println("la persona con el nombre de " + persona.getNombre() + " tiene sobre peso");
        }
    }

    private void comprobarMayoriaDeEdad(Persona[] personas) {
        for (Persona persona:
                personas) {
            boolean esMayorDeEdad = persona.esMayorDeEdad();
            if(esMayorDeEdad)
                System.out.println("la persona con el nombre de " + persona.getNombre() + " es mayor de edad.");
            else
                System.out.println("la persona con el nombre de " + persona.getNombre() + " no es mayor de edad.");

        }
    }

    private void mostrarInformacion(Persona[] personas)
    {
        for (Persona persona:
                personas) {
            System.out.println(persona.toString());
            System.out.println("\n");
        }
    }
}

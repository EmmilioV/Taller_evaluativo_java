package com.sofka.ejercicio5;

import java.util.ArrayList;

public class Ejercicio5 {
    ArrayList<Integer> impares = new ArrayList<>();
    ArrayList<Integer> pares = new ArrayList<>();

    public void cargarArrayLists()
    {
        int i = 100;
        while (i>0)
        {
            if(i%2  == 0)
            {
                this.pares.add(i);
            }
            else
            {
                this.impares.add(i);
            }
            i--;
        }
    }

    public void imprimirImpares()
    {
        System.out.println("los numeros impares son: ");
        impares.stream().forEach(System.out::println);
    }

    public void imprimirPares()
    {
        System.out.println("los numeros pares son: ");
        pares.stream().forEach(System.out::println);
    }
}

package com.sofka.ejercicio5y6;

import java.util.ArrayList;

public class ParesEImpares {
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

    public void imprimirConCicloWhile()
    {
        int i = impares.size()-1;
        System.out.println("Los numeros impares son: ");

        while (i>=0)
        {
            System.out.println(impares.get(i));
            i--;
        }

        i = pares.size()-1;
        System.out.println("Los numeros pares son: ");

        while (i>=0)
        {
            System.out.println(pares.get(i));
            i--;
        }
    }

    public void imprimirConCicloFor()
    {
        System.out.println("Los numeros impares son: ");

        for (int i = impares.size()-1; i>0; i--)
        {
            System.out.println(impares.get(i));
        }

        System.out.println("Los numeros pares son: ");

        for (int i = pares.size()-1; i>0; i--)
        {
            System.out.println(pares.get(i));
        }
    }
}

package com.sofka.ejercicio7;

import java.util.Scanner;

public class MayorOIgualACero
{
    int numero;

    public void ingresarNumero()
    {
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese el número, debe de ser mayor o igual que cero");
            this.numero = leer.nextInt();
        }while (this.numero<0);
    }

    public void mostrarNumero()
    {
        System.out.println("El numero es: " + this.numero);
    }
}

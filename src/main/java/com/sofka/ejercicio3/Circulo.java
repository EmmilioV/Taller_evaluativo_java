package com.sofka.ejercicio3;

public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea()
    {
        System.out.println("el area del circulo es: " + (Math.PI*Math.pow(this.radio,2)));
    }
}

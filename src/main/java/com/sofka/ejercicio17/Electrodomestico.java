package com.sofka.ejercicio17;


import java.util.ArrayList;
import java.util.Locale;

public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private double precioFinal;

    public Electrodomestico() {
        this.precioBase = 100;
        this.precioFinal = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.precioFinal = precioBase;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.precioFinal = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        ArrayList<Character> letrasConsumoEnergetico = new ArrayList<>();
        letrasConsumoEnergetico.add('A');
        letrasConsumoEnergetico.add('B');
        letrasConsumoEnergetico.add('C');
        letrasConsumoEnergetico.add('D');
        letrasConsumoEnergetico.add('E');
        letrasConsumoEnergetico.add('F');

        if(letrasConsumoEnergetico.stream().filter(x->x.equals(letra)).count() != 0)
            return letra;
        else
            return 'F';
    }

    private String comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();

        if(colores.stream().filter(x->x.equalsIgnoreCase(color)).count() != 0)
            return color.toLowerCase();
        else
            return "blanco";
    }

    public void PrecioFinal() {
        aumentarPrecioPorConsumoEnergetico();
        aumentarPrecioPorPeso();
    }

    public void aumentarPrecioPorConsumoEnergetico() {
        double aumento = 0;
        switch (this.consumoEnergetico)
        {
            case 'A': aumento = 100;
                break;
            case 'B': aumento = 80;
                break;
            case 'C': aumento = 60;
                break;
            case 'D': aumento = 50;
                break;
            case 'E': aumento = 30;
                break;
            case 'F': aumento = 10;
                break;
            default: break;
        }

        this.precioFinal += + aumento;
    }

    public void aumentarPrecioPorPeso() {
        double aumento = 0;

        if(this.peso >=0 && this.peso <=19)
            aumento = 10;
        else if(this.peso >=20 && this.peso <=49)
            aumento = 50;
        else if(this.peso >=50 && this.peso <=79)
            aumento = 80;
        else
            aumento = 100;

        this.precioFinal += aumento;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}

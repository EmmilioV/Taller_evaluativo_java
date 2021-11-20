package com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal();
    }
}

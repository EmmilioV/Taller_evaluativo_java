package com.sofka.ejercicio17;

public class Television extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTdt;

    public Television() {
        this.resolucion = 20;
        this.sintonizadorTdt = false;
    }

    public Television(double precioBase, double peso){
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTdt = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal();
        if(this.resolucion > 40)
            this.precioFinal += this.precioBase*0.3;
        if(this.sintonizadorTdt)
            this.precioFinal += 50;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }
}

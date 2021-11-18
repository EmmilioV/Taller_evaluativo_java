package com.sofka.ejercicio4;

public class Producto {
    double precio;
    double precioFinal;
    double iva;

    public Producto(double precio) {
        this.precio = precio;
        this.iva = 0.21;
    }

    public void calcularPrecioFinal()
    {
        this.precioFinal = this.precio +  (this.precio*this.iva);
    }

    public void mostrarPrecioFinal()
    {
        System.out.println("El precio final del producto es: " + this.precioFinal);
    }
}

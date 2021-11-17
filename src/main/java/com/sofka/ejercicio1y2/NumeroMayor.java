package com.sofka.ejercicio1y2;

public class NumeroMayor {
    double primer_numero;
    double segundo_numero;

    public NumeroMayor() {
        this.primer_numero = 78;
        this.segundo_numero = 7;
    }

    public NumeroMayor(double primer_numero, double segundo_numero) {
        this.primer_numero = primer_numero;
        this.segundo_numero = segundo_numero;
    }

    public void indicarNumeroMayor()
    {
        if(this.primer_numero > this.segundo_numero)
        {
            System.out.println(this.primer_numero + " es el numero mayor");
        }
        else if(this.primer_numero < this.segundo_numero)
        {
            System.out.println(this.segundo_numero + " es el numero mayor");

        }
        else
        {
            System.out.println("ambos numeros son iguales: " + this.segundo_numero + " = " + this.primer_numero);
        }
    }
}

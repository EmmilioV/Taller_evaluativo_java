package com.sofka.ejercicio9;

public class Texto {
    String frase;

    public Texto(String frase) {
        this.frase = frase;
    }

    public void reemplazarLetraYConcatenarFrase(String fraseAConcatenar)
    {
        this.frase = this.frase.replace('a', 'e');
        this.frase = this.frase.concat(fraseAConcatenar);
    }

    public void mostrarFrase()
    {
        System.out.println(this.frase);;
    }
}

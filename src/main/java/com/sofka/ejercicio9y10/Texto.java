package com.sofka.ejercicio9y10;

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

    public void  eliminarEspacios()
    {
        String[] palabras= this.frase.split(" ");
        this.frase = "";
        for (String palabra:
             palabras) {
            this.frase = this.frase.concat(palabra);
        }
    }

    public void mostrarFrase()
    {
        System.out.println(this.frase);
    }
}

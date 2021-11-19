package com.sofka.ejercicio9_10_11;

public class Texto {
    String frase;
    int longitud;

    public Texto(String frase) {
        this.frase = frase;
    }

    public void reemplazarLetraYConcatenarFrase(String fraseAConcatenar) {
        this.frase = this.frase.replace('a', 'e');
        this.frase = this.frase.concat(fraseAConcatenar);
    }

    public void  eliminarEspacios()
    {
        this.frase = this.frase.replace(" ","");
    }

    public void mostrarFrase()
    {
        System.out.println(this.frase);
    }

    public void asignaryMostrarLongitud(boolean mostrar) {
        eliminarEspacios();
        this.longitud = this.frase.length();
        if(mostrar)
        {
            System.out.println("La longitud de la frase sin espacios es: " + this.longitud);
        }
    }

    public void contarVocalesYMostrar(){
        int cantidadA = 0, cantidadE = 0, cantidadI = 0, cantidadO = 0, cantidadU = 0;
        char temp;

        asignaryMostrarLongitud(false);

        for(int k=0;k<this.longitud;k++)
        {
            temp = this.frase.charAt(k);
            switch (temp)
            {
                case 'a': cantidadA++;
                    break;
                case 'e': cantidadE++;
                    break;
                case 'i': cantidadI++;
                    break;
                case 'o': cantidadO++;
                    break;
                case 'u': cantidadU++;
                    break;
                default: break;
            }
        }
        System.out.println("la frase contiene:\n " +
                cantidadA+" a\n " +
                cantidadE+" e\n " +
                cantidadI+" i\n " +
                cantidadO+" o\n " +
                cantidadU+" u" );
    }

}

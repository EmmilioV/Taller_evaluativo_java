package com.sofka.ejercicio12;

public class EjercicioDoce {
    String primeraPalabra;
    String segundaPalabra;

    public EjercicioDoce(String primeraPalabra, String segundaPalabra) {
        this.primeraPalabra = primeraPalabra;
        this.segundaPalabra = segundaPalabra;
    }

    public void compararPalabras(){

        if(this.primeraPalabra.equalsIgnoreCase(this.segundaPalabra))
        {
            System.out.println("las palabras ingresadas son iguales");
        }
        else
        {
            String palabraMasCorta = this.primeraPalabra,
                    palabraMasLarga = this.segundaPalabra;

            if(this.primeraPalabra.length() > this.segundaPalabra.length())
            {
                palabraMasCorta = this.segundaPalabra;
                palabraMasLarga = this.primeraPalabra;
            }

            System.out.println(buscarDiferencias(palabraMasCorta, palabraMasLarga));
        }
    }

    public String buscarDiferencias(String palabraMasCorta, String palabraMasLarga)
    {
        String  diferencias="";
        char temp;
        int auxIndex = 0;

        for(int k=0;k<palabraMasCorta.length();k++)
        {
            temp = this.primeraPalabra.charAt(k);
            if(temp!=this.segundaPalabra.charAt(k))
            {
                diferencias = diferencias + " en la posicion " + (k+1) +" "+ this.primeraPalabra + " tiene una " + temp +
                        " mientras que " + this.segundaPalabra + " tiene una " + this.segundaPalabra.charAt(k) + "\n";
            }
            auxIndex = k+1;
        }

        if(!palabraMasLarga.substring(auxIndex).equals(""))
        {
            diferencias = diferencias + " y ademas " + palabraMasLarga + " tiene esta(s) letra(s) de más: "  + palabraMasLarga.substring(auxIndex);
        }

        return(diferencias);
    }
}

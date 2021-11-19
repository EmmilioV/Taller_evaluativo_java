package com.sofka.ejercicio16;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public long calcularIMC() {
        double pesoIdeal = this.peso / Math.pow(this.altura,2);
        final long enPesoIdeal = -1;
        final long enBajoPeso = 0;
        final long enSobrePeso = 1;

        if(pesoIdeal < 20)
            return enPesoIdeal;
        else if(pesoIdeal >= 20 && pesoIdeal <= 25)
            return enBajoPeso;
        else
            return enSobrePeso;
    }

    public boolean esMayorDeEdad() {
        if(this.edad >= 18)
        {
            return true;
        }
        return false;
    }

    private void comprobarSexo(char sexo) {
        if(sexo == 'M')
            this.sexo = 'M';
        else
            this.sexo = 'H';
    }

    public String toString() {
        return  " nombre : " + this.nombre +
                " \nedad: " + this.edad +
                " \ndni: " + this.dni +
                " \nsexo: " + this.sexo +
                " \npeso: " + this.peso +
                " \naltura: " + this.altura;
    }

    private String generarDNI() {
        final int numeroAleatorio = (int) (Math.random()*(100000000-10000000)+100000000);
        int resto = numeroAleatorio % 23;

        return String.valueOf(numeroAleatorio) + buscarLetraParaDNI(resto);
    }

    private char buscarLetraParaDNI(int resto) {
        char[] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letrasDNI[resto];
    }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
}

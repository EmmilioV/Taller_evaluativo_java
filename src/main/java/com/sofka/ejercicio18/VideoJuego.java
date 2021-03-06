package com.sofka.ejercicio18;

import java.time.LocalTime;

public class VideoJuego implements IEntregable{
    String titulo;
    LocalTime horasEstimadas;
    boolean entregado;
    String genero;
    String compania;

    public VideoJuego() {
        this.titulo = "";
        this.horasEstimadas = LocalTime.of(10,00);
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, LocalTime horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, LocalTime horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return  0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(LocalTime horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compa??ia='" + compania + '\'' +
                '}';
    }
}

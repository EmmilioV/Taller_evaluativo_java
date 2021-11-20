package com.sofka.ejercicio18;

import java.time.LocalTime;

public class VideoJuego {
    String titulo;
    LocalTime horasEstimadas;
    boolean entregado;
    String genero;
    String compañia;

    public VideoJuego() {
        this.titulo = "";
        this.horasEstimadas = LocalTime.of(10,00);
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public VideoJuego(String titulo, LocalTime horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public VideoJuego(String titulo, LocalTime horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
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

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
}

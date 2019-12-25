package com.example.apptransporte.Dto;

public class Colectivo {
    private int idColectivo;
    private String nombre_linea,color_linea;
    private int tarifa_n_linea;
    private int tarifa_e_linea;


    public Colectivo() {

    }

    public Colectivo(String nombre_linea, String color_linea, int tarifa_n_linea, int tarifa_e_linea) {
        this.nombre_linea = nombre_linea;
        this.color_linea = color_linea;
        this.tarifa_n_linea = tarifa_n_linea;
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public Colectivo(int idColectivo, String nombre_linea, String color_linea, int tarifa_n_linea, int tarifa_e_linea) {
        this.idColectivo = idColectivo;
        this.nombre_linea = nombre_linea;
        this.color_linea = color_linea;
        this.tarifa_n_linea = tarifa_n_linea;
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public String getNombre_linea() {
        return nombre_linea;
    }

    public void setNombre_linea(String nombre_linea) {
        this.nombre_linea = nombre_linea;
    }

    public int getTarifa_n_linea() {
        return tarifa_n_linea;
    }

    public void setTarifa_n_linea(int tarifa_n_linea) {
        this.tarifa_n_linea = tarifa_n_linea;
    }

    public int getTarifa_e_linea() {
        return tarifa_e_linea;
    }

    public void setTarifa_e_linea(int tarifa_e_linea) {
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public String getColor_linea() {
        return color_linea;
    }

    public void setColor_linea(String color_linea) {
        this.color_linea = color_linea;
    }

    public int getIdColectivo() {
        return idColectivo;
    }

    public void setIdColectivo(int idColectivo) {
        this.idColectivo = idColectivo;
    }
}

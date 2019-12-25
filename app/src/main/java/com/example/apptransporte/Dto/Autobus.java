package com.example.apptransporte.Dto;

public class Autobus {
    private int idBus;
    private String nombre_linea,color_linea;
    private int tarifa_n_linea;
    private int tarifa_e_linea;


    public Autobus() {

    }

    public Autobus(int idBus, String nombre_linea, String color_linea, int tarifa_n_linea, int tarifa_e_linea) {
        this.idBus = idBus;
        this.nombre_linea = nombre_linea;
        this.color_linea = color_linea;
        this.tarifa_n_linea = tarifa_n_linea;
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public Autobus(String nombre_linea, String color_linea, int tarifa_n_linea, int tarifa_e_linea) {
        this.nombre_linea = nombre_linea;
        this.color_linea = color_linea;
        this.tarifa_n_linea = tarifa_n_linea;
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
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
}

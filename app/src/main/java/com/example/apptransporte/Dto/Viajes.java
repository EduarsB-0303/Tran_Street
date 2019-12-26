package com.example.apptransporte.Dto;

import com.example.apptransporte.ui.sitioInteres.SitioInteres;

public class Viajes {
   private String sitio;
   private String linea;
   private int tarifa;
   private String color;

    public Viajes(String sitio, String linea, int tarifa, String color) {
        this.sitio = sitio;
        this.linea = linea;
        this.tarifa = tarifa;
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
}

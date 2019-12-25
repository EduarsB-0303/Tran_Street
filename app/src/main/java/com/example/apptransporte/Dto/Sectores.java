package com.example.apptransporte.Dto;

public class Sectores {
    private int idSector;
    private String nombre;

    public Sectores() {
    }

    public Sectores(int idSector, String nombre) {
        this.idSector = idSector;
        this.nombre = nombre;
    }

    public Sectores (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSector() {
        return idSector;
    }

    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }
}
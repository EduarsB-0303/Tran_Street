package com.example.apptransporte.Dto;

public class Sectores {
    private int idSector;
    private String nombre;
    private String imagenS;

    public Sectores() {
    }

    public Sectores(int idSector, String nombre) {
        this.idSector = idSector;
        this.nombre = nombre;
    }

    public Sectores(int idSecotr, String nombre, String imagenS){
        this.idSector = idSecotr;
        this.nombre = nombre;
        this.imagenS = imagenS;
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

    public void serImagenS(String imagenS){
        this.imagenS = imagenS;
    }

    public String getImagenS(){
    return imagenS;
}

}
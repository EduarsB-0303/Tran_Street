package com.example.apptransporte.Dto;

public class Favorito {
    private int idFav;
    private String nombre;
    private String imagenF;


    public Favorito() {
    }

    public Favorito(int idFav, String nombre) {
        this.idFav = idFav;
        this.nombre = nombre;
    }

    public Favorito(int idFav, String nombre, String imagenF) {
        this.idFav = idFav;
        this.nombre = nombre;
        this.imagenF = imagenF;
    }

    public int getIdFav() {
        return idFav;
    }

    public void setIdFav(int idFav) {
        this.idFav = idFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenF() {
        return imagenF;
    }

    public void setImagenF(String imagenF) {
        this.imagenF = imagenF;
    }
}

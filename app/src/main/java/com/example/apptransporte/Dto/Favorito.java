package com.example.apptransporte.Dto;

public class Favorito {
    private int idFav;
    private String nombre;


    public Favorito() {
    }

    public Favorito(int idFav, String nombre) {
        this.idFav = idFav;
        this.nombre = nombre;
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

}

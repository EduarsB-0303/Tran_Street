package com.example.apptransporte.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apptransporte.Dto.Favorito;
import com.example.apptransporte.Helpers.DatabaseHelper;

import java.util.ArrayList;

public class FavoritoDAL {

    private DatabaseHelper dbHelper;
    private Favorito fav;

    //Constructores
    public FavoritoDAL(Context context, Favorito fav){
        this.dbHelper = new DatabaseHelper(context);
        this.fav = fav;
    }

    public  FavoritoDAL(Context context) {
        this.dbHelper = new DatabaseHelper(context);
        this.fav = new Favorito();
    }



    //Métodos CRUD
    public void addFavorito(Favorito favorito){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        ContentValues c = new ContentValues();
        c.put("id_fav",favorito.getIdFav());
        c.put("nombre_fav",favorito.getNombre());
        try{
            db.insert("favorito",null,c);
        }catch (Exception e){

        }

    }
    public void eliminarFavorito(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        int filasAfectadas;
        try {
            filasAfectadas = db.delete("favorito","id_fav = ?",new String[]{ String.valueOf(id)});
        }catch (Exception e){

        }
    }

    public boolean esFavorito(int id){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor consulta = db.rawQuery("SELECT * FROM favorito WHERE id_fav = ?", new String[]{String.valueOf(id)});
        if(consulta.moveToFirst()) {
            do {
                return true;
            } while(consulta.moveToNext());
        }
        return false;
    }



    public ArrayList<Favorito> seleccionar() {
        ArrayList<Favorito> lista = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM favorito", null);

        if(consulta.moveToFirst()) {
            do {
                int idfav = consulta.getInt(0);
                String nombre = consulta.getString(1);

                Favorito f = new Favorito(idfav,nombre);
                lista.add(f);

            } while(consulta.moveToNext());
        }
        return lista;
    }
}

package com.example.apptransporte.dal;

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
    //Ver
    public ArrayList<Favorito> seleccionar() {
        ArrayList<Favorito> lista = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM favorito", null);

        if(consulta.moveToFirst()) {
            do {
                int id = consulta.getInt(0);
                String nombre = consulta.getString(1);

                Favorito f = new Favorito(id,nombre);
                lista.add(f);

            } while(consulta.moveToNext());
        }
        return lista;
    }
}

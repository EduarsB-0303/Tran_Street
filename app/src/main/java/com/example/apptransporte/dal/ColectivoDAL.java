package com.example.apptransporte.dal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apptransporte.Dto.Colectivo;
import com.example.apptransporte.Helpers.DatabaseHelper;

import java.util.ArrayList;

public class ColectivoDAL {
    private DatabaseHelper dbHelper;
    private Colectivo col;

    //Constructores
    public ColectivoDAL(Context context, Colectivo col){
        this.dbHelper = new DatabaseHelper(context);
        this.col = col;
    }

    public  ColectivoDAL(Context context) {
        this.dbHelper = new DatabaseHelper(context);
        this.col = new Colectivo();
    }

    //Métodos CRUD
    //Ver
    public ArrayList<Colectivo> seleccionar() {
        ArrayList<Colectivo> lista = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM colectivo", null);

        if(consulta.moveToFirst()) {
            do {
                int id = consulta.getInt(0);
                String nombre = consulta.getString(1);
                String color = consulta.getString(2);
                int tarifaN = consulta.getInt(3);
                int tarifaE = consulta.getInt(4);

                Colectivo m = new Colectivo(id,nombre,color,tarifaN,tarifaE);
                lista.add(m);

            } while(consulta.moveToNext());
        }
        return lista;
    }

    //????
    public Colectivo getCol() {
        return this.col;
    }
}

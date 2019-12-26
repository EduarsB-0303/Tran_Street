package com.example.apptransporte.Dal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apptransporte.Dto.Sectores;
import com.example.apptransporte.Helpers.DatabaseHelper;

import java.util.ArrayList;

public class SectorDAL {

    private DatabaseHelper dbHelper;
    private Sectores sector;

    //Constructores
    public SectorDAL(Context context, Sectores sector){
        this.dbHelper = new DatabaseHelper(context);
        this.sector = sector;
    }

    public  SectorDAL(Context context) {
        this.dbHelper = new DatabaseHelper(context);
        this.sector = new Sectores();
    }

    //Métodos CRUD
    //Ver
    public ArrayList<Sectores> seleccionar() {
        ArrayList<Sectores> lista = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM sector", null);

        if(consulta.moveToFirst()) {
            do {
                int id = consulta.getInt(0);
                String nombre = consulta.getString(1);

                Sectores m = new Sectores(id,nombre);
                lista.add(m);

            } while(consulta.moveToNext());
        }
        return lista;
    }

    //????
    public Sectores getSector() {
        return this.sector;
    }
}

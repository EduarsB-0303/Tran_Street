package com.example.apptransporte.dal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.apptransporte.Dto.Autobus;
import com.example.apptransporte.Helpers.DatabaseHelper;

import java.util.ArrayList;

public class AutobusDAL {
    private DatabaseHelper dbHelper;
    private Autobus micro;

    //Constructores
    public AutobusDAL(Context context, Autobus micro){
        this.dbHelper = new DatabaseHelper(context);
        this.micro = micro;
    }

    public  AutobusDAL(Context context) {
        this.dbHelper = new DatabaseHelper(context);
        this.micro = new Autobus();
    }

    //Métodos CRUD
    //Ver
    public ArrayList<Autobus> seleccionar() {
        ArrayList<Autobus> lista = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM autobus", null);

        if(consulta.moveToFirst()) {
            do {
                int id = consulta.getInt(0);
                String nombre = consulta.getString(1);
                String color = consulta.getString(2);
                int tarifaN = consulta.getInt(3);
                int tarifaE = consulta.getInt(4);

                Autobus m = new Autobus(id,nombre,color,tarifaN,tarifaE);
                lista.add(m);

            } while(consulta.moveToNext());
        }
        return lista;
    }

    //????
    public Autobus getMicro() {
        return this.micro;
    }
}

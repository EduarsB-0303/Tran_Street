package com.example.apptransporte.ui.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptransporte.Adapter.AdapterTransporte;
import com.example.apptransporte.Dto.Autobus;
import com.example.apptransporte.Dto.Colectivo;
import com.example.apptransporte.R;

import java.util.ArrayList;

public class InicioFragment extends Fragment {

    AdapterTransporte adapter;
    public RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);

        recyclerView=(RecyclerView)root.findViewById(R.id.idListaTransporte);

        adapter = new AdapterTransporte(ListaAutobusCompleta(),ListaColectivoCompleta());
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        return root;
    }
    public ArrayList<Autobus>ListaAutobusCompleta(){
        ArrayList<Autobus> listMicro = new ArrayList<>();
        listMicro.add(new Autobus("Autobus 999","#ff0000",500,150));
        listMicro.add(new Autobus("Autobus 888","#ffff00",500,150));
        listMicro.add(new Autobus("Autobus 777","#008000",500,150));
        listMicro.add(new Autobus("Autobus 666","#ffff00",500,150));
        listMicro.add(new Autobus("Autobus 555","#ff0000",500,150));
        listMicro.add(new Autobus("Autobus 444","#ff0000",500,150));
        listMicro.add(new Autobus("Autobus 333","#008000",500,150));
        listMicro.add(new Autobus("Autobus 222","#ffff00",500,150));
        listMicro.add(new Autobus("Autobus 111","#0000FF",500,150));

        return listMicro;
    }



    public ArrayList<Colectivo>ListaColectivoCompleta(){
        ArrayList<Colectivo> listMicro = new ArrayList<>();
        listMicro.add(new Colectivo("Colectivo 9","#ff0000",500,150));
        listMicro.add(new Colectivo("Colectivo 8","#ffff00",500,150));
        listMicro.add(new Colectivo("Colectivo 7","#008000",500,150));
        listMicro.add(new Colectivo("Colectivo 6","#ffff00",500,150));
        listMicro.add(new Colectivo("Colectivo 5","#ff0000",500,150));
        listMicro.add(new Colectivo("Colectivo 4","#ff0000",500,150));
        listMicro.add(new Colectivo("Colectivo 3","#008000",500,150));
        listMicro.add(new Colectivo("Colectivo 2","#ffff00",500,150));
        listMicro.add(new Colectivo("Colectivo 1","#0000FF",500,150));

        return listMicro;
    }

}

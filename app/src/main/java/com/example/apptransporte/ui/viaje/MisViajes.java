package com.example.apptransporte.ui.viaje;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptransporte.Adapter.AdapterViaje;
import com.example.apptransporte.Dto.Viajes;
import com.example.apptransporte.R;

import java.util.ArrayList;


public class MisViajes extends Fragment {
    AdapterViaje adapter;
    public RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ArrayList<Viajes> lista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_mis_viajes, container, false);

        recyclerView=(RecyclerView)root.findViewById(R.id.listViaje);

        adapter = new AdapterViaje(listaViajes());
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return root;
    }

    public ArrayList<Viajes> listaViajes(){
        ArrayList<Viajes> lista = new ArrayList<>();
        lista.add(new Viajes("Mall","Linea 14",700,"#ffff00"));
        lista.add(new Viajes("Mall","Linea 13",700,"#ff0000"));
        lista.add(new Viajes("Hospital","Linea A",500,"#ffff00"));
        lista.add(new Viajes("Hospital","Linea 13",700,"#ff0000"));
        lista.add(new Viajes("Centro","Linea F",500,"#ff0000"));
        return lista;
    }


}

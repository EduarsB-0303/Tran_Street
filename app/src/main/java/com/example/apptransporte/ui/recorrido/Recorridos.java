package com.example.apptransporte.ui.recorrido;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptransporte.Adapter.AdapterTransporte;
import com.example.apptransporte.Dto.Autobus;
import com.example.apptransporte.Dto.Colectivo;
import com.example.apptransporte.R;
import com.example.apptransporte.dal.AutobusDAL;
import com.example.apptransporte.dal.ColectivoDAL;

import java.util.ArrayList;


public class Recorridos extends Fragment {
    AdapterTransporte adapter;
    public RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private AutobusDAL microdal;
    private ArrayList<Autobus> listaAutobus;
    private ColectivoDAL coldal;
    private ArrayList<Colectivo> listaColectivo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_recorridos, container, false);

        recyclerView=(RecyclerView)root.findViewById(R.id.rcRecorrido);

        this.microdal = new AutobusDAL(getActivity().getApplicationContext(), new Autobus());
        this.listaAutobus = new AutobusDAL(getActivity().getBaseContext()).seleccionar();

        this.coldal = new ColectivoDAL(getActivity().getApplicationContext(), new Colectivo());
        this.listaColectivo = new ColectivoDAL(getActivity().getBaseContext()).seleccionar();

        adapter = new AdapterTransporte(this.listaAutobus,this.listaColectivo);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        return root;
    }
}

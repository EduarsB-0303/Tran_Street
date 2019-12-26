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
import com.example.apptransporte.Dal.AutobusDAL;
import com.example.apptransporte.Dal.ColectivoDAL;

import java.util.ArrayList;

public class InicioFragment extends Fragment {

    AdapterTransporte adapter;
    public RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private AutobusDAL microdal;
    private ArrayList<Autobus> listaAutobus;
    private ColectivoDAL coldal;
    private ArrayList<Colectivo> listaColectivo;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inicio, container, false);

        recyclerView=(RecyclerView)root.findViewById(R.id.idListaTransporte);

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

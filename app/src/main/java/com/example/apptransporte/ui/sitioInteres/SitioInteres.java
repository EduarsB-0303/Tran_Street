package com.example.apptransporte.ui.sitioInteres;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptransporte.Adapter.AdapterSitios;
import com.example.apptransporte.Dto.Sectores;
import com.example.apptransporte.R;
import com.example.apptransporte.Dal.SectorDAL;

import java.util.ArrayList;


public class SitioInteres extends Fragment {
    AdapterSitios adapterSitios;
    public RecyclerView recyclerView;
    private SectorDAL sectorDAL;
    private ArrayList<Sectores> listaSectores;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        new AdapterSitios(getActivity().getApplicationContext());
        View root = inflater.inflate(R.layout.fragment_sitio_interes, container, false);
        recyclerView=(RecyclerView)root.findViewById(R.id.listaSitiosInteres);

        this.sectorDAL = new SectorDAL(getActivity().getApplicationContext(), new Sectores());



        this.listaSectores = new SectorDAL(getActivity().getBaseContext()).seleccionar();


        adapterSitios = new AdapterSitios(this.listaSectores, getActivity());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(adapterSitios);


        return root;
    }
}

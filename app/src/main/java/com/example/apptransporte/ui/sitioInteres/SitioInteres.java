package com.example.apptransporte.ui.sitioInteres;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptransporte.Adapter.AdapterSitios;
import com.example.apptransporte.Dto.Sectores;
import com.example.apptransporte.R;
import com.example.apptransporte.segunda;
import com.example.apptransporte.ui.viaje.MisViajes;

import java.util.ArrayList;


public class SitioInteres extends Fragment {
    AdapterSitios adapterSitios;
    public RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sitio_interes, container, false);
        recyclerView=(RecyclerView)root.findViewById(R.id.listaSitiosInteres);
        adapterSitios = new AdapterSitios(listSectoresCompleta());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        listSectoresCompleta();
        recyclerView.setAdapter(adapterSitios);

        return root;
    }
    public ArrayList<Sectores> listSectoresCompleta(){
        ArrayList<Sectores> listSectores = new ArrayList<>();
        listSectores.add(new Sectores("Linea 999"));
        listSectores.add(new Sectores("Mall Calama"));
        listSectores.add(new Sectores("Cruz Verde"));
        listSectores.add(new Sectores("Carabineros 101"));
        listSectores.add(new Sectores("Ahumada"));
        listSectores.add(new Sectores("Centro"));
        listSectores.add(new Sectores("Linea 999"));
        listSectores.add(new Sectores("Mall Calama"));
        listSectores.add(new Sectores("Cruz Verde"));
        listSectores.add(new Sectores("Carabineros 101"));
        listSectores.add(new Sectores("Ahumada"));
        listSectores.add(new Sectores("Centro"));
        listSectores.add(new Sectores("Linea 999"));
        listSectores.add(new Sectores("Mall Calama"));
        listSectores.add(new Sectores("Cruz Verde"));
        listSectores.add(new Sectores("Carabineros 101"));
        listSectores.add(new Sectores("Ahumada"));
        listSectores.add(new Sectores("Centro"));


        return listSectores;
    }

}

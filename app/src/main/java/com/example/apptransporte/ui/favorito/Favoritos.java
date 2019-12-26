package com.example.apptransporte.ui.favorito;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apptransporte.Adapter.AdapterFavorito;
import com.example.apptransporte.Dto.Favorito;
import com.example.apptransporte.R;
import com.example.apptransporte.Dal.FavoritoDAL;

import java.util.ArrayList;


public class Favoritos extends Fragment {
    AdapterFavorito adapterFavorito;
    public RecyclerView rView;
    private FavoritoDAL favdal;
    private ArrayList<Favorito> listaFav;

    public Favoritos() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_favoritos, container, false);
        rView=(RecyclerView)root.findViewById(R.id.lista_Favoritos);

        this.favdal = new FavoritoDAL(getActivity().getApplicationContext(), new Favorito());
        this.listaFav = new FavoritoDAL(getActivity().getBaseContext()).seleccionar();

        adapterFavorito = new AdapterFavorito(this.listaFav);
        rView.setLayoutManager(new GridLayoutManager(getContext(),2));
        rView.setAdapter(adapterFavorito);

        return root;
    }

}

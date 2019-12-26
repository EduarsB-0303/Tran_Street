package com.example.apptransporte.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;

import com.example.apptransporte.Dto.Favorito;
import com.example.apptransporte.R;

import java.util.ArrayList;

public class AdapterFavorito extends RecyclerView.Adapter<AdapterFavorito.ViewHolder> {

    Context context;
    private ArrayList<Favorito> lista = new ArrayList<>();

    public AdapterFavorito(ArrayList<Favorito> list) {
        this.lista = list;
        notifyDataSetChanged();
    }

    //Ni idea de que es lo que hace
    @NonNull
    @Override
    public AdapterFavorito.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutForItem = R.layout.item_sitios;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutForItem, parent, false);
        return new AdapterFavorito.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombreSitio.setText(String.valueOf(lista.get(position).getNombre()));
    }


    @Override
    public int getItemCount() {
        if (lista == null) {
            return 0;
        }
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombreSitio;
        CardView card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.card= itemView.findViewById(R.id.cardSitios);
            this.nombreSitio = itemView.findViewById(R.id.idNombreSitio);
        }
    }
}

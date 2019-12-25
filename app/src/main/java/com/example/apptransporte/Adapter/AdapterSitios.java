package com.example.apptransporte.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptransporte.Dto.Favorito;
import com.example.apptransporte.R;
import com.example.apptransporte.Dto.Sectores;
import com.example.apptransporte.ui.favorito.Favoritos;
import com.example.apptransporte.ui.inicio.InicioFragment;
import com.example.apptransporte.ui.viaje.MisViajes;
import com.example.apptransporte.*;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AdapterSitios extends RecyclerView.Adapter<AdapterSitios.ViewHolder> {
        Context context;
        private ArrayList<Sectores> listado = new ArrayList<>();

    public AdapterSitios(ArrayList<Sectores> list) {
        this.listado = list;

        notifyDataSetChanged();
    }

    public AdapterSitios(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutForItem = R.layout.item_sitios;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutForItem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.nombreSitio.setText(String.valueOf(listado.get(position).getNombre()));

    }

    @Override
    public int getItemCount() {
        if (listado == null) {
            return 0;
        }
        return listado.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombreSitio;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.card= itemView.findViewById(R.id.cardSitios);
            this.nombreSitio = itemView.findViewById(R.id.idNombreSitio);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

    }

}
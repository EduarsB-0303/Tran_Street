package com.example.apptransporte.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptransporte.Dto.Favorito;
import com.example.apptransporte.R;
import com.example.apptransporte.Dto.Sectores;
import com.example.apptransporte.Dal.FavoritoDAL;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AdapterSitios extends RecyclerView.Adapter<AdapterSitios.ViewHolder> {
        Context context;

        private ArrayList<Sectores> listado = new ArrayList<>();

    public AdapterSitios(ArrayList<Sectores> list,Context c) {
        this.listado = list;
        this.context=c;
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
        FavoritoDAL fadal = new FavoritoDAL(context);
        if (fadal.esFavorito(position)){
           holder.favNo.setImageResource(R.drawable.ic_favorite_black);
        }

        holder.favNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FavoritoDAL fadal = new FavoritoDAL(context);

                if (!fadal.esFavorito(position)){

                    fadal.addFavorito(new Favorito(position,listado.get(position).getNombre()));

                    holder.favNo.setImageResource(R.drawable.ic_favorite_black);

                    Snackbar.make(v, "Añadido a favoritos " + listado.get(position).getNombre(),
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    fadal.eliminarFavorito(position);

                    holder.favNo.setImageResource(R.drawable.ic_favorite_border_black);

                    Snackbar.make(v, "Eliminado de favoritos " + listado.get(position).getNombre(),
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

            }
        });


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
        ImageView favNo;
        ImageView imgSitio;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgSitio = itemView.findViewById(R.id.imgSitio);
            this.favNo = itemView.findViewById(R.id.fav_no);
            this.card= itemView.findViewById(R.id.cardSitios);
            this.nombreSitio = itemView.findViewById(R.id.idNombreSitio);
        }

    }
}
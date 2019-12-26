package com.example.apptransporte.Adapter;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apptransporte.Dto.Viajes;
import com.example.apptransporte.R;

import java.util.ArrayList;

public class AdapterViaje extends RecyclerView.Adapter<AdapterViaje.Viewholder> {

    private ArrayList<Viajes> listado = new ArrayList<>();
    private Viajes viaje;

    public AdapterViaje(ArrayList<Viajes>list) {
        this.listado=list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        int layoutForItem = R.layout.item_viaje;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutForItem,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        int pos=position+1;

        if (position%2==0){
            holder.sitio.setText(listado.get(position).getSitio());
            holder.tarifan.setText(String.valueOf(listado.get(position).getTarifa()));
            holder.linea.setText(listado.get(position).getLinea());
            holder.color.setBackgroundColor(Color.parseColor(listado.get(position).getColor()));
            holder.linearLayout.setBackgroundColor(Color.parseColor("#62727b"));
        }else {
            holder.sitio.setText(listado.get(position).getSitio());
            holder.tarifan.setText(String.valueOf(listado.get(position).getTarifa()));
            holder.linea.setText(listado.get(position).getLinea());
            holder.color.setBackgroundColor(Color.parseColor(listado.get(position).getColor()));
            holder.linearLayout.setBackgroundColor(Color.parseColor("#37474f"));
        }
    }

    @Override
    public int getItemCount() {
        if (listado == null){
            return 0;
        }
        return listado.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView sitio,linea,tarifan,color;
        LinearLayout linearLayout;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            this.sitio=itemView.findViewById(R.id.txtViajeLSitio);
            this.color=itemView.findViewById(R.id.txtViajeColor);
            this.linearLayout=itemView.findViewById(R.id.lyViaje);
            this.linea = itemView.findViewById(R.id.txtViajeLinea);
            this.tarifan = itemView.findViewById(R.id.txtViajeValor);
        }
    }
}

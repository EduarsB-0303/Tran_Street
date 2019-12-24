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

import com.example.apptransporte.Dto.Colectivo;
import com.example.apptransporte.R;
import com.example.apptransporte.Dto.Autobus;

import java.util.ArrayList;

public class AdapterTransporte extends RecyclerView.Adapter<AdapterTransporte.Viewholder> {

    private ArrayList<Autobus> listado = new ArrayList<>();

    private ArrayList<Colectivo> listColec = new ArrayList<>();

    public AdapterTransporte(ArrayList<Autobus>list,ArrayList<Colectivo>listCol) {
        this.listado=list;
        this.listColec=listCol;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        int layoutForItem = R.layout.item_transporte;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutForItem,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        int pos=position+1;

            if (position%2==0){
                holder.nombre.setText(listado.get(position).getNombre_linea());
                holder.tarifae.setText(String.valueOf(listado.get(position).getTarifa_e_linea()));
                holder.tarifan.setText(String.valueOf(listado.get(position).getTarifa_n_linea()));
                holder.colorL.setBackgroundColor(Color.parseColor(listado.get(position).getColor_linea()));
                holder.linearLayout.setBackgroundColor(Color.parseColor("#62727b"));
            }else {
                holder.nombre.setText(listColec.get(position).getNombre_linea());
                holder.tarifae.setText(String.valueOf(listColec.get(position).getTarifa_e_linea()));
                holder.tarifan.setText(String.valueOf(listColec.get(position).getTarifa_n_linea()));
                holder.colorL.setBackgroundColor(Color.parseColor(listColec.get(position).getColor_linea()));
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
        TextView nombre,tarifae,tarifan,colorL;
        LinearLayout linearLayout;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            this.colorL=itemView.findViewById(R.id.colorLinea);
            this.linearLayout=itemView.findViewById(R.id.linear);
            this.nombre = itemView.findViewById(R.id.idNombre);
            this.tarifae = itemView.findViewById(R.id.idTarifaE);
            this.tarifan = itemView.findViewById(R.id.idTarifaN);
        }
    }
}

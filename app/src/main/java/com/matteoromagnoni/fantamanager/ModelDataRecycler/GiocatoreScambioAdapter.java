package com.matteoromagnoni.fantamanager.ModelDataRecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class GiocatoreScambioAdapter extends RecyclerView.Adapter<GiocatoreScambioAdapter.GiocatoreScambioViewHolder> {

    private GiocatoreScambio[] giocatoreScambios;

    public GiocatoreScambioAdapter(GiocatoreScambio[] giocatoreScambios) {
        this.giocatoreScambios = giocatoreScambios;
    }

    @NonNull
    @Override
    public GiocatoreScambioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.scambioitem, parent, false);
        GiocatoreScambioAdapter.GiocatoreScambioViewHolder viewHolder = new GiocatoreScambioAdapter.GiocatoreScambioViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GiocatoreScambioViewHolder holder, int position) {

        final GiocatoreScambio myListData = giocatoreScambios[position];
        holder.ruolo.setText(String.valueOf(giocatoreScambios[position].getRuolosc()));
        holder.nome.setText(String.valueOf(giocatoreScambios[position].getNomesc()));
        holder.stip.setText(String.valueOf(giocatoreScambios[position].getStipsc()));
        holder.scad.setText(String.valueOf(giocatoreScambios[position].getScadsc()));
        holder.imageteam.setImageResource(giocatoreScambios[position].getImagesc());


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNomesc(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return giocatoreScambios.length;
    }

    public static class GiocatoreScambioViewHolder extends RecyclerView.ViewHolder {
        public TextView ruolo, nome, stip, scad;
        public ImageView imageteam;
        public LinearLayout linearLayout;

        public GiocatoreScambioViewHolder(View itemView) {
            super(itemView);
            this.ruolo = (TextView) itemView.findViewById(R.id.ruoloscambio);
            this.nome = (TextView) itemView.findViewById(R.id.nomescambio);
            this.stip = (TextView) itemView.findViewById(R.id.stipscambio);
            this.scad = (TextView) itemView.findViewById(R.id.scadscambio);
            this.imageteam = (ImageView) itemView.findViewById(R.id.imagescambio);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.scambiutente);
        }
    }
}

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

public class VotiAdapter extends RecyclerView.Adapter<VotiAdapter.VotiViewHolder> {

    private VotiItem[] votiItems;

    public VotiAdapter(VotiItem[] votiItems) {
        this.votiItems = votiItems;
    }

    @NonNull
    @Override
    public VotiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.startingitem, parent, false);
        VotiAdapter.VotiViewHolder viewHolder = new VotiAdapter.VotiViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VotiViewHolder holder, int position) {
        final VotiItem myListData = votiItems[position];
        holder.ruolo.setText(String.valueOf(votiItems[position].getRuolo()));
        holder.nome.setText(String.valueOf(votiItems[position].getNome()));
        holder.voto.setText(String.valueOf(votiItems[position].getVoto()));
        holder.bonus1.setImageResource(votiItems[position].getBonus1());
        holder.bonus2.setImageResource(votiItems[position].getBonus2());
        holder.bonus3.setImageResource(votiItems[position].getBonus3());
        holder.bonus4.setImageResource(votiItems[position].getBonus4());
        holder.bonus5.setImageResource(votiItems[position].getBonus5());
        holder.bonus6.setImageResource(votiItems[position].getBonus6());
        holder.bonus7.setImageResource(votiItems[position].getBonus7());
        holder.bonus8.setImageResource(votiItems[position].getBonus8());
        holder.bonus9.setImageResource(votiItems[position].getBonus9());
        holder.bonus10.setImageResource(votiItems[position].getBonus10());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return votiItems.length;
    }

    public static class VotiViewHolder extends RecyclerView.ViewHolder {
        public TextView ruolo, nome, voto;
        public ImageView bonus1, bonus2, bonus3, bonus4, bonus5, bonus6, bonus7, bonus8, bonus9, bonus10;
        public LinearLayout linearLayout;

        public VotiViewHolder(View itemView) {
            super(itemView);
            this.ruolo = (TextView) itemView.findViewById(R.id.ruolovoto);
            this.nome = (TextView) itemView.findViewById(R.id.nomevoto);
            this.voto = (TextView) itemView.findViewById(R.id.voto);
            this.bonus1 = (ImageView) itemView.findViewById(R.id.bonus1);
            this.bonus2 = (ImageView) itemView.findViewById(R.id.bonus2);
            this.bonus3 = (ImageView) itemView.findViewById(R.id.bonus3);
            this.bonus4 = (ImageView) itemView.findViewById(R.id.bonus4);
            this.bonus5 = (ImageView) itemView.findViewById(R.id.bonus5);
            this.bonus6 = (ImageView) itemView.findViewById(R.id.bonus6);
            this.bonus7 = (ImageView) itemView.findViewById(R.id.bonus7);
            this.bonus8 = (ImageView) itemView.findViewById(R.id.bonus8);
            this.bonus9 = (ImageView) itemView.findViewById(R.id.bonus9);
            this.bonus10 = (ImageView) itemView.findViewById(R.id.bonus10);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layoutvoti);
        }
    }
}

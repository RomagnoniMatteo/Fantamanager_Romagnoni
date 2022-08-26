package com.matteoromagnoni.fantamanager.ModelDataRecycler;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class ClassificaAdapter extends RecyclerView.Adapter<ClassificaAdapter.ClassificaViewHolder> {

    private ClassificaItem[] classlist;

    public ClassificaAdapter(ClassificaItem[] classlist) {
        this.classlist = classlist;
    }

    @NonNull
    @Override
    public ClassificaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.classificaitem, parent, false);
        ClassificaAdapter.ClassificaViewHolder viewHolder = new ClassificaAdapter.ClassificaViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassificaViewHolder holder, int position) {
        final ClassificaItem myListData = classlist[position];
        holder.posizione.setText(String.valueOf(classlist[position].getPosizione()));
        holder.win.setText(String.valueOf(classlist[position].getWin()));
        holder.draw.setText(String.valueOf(classlist[position].getDraw()));
        holder.lose.setText(String.valueOf(classlist[position].getLose()));
        holder.gf.setText(String.valueOf(classlist[position].getGf()));
        holder.gs.setText(String.valueOf(classlist[position].getGs()));
        holder.pg.setText(String.valueOf(classlist[position].getPg()));
        holder.pt.setText(String.valueOf(classlist[position].getPt()));
        holder.squadra.setText(String.valueOf(classlist[position].getSquadra()));

            if(position %2==1){
                holder.linearLayout.setBackgroundColor(Color.parseColor("#20779A"));




            }


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getPosizione(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return classlist.length;
    }

    public static class ClassificaViewHolder extends RecyclerView.ViewHolder {
        public TextView  posizione, win, draw, lose, gf, gs, pg, pt, squadra;
        public LinearLayout linearLayout;

        public ClassificaViewHolder(View itemView) {
            super(itemView);
            this.posizione = (TextView) itemView.findViewById(R.id.posizioneclass);
            this.squadra = (TextView) itemView.findViewById(R.id.teamclass);
            this.pg = (TextView) itemView.findViewById(R.id.pgclass);
            this.win = (TextView) itemView.findViewById(R.id.wclass);
            this.draw = (TextView) itemView.findViewById(R.id.dclass);
            this.lose = (TextView) itemView.findViewById(R.id.lclass);
            this.gf = (TextView) itemView.findViewById(R.id.gfclass);
            this.gs = (TextView) itemView.findViewById(R.id.gsclass);
            this.pt = (TextView) itemView.findViewById(R.id.ptclass);

            linearLayout = (LinearLayout) itemView.findViewById(R.id.classificalayout);
        }
    }
}

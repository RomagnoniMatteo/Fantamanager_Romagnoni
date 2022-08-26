package com.matteoromagnoni.fantamanager.ModelDataRecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class VivaioAdapter extends RecyclerView.Adapter<VivaioAdapter.VivaioViewHolder> {

    private VivaioItem[] vivaioItems;

    public VivaioAdapter(VivaioItem[] vivaioItems) {
        this.vivaioItems = vivaioItems;
    }

    @NonNull
    @Override
    public VivaioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.vivaioitem, parent, false);
        VivaioAdapter.VivaioViewHolder viewHolder = new VivaioAdapter.VivaioViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VivaioViewHolder holder, int position) {

        final VivaioItem myListData = vivaioItems[position];
        holder.ruolo.setText(String.valueOf(vivaioItems[position].getRuolo()));
        holder.nome.setText(String.valueOf(vivaioItems[position].getNome()));
        holder.anno.setText(String.valueOf(vivaioItems[position].getAnnonascita()));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return vivaioItems.length;
    }

    public static class VivaioViewHolder extends RecyclerView.ViewHolder {
        public TextView ruolo, nome, anno;
        public LinearLayout linearLayout;

        public VivaioViewHolder(View itemView) {
            super(itemView);
            this.ruolo = (TextView) itemView.findViewById(R.id.ruolovivaio);
            this.nome = (TextView) itemView.findViewById(R.id.nomevivaio);
            this.anno = (TextView) itemView.findViewById(R.id.annovivaio);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layoutviv);
        }
    }
}

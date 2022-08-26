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

public class FinanzeAdapter extends RecyclerView.Adapter<FinanzeAdapter.FinanzeViewHolder> {

    private FinanzeItem[] finanzeItems;

    public FinanzeAdapter(FinanzeItem[] finanzeItems) {
        this.finanzeItems = finanzeItems;
    }

    @NonNull
    @Override
    public FinanzeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.finanzeplayersitem, parent, false);
        FinanzeAdapter.FinanzeViewHolder viewHolder = new FinanzeAdapter.FinanzeViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FinanzeViewHolder holder, int position) {

        final FinanzeItem myListData = finanzeItems[position];
        holder.ruolo.setText(String.valueOf(finanzeItems[position].getRuolo()));
        holder.nome.setText(String.valueOf(finanzeItems[position].getNome()));
        holder.scadenza.setText(String.valueOf(finanzeItems[position].getScadenza()));
        holder.stipendio.setText(String.valueOf(finanzeItems[position].getStipendio()));



        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return finanzeItems.length;
    }

    public static class FinanzeViewHolder extends RecyclerView.ViewHolder {
        public TextView ruolo, nome, scadenza, stipendio;
        public LinearLayout linearLayout;

        public FinanzeViewHolder(View itemView) {
            super(itemView);
            this.ruolo = (TextView) itemView.findViewById(R.id.ruolofinanze);
            this.nome = (TextView) itemView.findViewById(R.id.nomefinanze);
            this.scadenza = (TextView) itemView.findViewById(R.id.scadfinanze);
            this.stipendio = (TextView) itemView.findViewById(R.id.stipfinanze);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.utentefinanze);
        }
    }

}

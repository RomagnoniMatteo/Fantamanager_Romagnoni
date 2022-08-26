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

public class FormazioneAdapter extends  RecyclerView.Adapter<FormazioneAdapter.FormazioneViewHolder> {

    private FormazioneItem[] listform;

    public FormazioneAdapter(FormazioneItem[] listform) {
        this.listform = listform;
    }

    @NonNull
    @Override
    public FormazioneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.formazioneitem, parent, false);
        FormazioneAdapter.FormazioneViewHolder viewHolder = new FormazioneAdapter.FormazioneViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FormazioneViewHolder holder, int position) {
        final FormazioneItem myListData = listform[position];
        holder.nmaglia.setText(String.valueOf(listform[position].getNmaglia()));
        holder.nome.setText(String.valueOf(listform[position].getNome()));
        holder.divisa.setImageResource(listform[position].getDivisa());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listform.length;
    }

    public static class FormazioneViewHolder extends RecyclerView.ViewHolder {
        public ImageView divisa;
        public TextView nmaglia, nome;
        public LinearLayout linearLayout;

        public FormazioneViewHolder(View itemView) {
            super(itemView);
            this.divisa = (ImageView) itemView.findViewById(R.id.divisaform);
            this.nmaglia = (TextView) itemView.findViewById(R.id.numfor);
            this.nome = (TextView) itemView.findViewById(R.id.nomeformazione);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layouutplformazione);
        }
    }
}

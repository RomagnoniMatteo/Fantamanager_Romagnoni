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

public class PickDraftAdapter extends RecyclerView.Adapter<PickDraftAdapter.PickDraftViewHolder> {

    private PickDraftItem[] listpick;

    public PickDraftAdapter(PickDraftItem[] listpick) {
        this.listpick = listpick;
    }


    @NonNull
    @Override
    public PickDraftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.pickdetailitem, parent, false);
        PickDraftViewHolder viewHolder = new PickDraftViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PickDraftViewHolder holder, int position) {
        final PickDraftItem myListData = listpick[position];
        holder.annopick.setText(String.valueOf(listpick[position].getAnno()));
        holder.nomepick.setText(listpick[position].getNome());
        holder.ruolopick.setText(listpick[position].getRuolo());
        holder.npick.setText(String.valueOf(listpick[position].getNumero()));
        holder.imageTeam.setImageResource(listpick[position].getImageteam());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listpick.length;
    }


    public static class PickDraftViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageTeam;
        public TextView nomepick, annopick, ruolopick, npick;
        public LinearLayout linearLayout;

        public PickDraftViewHolder(View itemView) {
            super(itemView);
            this.imageTeam = (ImageView) itemView.findViewById(R.id.teampickdraft);
            this.annopick = (TextView) itemView.findViewById(R.id.pickanno);
            this.nomepick = (TextView) itemView.findViewById(R.id.picknome);
            this.ruolopick = (TextView) itemView.findViewById(R.id.pickruolo);
            this.npick = (TextView) itemView.findViewById(R.id.picknumero);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layoutpick);
        }
    }

}


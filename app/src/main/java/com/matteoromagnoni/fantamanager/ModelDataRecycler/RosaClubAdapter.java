package com.matteoromagnoni.fantamanager.ModelDataRecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class RosaClubAdapter extends RecyclerView.Adapter<RosaClubAdapter.RosaViewHolder> {

    private RosaClubItem[] rosaitem;

    public RosaClubAdapter(RosaClubItem[] rosaitem) {
        this.rosaitem = rosaitem;
    }

    @NonNull
    @Override
    public RosaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.playernumberitem, parent, false);
        RosaClubAdapter.RosaViewHolder viewHolder = new RosaClubAdapter.RosaViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RosaViewHolder holder, int position) {
        final RosaClubItem myListData = rosaitem[position];
        holder.ruolo.setText(String.valueOf(rosaitem[position].getRuolo()));
        holder.nome.setText(String.valueOf(rosaitem[position].getNome()));
        holder.nmaglia.setText(String.valueOf(rosaitem[position].getNmaglia()));
        holder.imageteam.setImageResource(rosaitem[position].getImageTeam());

        holder.linearLayout.setOnClickListener(view -> Toast.makeText(view.getContext(),"click on item: "+myListData.getNome(),Toast.LENGTH_LONG).show());
    }

    @Override
    public int getItemCount() {
        return rosaitem.length;
    }

    public static class RosaViewHolder extends RecyclerView.ViewHolder {
        public TextView ruolo, nome, nmaglia;
        public ImageView imageteam;
        public LinearLayout linearLayout;
        public ImageButton editbutton;

        public RosaViewHolder(View itemView) {
            super(itemView);
            this.ruolo =  itemView.findViewById(R.id.ruolorosa);
            this.nome =itemView.findViewById(R.id.nomerosa);
            this.nmaglia = itemView.findViewById(R.id.nmagliarosa);
            this.imageteam =  itemView.findViewById(R.id.imagerosa);
            this.editbutton= itemView.findViewById(R.id.editnumber);
            linearLayout = itemView.findViewById(R.id.layoutrosa);
        }
    }
}

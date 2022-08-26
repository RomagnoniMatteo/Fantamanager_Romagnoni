package com.matteoromagnoni.fantamanager.ModelDataRecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class PickTurnoAdapter  extends RecyclerView.Adapter<PickTurnoAdapter.PickTurnoViewHolder>  {


    private PickTurno[] listpick;

    public PickTurnoAdapter(PickTurno[] listpick) {
        this.listpick = listpick;
    }

    @NonNull
    @Override
    public PickTurnoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.pickitem, parent, false);
        PickTurnoAdapter.PickTurnoViewHolder viewHolder = new PickTurnoAdapter.PickTurnoViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PickTurnoViewHolder holder, int position) {
        final PickTurno myListData = listpick[position];
        holder.npick.setText(String.valueOf(listpick[position].getNpick()));
        holder.imageTeam.setImageResource(listpick[position].getLogoteam());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNpick(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listpick.length;
    }


    public static class PickTurnoViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageTeam;
        public TextView npick;
        public RelativeLayout relativeLayout;

        public PickTurnoViewHolder(View itemView) {
            super(itemView);
            this.imageTeam = (ImageView) itemView.findViewById(R.id.imagepickteam);
            this.npick = (TextView) itemView.findViewById(R.id.numberpick);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutPick);
        }
    }
}

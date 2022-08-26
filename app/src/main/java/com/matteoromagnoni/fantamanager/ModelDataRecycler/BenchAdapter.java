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

public class BenchAdapter extends RecyclerView.Adapter<BenchAdapter.BenchViewHolder> {

    private BenchItem[] benchItems;

    public BenchAdapter(BenchItem[] benchItems) {
        this.benchItems = benchItems;
    }

    @NonNull
    @Override
    public BenchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.benchitem, parent, false);
        BenchAdapter.BenchViewHolder viewHolder = new BenchAdapter.BenchViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BenchViewHolder holder, int position) {
        final BenchItem myListData = benchItems[position];
        holder.nmaglia.setText(String.valueOf(benchItems[position].getNmaglia()));
        holder.nome.setText(String.valueOf(benchItems[position].getNomebench()));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getNomebench(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return benchItems.length;
    }

    public static class BenchViewHolder extends RecyclerView.ViewHolder {
        public TextView nome, nmaglia;
        public LinearLayout linearLayout;

        public BenchViewHolder(View itemView) {
            super(itemView);
            this.nmaglia = (TextView) itemView.findViewById(R.id.nmagliabench);
            this.nome = (TextView) itemView.findViewById(R.id.nomebench);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layoutbench);
        }
    }
}

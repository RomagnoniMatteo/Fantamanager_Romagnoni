package com.matteoromagnoni.fantamanager.ModelDataRecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matteoromagnoni.fantamanager.R;

public class AddPlayerAdapter extends RecyclerView.Adapter<AddPlayerAdapter.AddPlayerViewHolder> {

    private AddPlayerItem[] addPlayerItems;

    public AddPlayerAdapter(AddPlayerItem[] addPlayerItems) {
        this.addPlayerItems = addPlayerItems;
    }

    @NonNull
    @Override
    public AddPlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.aggiungiplayeritem, parent, false);
        AddPlayerAdapter.AddPlayerViewHolder viewHolder = new AddPlayerAdapter.AddPlayerViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AddPlayerViewHolder holder, int position) {
        final AddPlayerItem myListData = addPlayerItems[position];
        holder.imageButton.setImageResource(addPlayerItems[position].getImagebutton());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getImagebutton(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return addPlayerItems.length;
    }

    public static class AddPlayerViewHolder extends RecyclerView.ViewHolder {
        public ImageButton imageButton;
        public LinearLayout linearLayout;

        public AddPlayerViewHolder(View itemView) {
            super(itemView);
            this.imageButton = (ImageButton) itemView.findViewById(R.id.addform);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.ltaddpl);
        }
    }
}

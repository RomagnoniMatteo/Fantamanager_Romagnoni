package com.matteoromagnoni.fantamanager.ModelDataList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;

public class LegaAdapter  extends BaseAdapter {

    ArrayList<LegaItem> searchResults;

    ViewHolder viewHolder;

    public LegaAdapter(Context context, int textViewResourceId, ArrayList<LegaItem> results) {
        searchResults = new ArrayList<>(results);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.legaitem, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.logolega = (ImageView) convertView.findViewById(R.id.logolega);
            viewHolder.nomelega = (TextView) convertView.findViewById(R.id.nomelega);
            viewHolder.npartecipanti = (TextView) convertView.findViewById(R.id.npartecipantilega);
            viewHolder.npartattuali = (TextView) convertView.findViewById(R.id.npartattuali);
            viewHolder.passwordlega = (TextView) convertView.findViewById(R.id.legapass);


            convertView.setTag(viewHolder);

        } else
            viewHolder = (ViewHolder) convertView.getTag();



        viewHolder.logolega.setImageResource(searchResults.get(position).getLogolega());
        viewHolder.nomelega.setText(searchResults.get(position).getNomelega());
        viewHolder.npartecipanti.setText(String.valueOf(searchResults.get(position).getNpartlega()));
        viewHolder.npartattuali.setText(String.valueOf(searchResults.get(position).getNpartattuali()));



        return convertView;

    }

    public void clearSearchResult() {
        searchResults.clear();
    }

    public void addSeachResult(LegaItem result) {
        this.searchResults.add(result);
    }

    private class ViewHolder {
        ImageView logolega;
        TextView nomelega, npartecipanti, npartattuali, passwordlega;

    }

    @Override
    public int getCount() {
        return searchResults.size();
    }

    @Override
    public Object getItem(int position) {
        return searchResults.get(position);
    }

    @Override
    public long getItemId(int position) {
        return searchResults.get(position).getId();
    }
}

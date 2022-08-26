package com.matteoromagnoni.fantamanager.ModelDataList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;

public class SvincolatiAdapter extends BaseAdapter {

    ArrayList<SvincolatiItem> searchResults;

    SvincolatiAdapter.ViewHolder viewHolder;

    public SvincolatiAdapter(Context context, int textViewResourceId, ArrayList<SvincolatiItem> results) {
        searchResults = new ArrayList<SvincolatiItem>(results);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.playeritem, parent, false);
            viewHolder = new SvincolatiAdapter.ViewHolder();


            viewHolder.nome = (TextView) convertView.findViewById(R.id.nomesvinc);
            viewHolder.team = (TextView) convertView.findViewById(R.id.teamsvinc);
            viewHolder.anno = (TextView) convertView.findViewById(R.id.annosvinc);
            viewHolder.ruolo = (TextView) convertView.findViewById(R.id.ruolosvinc);


            convertView.setTag(viewHolder);

        } else
            viewHolder = (SvincolatiAdapter.ViewHolder) convertView.getTag();



        viewHolder.nome.setText(searchResults.get(position).getNome());
        viewHolder.team.setText(String.valueOf(searchResults.get(position).getTeam()));
        viewHolder.anno.setText(String.valueOf(searchResults.get(position).getAnno()));
        viewHolder.ruolo.setText(String.valueOf(searchResults.get(position).getRuolo()));



        return convertView;

    }

    public void clearSearchResult() {
        searchResults.clear();
    }

    public void addSeachResult(SvincolatiItem result) {
        this.searchResults.add(result);
    }

    private class ViewHolder {
        TextView nome, team, anno, ruolo;

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


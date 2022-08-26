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

public class SearchPlayerAdapter  extends BaseAdapter {

    ArrayList<SearchPlayerItem> searchResults;

    SearchPlayerAdapter.ViewHolder viewHolder;

    public SearchPlayerAdapter(Context context, int textViewResourceId, ArrayList<SearchPlayerItem> results) {
        searchResults = new ArrayList<>(results);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.searchplayer_item, parent, false);
            viewHolder = new SearchPlayerAdapter.ViewHolder();

            viewHolder.logo = (ImageView) convertView.findViewById(R.id.logosearch);
            viewHolder.nome = (TextView) convertView.findViewById(R.id.nomesearch);
            viewHolder.team = (TextView) convertView.findViewById(R.id.teamsearch);
            viewHolder.anno = (TextView) convertView.findViewById(R.id.annosearch);
            viewHolder.ruolo = (TextView) convertView.findViewById(R.id.ruolosearch);


            convertView.setTag(viewHolder);

        } else
            viewHolder = (SearchPlayerAdapter.ViewHolder) convertView.getTag();



        viewHolder.logo.setImageResource(searchResults.get(position).getLogo());
        viewHolder.nome.setText(searchResults.get(position).getNome());
        viewHolder.team.setText(String.valueOf(searchResults.get(position).getTeam()));
        viewHolder.anno.setText(String.valueOf(searchResults.get(position).getAnno()));
        viewHolder.ruolo.setText(String.valueOf(searchResults.get(position).getRuolo()));



        return convertView;

    }

    public void clearSearchResult() {
        searchResults.clear();
    }

    public void addSeachResult(SearchPlayerItem result) {
        this.searchResults.add(result);
    }

    private class ViewHolder {
        ImageView logo;
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


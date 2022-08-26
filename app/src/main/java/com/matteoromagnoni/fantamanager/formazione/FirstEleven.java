package com.matteoromagnoni.fantamanager.formazione;

import com.matteoromagnoni.fantamanager.ModelDataRecycler.FormazioneItem;

import java.util.List;

public class FirstEleven
{
    public String club;
    public String coach;
    public String formation;
    public List<FormazioneItem> playerList;

    public FirstEleven(String club, String coach, String formation,  List<FormazioneItem> playerList)
    {
        this.club = club;
        this.coach = coach;
        this.formation = formation;
        this.playerList = playerList;
    }
}

package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class RosaClubItem {
    String ruolo, nome;
    int imageTeam, nmaglia;

    public RosaClubItem(String ruolo, String nome, int imageTeam, int nmaglia) {
        this.ruolo = ruolo;
        this.nome = nome;
        this.imageTeam = imageTeam;
        this.nmaglia = nmaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImageTeam() {
        return imageTeam;
    }

    public void setImageTeam(int imageTeam) {
        this.imageTeam = imageTeam;
    }

    public int getNmaglia() {
        return nmaglia;
    }

    public void setNmaglia(int nmaglia) {
        this.nmaglia = nmaglia;
    }
}

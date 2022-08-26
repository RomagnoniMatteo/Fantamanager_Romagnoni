package com.matteoromagnoni.fantamanager.ModelDataList;

public class SearchPlayerItem {
    int anno, logo, id;
    String nome, team, ruolo;

    public SearchPlayerItem(int anno, int logo, String nome, String team, String ruolo) {
        this.anno = anno;
        this.logo = logo;
        this.nome = nome;
        this.team = team;
        this.ruolo = ruolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }


}

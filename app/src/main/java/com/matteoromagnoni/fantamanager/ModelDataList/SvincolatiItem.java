package com.matteoromagnoni.fantamanager.ModelDataList;

public class SvincolatiItem {
    int anno, id;
    String nome, team, ruolo;

    public SvincolatiItem(int anno, String nome, String team, String ruolo) {
        this.anno = anno;
        this.nome = nome;
        this.team = team;
        this.ruolo = ruolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

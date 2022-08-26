package com.matteoromagnoni.fantamanager.ModelDataRecycler;


public class VivaioItem {
    String ruolo, nome;
    int annonascita;


    public VivaioItem(String ruolo, String nome, int annonascita) {
        this.ruolo = ruolo;
        this.nome = nome;
        this.annonascita = annonascita;
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

    public int getAnnonascita() {
        return annonascita;
    }

    public void setAnnonascita(int annonascita) {
        this.annonascita = annonascita;
    }
}

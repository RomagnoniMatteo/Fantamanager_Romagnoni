package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class FinanzeItem {
    String ruolo, nome, stipendio;
    int scadenza;

    public FinanzeItem(String ruolo, String nome, String stipendio, int scadenza) {
        this.ruolo = ruolo;
        this.nome = nome;
        this.stipendio = stipendio;
        this.scadenza = scadenza;
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

    public String getStipendio() {
        return stipendio;
    }

    public void setStipendio(String stipendio) {
        this.stipendio = stipendio;
    }

    public int getScadenza() {
        return scadenza;
    }

    public void setScadenza(int scadenza) {
        this.scadenza = scadenza;
    }
}

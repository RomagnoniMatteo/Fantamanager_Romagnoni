package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class FormazioneItem {
    int nmaglia, divisa;
    String nome;

    public FormazioneItem(int nmaglia, int divisa, String nome) {
        this.nmaglia = nmaglia;
        this.divisa = divisa;
        this.nome = nome;
    }

    public int getNmaglia() {
        return nmaglia;
    }

    public void setNmaglia(int nmaglia) {
        this.nmaglia = nmaglia;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

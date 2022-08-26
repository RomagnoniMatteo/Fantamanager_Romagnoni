package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class BenchItem {
    int nmaglia;
    String nomebench;

    public BenchItem(int nmaglia, String nome) {
        this.nmaglia = nmaglia;
        this.nomebench = nome;
    }

    public int getNmaglia() {
        return nmaglia;
    }

    public void setNmaglia(int nmaglia) {
        this.nmaglia = nmaglia;
    }

    public String getNomebench() {
        return nomebench;
    }

    public void setNomebench(String nomebench) {
        this.nomebench = nomebench;
    }
}

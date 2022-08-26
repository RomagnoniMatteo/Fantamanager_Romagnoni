package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class PickDraftItem {
    String nome, ruolo;
    int anno, imageteam, numero;

    public PickDraftItem(String nome, String ruolo, int anno, int imageteam, int numero) {
        this.nome = nome;
        this.ruolo = ruolo;
        this.anno = anno;
        this.imageteam = imageteam;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getImageteam() {
        return imageteam;
    }

    public void setImageteam(int imageteam) {
        this.imageteam = imageteam;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

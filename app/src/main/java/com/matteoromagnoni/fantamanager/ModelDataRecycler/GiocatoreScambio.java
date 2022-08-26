package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class GiocatoreScambio {
    String nomesc, stipsc, ruolosc;
    int imagesc, scadsc;

    public GiocatoreScambio(String nomesc, String stipsc, String ruolosc, int imagesc, int scadsc) {
        this.nomesc = nomesc;
        this.stipsc = stipsc;
        this.ruolosc = ruolosc;
        this.imagesc = imagesc;
        this.scadsc = scadsc;
    }

    public String getNomesc() {
        return nomesc;
    }

    public void setNomesc(String nomesc) {
        this.nomesc = nomesc;
    }

    public String getStipsc() {
        return stipsc;
    }

    public void setStipsc(String stipsc) {
        this.stipsc = stipsc;
    }

    public String getRuolosc() {
        return ruolosc;
    }

    public void setRuolosc(String ruolosc) {
        this.ruolosc = ruolosc;
    }

    public int getImagesc() {
        return imagesc;
    }

    public void setImagesc(int imagesc) {
        this.imagesc = imagesc;
    }

    public int getScadsc() {
        return scadsc;
    }

    public void setScadsc(int scadsc) {
        this.scadsc = scadsc;
    }
}

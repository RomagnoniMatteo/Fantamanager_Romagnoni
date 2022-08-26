package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class ClassificaItem {
    int posizione, win, draw, lose, gf, gs, pg, pt;
    String squadra;

    public ClassificaItem(int posizione, int win, int draw, int lose, int gf, int gs, int pg, int pt, String squadra) {
        this.posizione = posizione;
        this.win = win;
        this.draw = draw;
        this.lose = lose;
        this.gf = gf;
        this.gs = gs;
        this.pg = pg;
        this.pt = pt;
        this.squadra = squadra;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGs() {
        return gs;
    }

    public void setGs(int gs) {
        this.gs = gs;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }
}

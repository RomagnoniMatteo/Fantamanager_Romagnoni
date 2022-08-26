package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class VotiItem {
    int voto, bonus1, bonus2, bonus3, bonus4, bonus5, bonus6, bonus7, bonus8, bonus9, bonus10;
    String ruolo, nome;


    public VotiItem(int voto,  String ruolo, String nome, int bonus1, int bonus2, int bonus3, int bonus4, int bonus5, int bonus6, int bonus7, int bonus8, int bonus9, int bonus10) {
        this.voto = voto;
        this.bonus1 = bonus1;
        this.bonus2 = bonus2;
        this.bonus3 = bonus3;
        this.bonus4 = bonus4;
        this.bonus5 = bonus5;
        this.bonus6 = bonus6;
        this.bonus7 = bonus7;
        this.bonus8 = bonus8;
        this.bonus9 = bonus9;
        this.bonus10 = bonus10;
        this.ruolo = ruolo;
        this.nome = nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getBonus1() {
        return bonus1;
    }

    public void setBonus1(int bonus1) {
        this.bonus1 = bonus1;
    }

    public int getBonus2() {
        return bonus2;
    }

    public void setBonus2(int bonus2) {
        this.bonus2 = bonus2;
    }

    public int getBonus3() {
        return bonus3;
    }

    public void setBonus3(int bonus3) {
        this.bonus3 = bonus3;
    }

    public int getBonus4() {
        return bonus4;
    }

    public void setBonus4(int bonus4) {
        this.bonus4 = bonus4;
    }

    public int getBonus5() {
        return bonus5;
    }

    public void setBonus5(int bonus5) {
        this.bonus5 = bonus5;
    }

    public int getBonus6() {
        return bonus6;
    }

    public void setBonus6(int bonus6) {
        this.bonus6 = bonus6;
    }

    public int getBonus7() {
        return bonus7;
    }

    public void setBonus7(int bonus7) {
        this.bonus7 = bonus7;
    }

    public int getBonus8() {
        return bonus8;
    }

    public void setBonus8(int bonus8) {
        this.bonus8 = bonus8;
    }

    public int getBonus9() {
        return bonus9;
    }

    public void setBonus9(int bonus9) {
        this.bonus9 = bonus9;
    }

    public int getBonus10() {
        return bonus10;
    }

    public void setBonus10(int bonus10) {
        this.bonus10 = bonus10;
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
}
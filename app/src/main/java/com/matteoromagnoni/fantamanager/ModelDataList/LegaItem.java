package com.matteoromagnoni.fantamanager.ModelDataList;

public class LegaItem {
    int logolega, npartlega, npartattuali, id;

    String nomelega;


    public LegaItem(int logolega, int npartlega, int npartattuali, String nomelega) {
        this.logolega = logolega;
        this.npartlega = npartlega;
        this.npartattuali = npartattuali;
        this.id = id;
        this.nomelega = nomelega;

    }

    public int getNpartattuali() {
        return npartattuali;
    }

    public void setNpartattuali(int npartattuali) {
        this.npartattuali = npartattuali;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogolega() {
        return logolega;
    }

    public void setLogolega(int logolega) {
        this.logolega = logolega;
    }

    public int getNpartlega() {
        return npartlega;
    }

    public void setNpartlega(int npartlega) {
        this.npartlega = npartlega;
    }

    public String getNomelega() {
        return nomelega;
    }

    public void setNomelega(String nomelega) {
        this.nomelega = nomelega;
    }

}

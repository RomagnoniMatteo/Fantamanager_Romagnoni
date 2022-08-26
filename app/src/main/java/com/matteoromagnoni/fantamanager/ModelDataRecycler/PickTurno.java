package com.matteoromagnoni.fantamanager.ModelDataRecycler;

public class PickTurno {
    int npick, logoteam;

    public PickTurno(int npick, int logoteam) {
        this.npick = npick;
        this.logoteam = logoteam;
    }

    public int getNpick() {
        return npick;
    }

    public void setNpick(int npick) {
        this.npick = npick;
    }

    public int getLogoteam() {
        return logoteam;
    }

    public void setLogoteam(int logoteam) {
        this.logoteam = logoteam;
    }
}

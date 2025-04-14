package org.example.model;

import java.io.Serializable;
import java.util.HashMap;

public class Mukincs implements Serializable {
    private int azon;
    private String alkoto;
    private String cim;
    private Kateg kateg;

    public Mukincs(int azon, String alkoto, String cim, Kateg kateg) {
        this.azon = azon;
        this.alkoto = alkoto;
        this.cim = cim;
        this.kateg = kateg;
    }

    public int getAzon() {
        return azon;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public Kateg getKateg() {
        return kateg;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "azon=" + azon +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kateg=" + kateg +
                '}';
    }
}

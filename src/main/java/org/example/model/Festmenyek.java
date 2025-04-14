package org.example.model;

import java.io.Serializable;

public class Festmenyek extends Mukincs implements Serializable {

    private String stilus;

    public Festmenyek(int azon, String alkoto, String cim, Kateg kateg) {
        super(azon, alkoto, cim, kateg);
    }

    public Festmenyek(int azon, String alkoto, String cim, Kateg kateg, String stilus) {
        super(azon, alkoto, cim, kateg);
        this.stilus = stilus;
    }

    public String getStilus() {
        return stilus;
    }

    @Override
    public String toString() {
        return  "Festmenyek{" +
                "stilus='" + stilus + '\'' +
                '}';
    }
}

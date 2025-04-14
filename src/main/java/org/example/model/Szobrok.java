package org.example.model;

import java.io.Serializable;
import java.util.Objects;

public class Szobrok extends Mukincs implements Serializable {
    private String anyag;
    private int szazad;

    public Szobrok(int azon, String alkoto, String cim, Kateg kateg) {
        super(azon, alkoto, cim, kateg);
    }

    public Szobrok(int azon, String alkoto, String cim, Kateg kateg, String anyag, int szazad) {
        super(azon, alkoto, cim, kateg);
        this.anyag = anyag;
        if (szazad > 21){
            throw new nagyobbMint21Szazad("Század nem lehet nagyobb mint 21.");
        }
    }

    public Szobrok(int azon, String alkoto, String cim, Kateg kateg, String anyag) {
        super(azon, alkoto, cim, kateg);
        this.anyag = anyag;
        szazad = 20;
    }

    @Override
    public String toString() {
        return "Szobrok{" +
                "anyag='" + anyag + '\'' +
                ", szazad=" + szazad +
                '}';
    }
}

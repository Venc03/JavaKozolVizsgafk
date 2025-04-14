package org.example.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny implements Serializable {
    private List<Mukincs> gyujtemenyek;

    public void feltolt() {
        gyujtemenyek = new ArrayList<>();

        Mukincs sz1 = new Szobrok(1, "alk1", "cim1", Kateg.EREDETI, "anyag1", 22);
        Mukincs sz2 = new Szobrok(2, "alk2", "cim2", Kateg.MASOLAT, "anyag2", 16);
        Mukincs sz3 = new Szobrok(3, "alk3", "cim3", Kateg.KIS_ERTEKU, "anyag3", 19);

        Mukincs f1 = new Festmenyek(4, "alk1", "cim1", Kateg.EREDETI, "s1");
        Mukincs f2 = new Festmenyek(5, "alk2", "cim2", Kateg.MASOLAT, "s2");
        Mukincs f3 = new Festmenyek(6, "alk3", "cim3", Kateg.KIS_ERTEKU, "s3");

        gyujtemenyek.add(sz1);
        gyujtemenyek.add(sz2);
        gyujtemenyek.add(sz3);
        gyujtemenyek.add(f1);
        gyujtemenyek.add(f2);
        gyujtemenyek.add(f3);
    }

    public List<Mukincs> getGyujtemenyek() {
        return gyujtemenyek;
    }

    public void kiir(){
        for (Mukincs gyujtemeny : gyujtemenyek){
            System.out.println(gyujtemeny.toString());
        }
    }

    public void filebairas() throws IOException {
        FileOutputStream fos = new FileOutputStream("gyujtemenyek.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(getGyujtemenyek());
    }
}

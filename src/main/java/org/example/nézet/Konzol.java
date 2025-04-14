package org.example.nézet;

import org.example.gui.Form;
import org.example.model.Gyujtemeny;

import java.io.IOException;

public class Konzol {
    private static Gyujtemeny gy1 = new Gyujtemeny();

    public static void main(String[] args) throws IOException {
        gy1.feltolt();
        gy1.kiir();
        gy1.filebairas();
    }
}

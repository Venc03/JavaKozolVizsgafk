package org.example.gui;

import javax.swing.*;
import java.awt.event.*;

public class Form {
    private JFrame form;
    private JPanel main;
    private JPanel Menu;
    private JLabel MenuButton;
    private JButton button1;
    private JComboBox Menucmb;

    public Form() {
        ini();

        MenuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jf = new JFileChooser();
                jf.showOpenDialog(null);
            }
        });
    }

    private void ini(){
        form = new JFrame("Vizsga Felkeszito");
        form.setSize(320,240);
        form.setLocationRelativeTo(null);

        form.setContentPane(main);
        form.setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
    }
}

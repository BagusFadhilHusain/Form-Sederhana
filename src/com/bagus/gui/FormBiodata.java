package com.bagus.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIK;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nik = textNIK.getText();
                Karyawan kar = new Karyawan();
                kar.setNama(nama);
                kar.setNIK(nik);
                labelHasil.setText(kar.toString());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}

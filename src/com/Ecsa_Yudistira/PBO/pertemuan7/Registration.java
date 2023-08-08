package com.Ecsa_Yudistira.PBO.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame{
    private JPanel mainPanel;
    private JTextField TxtName;
    private JTextField TxtNIM;
    private JTextField TxtTelp;
    private JRadioButton priaRadioButton;
    private JComboBox CBProdi;
    private JTextArea TxtAreaAlamat;
    private JRadioButton wanitaRadioButton;
    private JButton saveButton;
    private JButton clearButton;

    public Registration(){
        super("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtName.setText("");
                TxtNIM.setText("");
                TxtTelp.setText("");
                TxtAreaAlamat.setText("");
                CBProdi.setSelectedIndex(0);
                priaRadioButton.setSelected(false);
                wanitaRadioButton.setSelected(false);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = TxtName.getText();
                String NIM = TxtNIM.getText();
                String prodi =(String) CBProdi.getSelectedItem();
                String telp = TxtTelp.getText();
                String alamat = TxtAreaAlamat.getText();
                String JK;
                if (priaRadioButton.isSelected()){
                    JK = "Pria";
                } else if (wanitaRadioButton.isSelected()) {
                    JK = "Wanita";
                } else {
                    JK = "Tidak diketahui";
                }

                //menampilkan msgbox
                JOptionPane.showMessageDialog
                        (null, "Data berhasil disimpan!");
            }
        });
    }

    public static void main(String[] args){
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}



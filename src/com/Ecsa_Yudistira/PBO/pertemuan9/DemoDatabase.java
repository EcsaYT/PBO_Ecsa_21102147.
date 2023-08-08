package com.Ecsa_Yudistira.PBO.pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DemoDatabase extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTextField nameField;
    private JTextField nimField;
    private JSpinner nilaiSpinner;
    private JButton clearButton;
    private JButton submitButton;
    private JLabel namaLabel;
    private JLabel NIMLabel;
    private JLabel nilaiLabel;
    private JScrollPane dataScrollPane;
    private JTable dataTable;
    private DefaultTableModel model;

    public DemoDatabase() {
        super("Demo Database");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = nimField.getText();
                String nama = nameField.getText();
                int nilai = (int) nilaiSpinner.getValue();
                
                try {
                    openDb();
                    s.executeUpdate("INSERT INTO tabel VALUE ('" + nim + "','" + nama + "','" + nilai + "')");
                    
                    Object[] row = {nim, nama, nilai};
                    model.addRow(row);
                    
                    JOptionPane.showMessageDialog(null, "Data added!");
                }catch(SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                    closeDb();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                nimField.setText("");
                nilaiSpinner.getValue();
                JOptionPane.showMessageDialog(null, "form Cleared!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }

    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    private static void openDb() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql//localhost:3306/dbdemo";
        String USERNAME = "root";
        String PASSWORD = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        s = c.createStatement();
    }
    
    private static void closeDb() {
        try {
            rs.close();
            s.close();
            c.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        model = new DefaultTableModel();
        dataTable = new JTable(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Nilai");

        try {
            openDb();
            rs = s.executeQuery("SELECT * FROM tabel");

            while(rs.next()) {
                Object[] row = {
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getInt("nilai")
                };
                model.addRow(row);
            }
        }catch(SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }finally {
            closeDb();
        }
    }
}

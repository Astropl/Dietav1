package Astro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserRegistration extends JFrame {
    private JTextField jTxt1;
    private JTextField jTxt2;
    private JTextField jTxt3;
    private JTextField jTxt4;
    private JTextField jTxt5;
    private JTextField jTxt6;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;


    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;


    public UserRegistration() {
        setLayout(null);
        setSize(500, 500);
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jTxt1);
        add(jTxt2);
        add(jTxt3);
        add(jTxt4);
        add(jTxt5);
        add(jTxt6);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);


        jTxt3.setBounds(180, 50, 250, 25);
        lbl3.setBounds(30, 40, 100, 50);
        jTxt4.setBounds(180, 80, 250, 25);
        lbl4.setBounds(30, 70, 100, 50);
        jTxt5.setBounds(180, 110, 250, 25);
        lbl5.setBounds(30, 100, 120, 50);
        jTxt6.setBounds(180, 140, 250, 25);
        lbl6.setBounds(30, 130, 100, 50);
        jTxt1.setBounds(180, 170, 250, 25);
        lbl1.setBounds(30, 160, 100, 50);
        jTxt2.setBounds(180, 200, 250, 25);
        lbl2.setBounds(30, 190, 100, 50);


        btn1.setBounds(250, 300, 100, 50);
        //btn2.setBounds(300, 300, 100, 50);
        lbl7.setBounds(250, 260, 150, 50);

        lbl1.setText("Podaj Login");
        lbl2.setText("Podaj Hasło");
        lbl3.setText("Podaj Imie");
        lbl4.setText("Podaj Nazwisko");
        lbl5.setText("Podaj Datę urodzenia");
        jTxt5.setText("1900-01-01");
        //jTxt5.setFont(setFonty());
        lbl6.setText("Podaj Wzrost");


        btn1.setText("Dodaj");
        lbl7.setText("Dodaj Użytkownika");
        //btn2.setText("Zaloguj");

        setVisible(true);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pierwszy");
                FileOperations fileOperations = new FileOperations(jTxt3.getText(),jTxt4.getText(),jTxt5.getText(),jTxt6.getText(),jTxt1.getText(),jTxt2.getText());
                try {
                    fileOperations.saveFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                //UserRegistration userRegistration = new UserRegistration();
            }
        });
    }

    private void setFonty() {

        setFont(new Font("Serif", Font.PLAIN, 24));
        return;
    }

}


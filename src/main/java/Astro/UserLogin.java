package Astro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn1;
    private JButton btn2;
    private JLabel lbl1;
    private JLabel lbl2;


    public UserLogin() {
        setLayout(null);
        setSize(500, 500);
        setTitle("Pierwsza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(textField1);
        add(textField2);
        add(btn1);
        add(btn2);
        add(lbl1);
        add(lbl2);


        textField1.setBounds(150, 100, 250, 25);
        textField2.setBounds(150, 150, 250, 25);

        btn1.setBounds(150, 200, 100, 50);
        btn2.setBounds(300, 200, 100, 50);
        lbl1.setBounds(50, 90, 80, 50);
        lbl2.setBounds(50, 140, 80, 50);
        lbl1.setText("Podaj Login");
        lbl2.setText("Podaj Hasło");
        btn1.setText("Zarejestruj");
        btn2.setText("Zaloguj");

        setVisible(true);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pierwszy");
                UserRegistration userRegistration = new UserRegistration();
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Drugi");

            }
        });
    }
}

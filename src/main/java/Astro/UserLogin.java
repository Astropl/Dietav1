package Astro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserLogin extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn1;
    private JButton btn2;
    JLabel lbl1;
    private JLabel lbl2;

    /*protected void paintComponent() {
        //super.paintComponent(g);
        Graphics2D g2d = new Graphics2D();

        // prostokat
        g2d.drawRect(10, 10, 380, 380);
        // kolo
        g2d.drawOval(10, 10, 380, 380);
    }*/


    @Override
    public String toString() {
        return "UserLogin{" +
                "textField1=" + textField1 +
                ", textField2=" + textField2 +
                ", btn1=" + btn1 +
                ", btn2=" + btn2 +
                ", lbl1=" + lbl1 +
                ", lbl2=" + lbl2 +
                ", rootPane=" + rootPane +
                ", rootPaneCheckingEnabled=" + rootPaneCheckingEnabled +
                ", accessibleContext=" + accessibleContext +
                ", accessibleContext=" + accessibleContext +
                "} " + super.toString();
    }

    public UserLogin() {
        //paintComponent();
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
                FileOperations fileOperations = new FileOperations();
                try {
                    fileOperations.odczytFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        );
    }

    public String getTextField1() {
        return String.valueOf(textField1);
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }
}

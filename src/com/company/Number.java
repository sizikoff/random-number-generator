package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Number extends JFrame {
    public Number(){
        setTitle("ГСЧ");
        setSize(170,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        JButton jbt = new JButton("Клик");
        add(jbt);

        JButton jbt2 = new JButton("Выход");
        add(jbt2);

        JTextField jtf = new JTextField("Число");
        add(jtf);
        jtf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9'))) {
                    e.consume();  // игнорим введенные буквы и пробел
                }
            }
        });

        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0;
                int b = 100;

                int random_number = a + (int) (Math.random() * b);
                String aString = Integer.toString(random_number);
                jtf.setText(aString);
            }
        });

        this.setResizable(false);
        setVisible(true);
    }

}

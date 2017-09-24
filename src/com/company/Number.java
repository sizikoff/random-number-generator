package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

        JLabel jlb = new JLabel();
        add(jlb);

        ButtonGroup group = new ButtonGroup();
        JRadioButton jrb = new JRadioButton("от 0 до 10", false);
        JRadioButton jrb2 = new JRadioButton("от 0 до 50", false);
        JRadioButton jrb3 = new JRadioButton("от 0 до 100", false);
        add(jrb);
        add(jrb2);
        add(jrb3);
        group.add(jrb);
        group.add(jrb2);
        group.add(jrb3);

        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jrb.isSelected()) {
                    int a = 0;
                    int b = 10;
                    int random_number = (a + (int) (Math.random() * b));
                    String aString = Integer.toString(random_number);
                    jlb.setText(aString);
                } else if (jrb2.isSelected()) {
                    int a = 0;
                    int b = 50;
                    int random_number = (a + (int) (Math.random() * b));
                    String aString = Integer.toString(random_number);
                    jlb.setText(aString);
                } else if (jrb3.isSelected()) {
                    int a = 0;
                    int b = 100;
                    int random_number = (a + (int) (Math.random() * b));
                    String aString = Integer.toString(random_number);
                    jlb.setText(aString);
                }
            }
        });

        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.setResizable(false);
        setVisible(true);
    }

}

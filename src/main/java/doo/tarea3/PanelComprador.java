package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {
    public PanelComprador(){
        super();
        this.setLayout(null);
        this.setBounds(500,99,400,350);
        ImageIcon flecha = new ImageIcon("flechareversa.png");
        JLabel borrar = new JLabel();
        borrar.setIcon(new ImageIcon(flecha.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
        JButton boton7 = new JButton();
        boton1.setText("1");
        boton2.setText("2");
        boton3.setText("3");
        boton4.setText("4");
        boton5.setText("5");
        boton6.setText("6");

        boton1.setBounds(40,50,50,50);
        boton2.setBounds(120,50,50,50);
        boton3.setBounds(40,150,50,50);
        boton4.setBounds(120,150,50,50);
        boton5.setBounds(40,250,50,50);
        boton6.setBounds(120,250,50,50);
        boton7.setBounds(120,300,50,50);
        borrar.setBounds(120,303,45,45);


        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        this.add(boton7);
        this.add(borrar);


        boton7.setFocusPainted(false);
        boton7.setBorderPainted(false);
        boton7.setContentAreaFilled(false);
        JTextField texto = new JTextField();
        texto.setBounds(50,15,100,30);
        this.add(texto);
        ActionListener oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "1");
            }
        };
        ActionListener oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "2");
            }
        };
        ActionListener oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "3");
            }
        };
        ActionListener oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "4");
            }
        };
        ActionListener oyente5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "5");
            }
        };
        ActionListener oyente6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText() + "6");
            }
        };
        ActionListener oyente7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
            }
        };
        boton1.addActionListener(oyente1);
        boton2.addActionListener(oyente2);
        boton3.addActionListener(oyente3);
        boton4.addActionListener(oyente4);
        boton5.addActionListener(oyente5);
        boton6.addActionListener(oyente6);
        boton7.addActionListener(oyente7);

        this.setBackground(Color.gray);


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }

}

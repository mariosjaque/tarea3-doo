package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import doo.tarea1.*;

public class PanelExpendedor extends JPanel {

    public PanelExpendedor(){
        super();
        this.setLayout(null);
        this.setBounds(300,0,400,699);
        this.setOpaque(false);

        ImageIcon super8 = new ImageIcon("super8.png");
        ImageIcon Snickers = new ImageIcon("Snickers.png");
        ImageIcon Fanta = new ImageIcon("Fanta.png");
        ImageIcon CocaCola = new ImageIcon("CocaCola.png");
        ImageIcon Sprite = new ImageIcon("Sprite.png");
        ImageIcon maquina = new ImageIcon("maquina_expendedora_sin_fondo.png");
        ImageIcon flecha_arriba = new ImageIcon("flecha_arriba.png");


        JLabel producto1 = new JLabel();
        JLabel producto2 = new JLabel();
        JLabel producto3 = new JLabel();
        JLabel producto4 = new JLabel();
        JLabel producto5 = new JLabel();
        JLabel expendedor = new JLabel();
        JLabel flecha2 = new JLabel();


        producto1.setIcon(new ImageIcon(super8.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        producto2.setIcon(new ImageIcon(Snickers.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        producto3.setIcon(new ImageIcon(CocaCola.getImage().getScaledInstance(45,40,Image.SCALE_SMOOTH)));
        producto4.setIcon(new ImageIcon(Fanta.getImage().getScaledInstance(50,40,Image.SCALE_SMOOTH)));
        producto5.setIcon(new ImageIcon(Sprite.getImage().getScaledInstance(40,45,Image.SCALE_SMOOTH)));
        expendedor.setIcon((new ImageIcon(maquina.getImage().getScaledInstance(400,600,Image.SCALE_SMOOTH))));
        flecha2.setIcon(new ImageIcon(flecha_arriba.getImage().getScaledInstance(100,250,Image.SCALE_SMOOTH)));


        producto1.setBounds(80,400,50,50);
        producto2.setBounds(212,400,50,50);
        producto3.setBounds(70,215,45,40);
        producto4.setBounds(200,210,50,40);
        producto5.setBounds(150,210,40,45);
        expendedor.setBounds(0,125,400,600);
        flecha2.setBounds(300,180,100,250);

        this.add(producto1);
        this.add(producto2);
        this.add(producto3);
        this.add(producto4);
        this.add(producto5);
        this.add(flecha2);
        this.add(expendedor);


        //Creacion teclado

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
        JButton boton8 = new JButton();
        //JLabel texto2 = new JLabel("1");
        //texto2.setBounds(0,0,10,10);
        //this.add(texto2);
        boton1.setText("1");
        boton2.setText("2");
        boton3.setText("3");
        boton4.setText("4");
        boton5.setText("5");
        boton6.setText("6");

        boton1.setBounds(10,50,50,50);
        boton2.setBounds(100,50,50,50);
        boton3.setBounds(190,50,50,50);
        boton4.setBounds(10,140,50,50);
        boton5.setBounds(100,140,50,50);
        boton6.setBounds(190,140,50,50);
        boton7.setBounds(280,50,50,50);
        boton8.setBounds(280,140,50,50);
        borrar.setBounds(280,140,50,50);


        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        this.add(boton7);
        this.add(boton8);
        this.add(borrar);



        boton7.setFocusPainted(false);
        boton7.setBorderPainted(false);
        boton7.setContentAreaFilled(false);



        boton8.setContentAreaFilled(false);
        boton8.setBorderPainted(false);
        boton8.setContentAreaFilled(false);

        JTextField texto = new JTextField();
        texto.setBounds(80,15,100,30);
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
        ActionListener oyente8 = new ActionListener() {
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
        boton8.addActionListener(oyente8);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(300,420,50,10);
        g.setColor(Color.white);
        g.fillRect(0,0,400,200);
        g.setColor(Color.green);
        g.fillArc(280,50,50,50,0,360);
    }

}

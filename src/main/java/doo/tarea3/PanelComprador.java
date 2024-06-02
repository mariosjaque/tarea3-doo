package doo.tarea3;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(){
        super();
        this.setLayout(null);
        this.setBounds(500,99,400,350);
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
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
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        JTextField texto = new JTextField();
        texto.setBounds(50,10,100,30);
        this.add(texto);
        this.setBackground(Color.gray);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}

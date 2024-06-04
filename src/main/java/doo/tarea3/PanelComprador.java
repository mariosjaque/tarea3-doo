package doo.tarea3;

import doo.tarea1.Moneda100;
import doo.tarea1.Moneda1000;
import doo.tarea1.Moneda500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelComprador extends JPanel {
    int cantidad =1000;
    public PanelComprador(){
        super();
        this.setLayout(null);
        this.setBounds(0,0,200,700);


        ImageIcon bolsa = new ImageIcon(getClass().getResource("/bolsa_de_dinero.png"));
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon(bolsa.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        imagen.setBounds(30,30,100,100);

        JLabel dinero = new JLabel(String.valueOf(1000));
        dinero.setBounds(30,20,40,10);
        this.add(imagen);
        this.add(dinero);
        this.setBackground(Color.gray);


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }





}

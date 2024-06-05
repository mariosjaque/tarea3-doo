package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


import doo.tarea1.*;

public class PanelExpendedor extends JPanel {
    private Expendedor Expendedor;

    public PanelExpendedor(Expendedor Expendedor) throws NoHayProductoException {
        super();
        Expendedor = Expendedor;

        this.setLayout(null);
        this.setBounds(300,0,400,699);
        this.setOpaque(false);

        ImageIcon super8 = new ImageIcon(getClass().getResource("/super8.png"));
        ImageIcon Snickers = new ImageIcon(getClass().getResource("/Snickers.png"));
        ImageIcon Fanta = new ImageIcon(getClass().getResource("/Fanta.png"));
        ImageIcon CocaCola = new ImageIcon(getClass().getResource("/CocaCola.png"));
        ImageIcon Sprite = new ImageIcon(getClass().getResource("/Sprite.png"));
        ImageIcon maquina = new ImageIcon(getClass().getResource("/maquina_expendedora_sin_fondo.png"));
        ImageIcon flecha_arriba = new ImageIcon(getClass().getResource("/flecha_arriba.png"));


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

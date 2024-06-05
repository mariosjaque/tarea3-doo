package doo.tarea3;

import doo.tarea1.Moneda;
import doo.tarea1.Moneda100;
import doo.tarea1.Moneda1000;
import doo.tarea1.Moneda500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelComprador extends JPanel {
    private Moneda moneda = null;
    public PanelComprador(){
        super();
        this.setLayout(null);
        this.setBounds(0,0,200,700);
        JButton moneda500 = new JButton();
        moneda500.setBounds(0,0,50,50);

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneda = new Moneda500();
            }
        };
        moneda500.addActionListener(oyente);

        this.add(moneda500);
        this.setBackground(Color.gray);

    }

    public Moneda getmoneda(){
        Moneda m;
        m = moneda;
        moneda = null;
        return m;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }





}

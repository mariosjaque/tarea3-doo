package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


import doo.tarea1.*;

public class PanelExpendedor extends JPanel {


    public PanelExpendedor(Expendedor expendedor2) throws NoHayProductoException {
        super();

        this.setLayout(null);
        this.setBounds(300,0,400,699);
        this.setOpaque(false);

        ImageIcon maquina = new ImageIcon(getClass().getResource("/maquina_expendedora_sin_fondo.png"));
        ImageIcon flecha_arriba = new ImageIcon(getClass().getResource("/flecha_arriba.png"));

        for(int i=0;i<5;i++){
            productos producto = productos.values()[i];
            int cant = expendedor2.cantidadProductos(i);
            for(int j=0;j<cant;j++) {
                JLabel productoImg = new JLabel();
                productoImg.setIcon(new ImageIcon(producto.imagenProducto().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                productoImg.setBounds(80+ (50 * (j + 1)), 400+(50*(i+1)), 50, 50);
                this.add(productoImg);
            }
        }
        JLabel expendedor = new JLabel();
        JLabel flecha2 = new JLabel();

        expendedor.setIcon((new ImageIcon(maquina.getImage().getScaledInstance(400,600,Image.SCALE_SMOOTH))));
        flecha2.setIcon(new ImageIcon(flecha_arriba.getImage().getScaledInstance(100,250,Image.SCALE_SMOOTH)));

        expendedor.setBounds(0,125,400,600);
        flecha2.setBounds(300,180,100,250);

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

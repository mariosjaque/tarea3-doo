package doo.tarea3;

import doo.tarea1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelComprador extends JPanel{
    private Moneda moneda = null;
    private Comprador comprador;
    private Expendedor expendedor;

    public PanelComprador(Expendedor exp){
        super();
        expendedor = exp;
        this.setLayout(null);
        this.setBounds(0,0,700,700);
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
        this.setOpaque(false);

        JLabel Alerta;

        //Creacion teclado

        ImageIcon flecha = new ImageIcon(getClass().getResource("/flechareversa.png"));
        JLabel borrar = new JLabel();
        borrar.setIcon(new ImageIcon(flecha.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
        JButton circulo = new JButton();
        JButton boton_borrar = new JButton();
        JButton vuelto = new JButton();
        boton1.setText("1");
        boton2.setText("2");
        boton3.setText("3");
        boton4.setText("4");
        boton5.setText("5");
        boton6.setText("6");

        boton1.setBounds(310,50,50,50);
        boton2.setBounds(400,50,50,50);
        boton3.setBounds(490,50,50,50);
        boton4.setBounds(310,140,50,50);
        boton5.setBounds(400,140,50,50);
        boton6.setBounds(490,140,50,50);
        circulo.setBounds(580,50,50,50);
        boton_borrar.setBounds(580,140,50,50);
        vuelto.setBounds(410,550,120,50);
        borrar.setBounds(580,140,50,50);


        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        this.add(circulo);
        this.add(boton_borrar);
        this.add(vuelto);
        this.add(borrar);



        circulo.setFocusPainted(false);
        circulo.setBorderPainted(false);
        circulo.setContentAreaFilled(false);



        boton_borrar.setContentAreaFilled(false);
        boton_borrar.setBorderPainted(false);
        boton_borrar.setContentAreaFilled(false);

        vuelto.setContentAreaFilled(false);
        vuelto.setBorderPainted(false);
        vuelto.setContentAreaFilled(false);

        JTextField texto = new JTextField();
        texto.setBounds(380,15,100,30);
        this.add(texto);
        ActionListener oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("1");
            }
        };
        ActionListener oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("2");
            }
        };
        ActionListener oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("3");
            }
        };
        ActionListener oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("4");
            }
        };
        ActionListener oyente5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("5");
            }
        };
        ActionListener oyente6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("6");
            }
        };
        ActionListener oyente7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int prod;
                prod = Integer.parseInt(texto.getText());
                try {
                    comprador = new Comprador(moneda,prod,expendedor);
                } catch (NoHayProductoException | PagoInsuficienteExcepcion | PagoIncorrectoException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
                texto.setText("");
                moneda = null;

            }
        };
        ActionListener oyente8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
            }
        };
        ActionListener oyente9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto queCompre = expendedor.getProducto();
                if(queCompre==null){
                    JOptionPane.showMessageDialog(null,"No hay nada");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Usted ha comprado "+queCompre.Sonido());
                }


            }
        };
        boton1.addActionListener(oyente1);
        boton2.addActionListener(oyente2);
        boton3.addActionListener(oyente3);
        boton4.addActionListener(oyente4);
        boton5.addActionListener(oyente5);
        boton6.addActionListener(oyente6);
        circulo.addActionListener(oyente7);
        boton_borrar.addActionListener(oyente8);
        vuelto.addActionListener(oyente9);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }





}

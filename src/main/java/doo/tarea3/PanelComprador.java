package doo.tarea3;

import doo.tarea1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * La clase PanelComprador extiende JPanel y representa el panel del comprador en la interfaz gráfica.
 * Contiene un objeto Moneda, un objeto Comprador y un objeto Expendedor.
 */

public class PanelComprador extends JPanel{
    private Moneda moneda = null;
    private Comprador comprador;
    private Expendedor expendedor;
    private PanelExpendedor panelexp;
    private JLabel productoImg = new JLabel();

    /**
     * Constructor de la clase PanelComprador.
     * Inicializa el comprador y la máquina expendedora, y configura la interfaz gráfica.
     */
    public PanelComprador(Expendedor exp, PanelExpendedor panel){
        super();
        panelexp= panel;
        expendedor = exp;
        this.setLayout(null);
        this.setBounds(0,0,700,700);
        JButton moneda500 = new JButton();
        JButton moneda100 = new JButton();
        JButton moneda1000 = new JButton();
        moneda100.setBounds(0,0,100,100);
        moneda500.setBounds(0,200,100,100);
        moneda1000.setBounds(0,400,100,100);


        this.add(moneda500);
        this.add(moneda100);
        this.add(moneda1000);
        this.setOpaque(false);

        JLabel Alerta;

        /**
         * Creacion de teclado, botones y oyentes.
         */


        ImageIcon flecha = new ImageIcon(getClass().getResource("/flechareversa.png"));
        ImageIcon Imoneda100 = new ImageIcon(getClass().getResource("/moneda100.png"));
        ImageIcon Imoneda500 = new ImageIcon(getClass().getResource("/moneda500.png"));
        ImageIcon Imoneda1000 = new ImageIcon(getClass().getResource("/moneda1000.png"));
        JLabel borrar = new JLabel();
        JLabel Jmoneda100 = new JLabel();
        JLabel Jmoneda500 = new JLabel();
        JLabel Jmoneda1000 = new JLabel();
        borrar.setIcon(new ImageIcon(flecha.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        Jmoneda100.setIcon(new ImageIcon(Imoneda100.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        Jmoneda500.setIcon(new ImageIcon(Imoneda500.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        Jmoneda1000.setIcon(new ImageIcon(Imoneda1000.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));

        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
        JButton circulo = new JButton();
        JButton boton_borrar = new JButton();
        JButton obtener_producto = new JButton();
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
        obtener_producto.setBounds(410,550,120,50);
        borrar.setBounds(580,140,50,50);
        Jmoneda100.setBounds(0,0,100,100);
        Jmoneda500.setBounds(0,200,100,100);
        Jmoneda1000.setBounds(0,400,100,100);


        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        this.add(circulo);
        this.add(boton_borrar);
        this.add(obtener_producto);
        this.add(borrar);
        this.add(Jmoneda100);
        this.add(Jmoneda1000);
        this.add(Jmoneda500);



        circulo.setFocusPainted(false);
        circulo.setBorderPainted(false);
        circulo.setContentAreaFilled(false);



        boton_borrar.setContentAreaFilled(false);
        boton_borrar.setBorderPainted(false);
        boton_borrar.setContentAreaFilled(false);

        obtener_producto.setContentAreaFilled(false);
        obtener_producto.setBorderPainted(false);
        obtener_producto.setContentAreaFilled(false);

        moneda100.setFocusPainted(false);
        moneda100.setBorderPainted(false);
        moneda100.setContentAreaFilled(false);

        moneda500.setFocusPainted(false);
        moneda500.setBorderPainted(false);
        moneda500.setContentAreaFilled(false);

        moneda1000.setFocusPainted(false);
        moneda1000.setBorderPainted(false);
        moneda1000.setContentAreaFilled(false);

        JTextField texto = new JTextField();
        texto.setBounds(380,15,100,30);
        this.add(texto);
        /**
         * Configura los listeners para cada oyente y le asigna un evento.
         */
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
                productos producto = productos.values()[prod-1];
                try {
                    comprador = new Comprador(moneda,prod,expendedor);
                    productoImg.setIcon(new ImageIcon(producto.imagenProducto().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                    productoImg.setBounds(410,550, 50, 50);
                    add(productoImg);
                    repaint();
                    panelexp.resetVistaDepositos(prod);
                    panelexp.repaint();
                } catch (NoHayProductoException | PagoInsuficienteExcepcion | PagoIncorrectoException ex) {
                    remove(productoImg);
                    repaint();
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
                if(productoImg!=null){
                    remove(productoImg);
                }
                Producto queCompre = expendedor.getProducto();
                if(queCompre==null){
                    JOptionPane.showMessageDialog(null,"No hay nada");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Su vuelto es de "+comprador.cuantoVuelto()+" y usted ha comprado "+queCompre.Sonido());
                }


            }
        };
        ActionListener oyente10 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneda = new Moneda100();
            }
        };
        ActionListener oyente11 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneda = new Moneda500();
            }
        };
        ActionListener oyente12 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneda = new Moneda1000();
            }
        };

        ActionListener oyente13 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        obtener_producto.addActionListener(oyente9);
        moneda100.addActionListener(oyente10);
        moneda500.addActionListener(oyente11);
        moneda1000.addActionListener(oyente12);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }





}

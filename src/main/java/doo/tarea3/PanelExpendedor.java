package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
/**
 * La clase PanelExpendedor extiende JPanel y representa una máquina expendedora en la interfaz gráfica.
 * Esta clase maneja la excepción NoHayProductoException que se lanza cuando no hay suficientes productos en la máquina.
 */
import doo.tarea1.*;
public class PanelExpendedor extends JPanel {

    private Expendedor exp;
    private ArrayList<JLabel> vistaProductos = new ArrayList<JLabel>();
    /**
     * Constructor de la clase PanelExpendedor.
     * Inicializa la máquina expendedora y configura la interfaz gráfica.
     */
    public PanelExpendedor(Expendedor expendedor2) throws NoHayProductoException {
        super();
        exp = expendedor2;
        this.setLayout(null);
        this.setBounds(300,0,400,699);
        this.setOpaque(false);

        ImageIcon maquina = new ImageIcon(getClass().getResource("/maquina_expendedora_sin_fondo.png"));
        ImageIcon flecha_arriba = new ImageIcon(getClass().getResource("/flecha_arriba.png"));

        JLabel expendedor = new JLabel();
        JLabel flecha2 = new JLabel();

        this.vistaDepositos();

        expendedor.setIcon((new ImageIcon(maquina.getImage().getScaledInstance(400,600,Image.SCALE_SMOOTH))));
        flecha2.setIcon(new ImageIcon(flecha_arriba.getImage().getScaledInstance(100,250,Image.SCALE_SMOOTH)));

        expendedor.setBounds(0,125,400,600);
        flecha2.setBounds(300,180,100,250);

        this.add(flecha2);
        this.add(expendedor);
    }
    /**
     * Método para visualizar los depósitos de productos en la interfaz gráfica.
     * Crea una etiqueta para cada producto en la máquina expendedora y la añade a la interfaz.
     */
    public void vistaDepositos(){
        for(int i=0;i<5;i++){
            productos producto = productos.values()[i];
            int cant = exp.cantidadProductos(i);
            for(int j=0;j<cant;j++) {
                JLabel productoImg = new JLabel();
                productoImg.setIcon(new ImageIcon(producto.imagenProducto().getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
                productoImg.setBounds(90+(30*j), 210+(50*i), 50, 50);
                vistaProductos.add(productoImg);
                add(productoImg);
            }
        }
    }
    /**
     * Método para resetear la vista de los depósitos de productos.
     * Elimina todas las etiquetas de productos de la interfaz y limpia la lista de etiquetas.
     */
    public void resetVistaDepositos() {
        for (JLabel producto : vistaProductos) {
            remove(producto);
        }
        vistaProductos.clear();
    }
    /**
     * Método para pintar componentes en la interfaz gráfica.
     * Este método se llama automáticamente cuando se necesita redibujar la interfaz.
     */
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

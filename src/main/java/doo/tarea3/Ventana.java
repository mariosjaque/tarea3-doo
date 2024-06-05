package doo.tarea3;
import doo.tarea1.NoHayProductoException;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame { // como extiende a un JFrame, es un JFrame, pero con algunos agregados
    // propiedades que puedes agregar aquí para que compongan a Ventana. Ventana "es un" JFrame
    PanelPrincipal panelPrincipal = new PanelPrincipal();
    PanelComprador panelComprador = new PanelComprador();
    public Ventana() throws NoHayProductoException {
        super();
        this.setLayout(null);
        this.setTitle("Expendedor y comprador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // permite que la X para cerrar la ventana esté habilitada para finalizar la ejecución
        this.setSize(700,700);

        this.setVisible(true);
        this.getContentPane().add(panelPrincipal);



    }






}
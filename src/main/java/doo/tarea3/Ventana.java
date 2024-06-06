package doo.tarea3;
import doo.tarea1.NoHayProductoException;

import java.awt.*;
import javax.swing.*;
/**
 * La clase Ventana extiende JFrame y representa la ventana principal de la interfaz gráfica.
 * Contiene un PanelPrincipal que se suma al contenido de la ventana.
 */
public class Ventana extends JFrame {
    PanelPrincipal panelPrincipal = new PanelPrincipal();
    /**
     * Constructor de la clase Ventana.
     * Inicializa el panel principal, configura la ventana y la hace visible.
     */
    public Ventana() throws NoHayProductoException {
        super();
        this.setLayout(null);
        this.setTitle("Expendedor y comprador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // permite que la X para cerrar la ventana esté habilitada para finalizar la ejecución
        this.setSize(700,700);
        /**
         * agrega el panel principal al contenido de la ventana
         */
        this.setVisible(true);
        this.getContentPane().add(panelPrincipal);



    }






}
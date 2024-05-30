package doo.tarea3;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame { // como extiende a un JFrame, es un JFrame, pero con algunos agregados
    // propiedades que puedes agregar aquí para que compongan a Ventana. Ventana "es un" JFrame
    public Ventana(){
        super();
        this.setLayout(new BorderLayout()); // aunque tiene Layout por defecto, se define uno que es mas práctico
        // auto configuración: puedes poner aquí sentencis para inicializar las propiedades nuevas y heredades de JFrame
        this.setTitle("Expendedor y comprador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // permite que la X para cerrar la ventana esté habilitada para finalizar la ejecución
        this.setExtendedState(this.MAXIMIZED_BOTH);

        this.setVisible(true);
    }

    public void IniciarVotones(JPanel panel){
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

        boton1.setBounds(100,50,100,100);
        panel.add(boton1);
    }




}
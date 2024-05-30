package doo.tarea3;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    public JPanel PanelExpendedor;
    public JPanel PanelComprador;
    public PanelPrincipal(){
        super();
        PanelExpendedor = new JPanel();
        PanelComprador = new JPanel();
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}

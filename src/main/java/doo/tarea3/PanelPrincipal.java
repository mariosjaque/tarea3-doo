package doo.tarea3;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private PanelExpendedor PanelExpendedor;
    private PanelComprador PanelComprador;
    public PanelPrincipal(){
        super();
        this.setLayout(null);
        PanelExpendedor = new PanelExpendedor();
        PanelComprador = new PanelComprador();
        this.add(PanelComprador);
        this.setBounds(0,0,690,690);
        this.setBackground(Color.yellow);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


    }
}

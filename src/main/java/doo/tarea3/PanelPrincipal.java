package doo.tarea3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import doo.tarea1.*;

public class PanelPrincipal extends JPanel {

    private PanelExpendedor PanelExpendedor;
    private PanelComprador PanelComprador;
    public PanelPrincipal() throws NoHayProductoException {
        super();
        this.setLayout(null);
        ImageIcon pared = new ImageIcon(getClass().getResource("/pared.png"));
        JLabel Pared = new JLabel();
        Pared.setIcon(new ImageIcon(pared.getImage().getScaledInstance(690,690,Image.SCALE_SMOOTH)));
        Expendedor Expendedor = new Expendedor(5);
        PanelExpendedor = new PanelExpendedor(Expendedor);
        PanelComprador = new PanelComprador(Expendedor);
        PanelExpendedor.setBackground(Color.blue);
        Pared.setBounds(0,0,690,690);
        this.add(PanelComprador);
        this.add(PanelExpendedor);
        this.add(Pared);
        this.setBounds(0,0,690,690);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


    }

}

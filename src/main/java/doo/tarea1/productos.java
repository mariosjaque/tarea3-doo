package doo.tarea1;

import javax.swing.*;
import java.awt.*;

/**
 * Utillizando un enum se representa todos los productos ofrecidos
 * y su valor de tipo int para calculos de vuelto
 */
public enum productos {
    COCA(1000,new ImageIcon(productos.class.getResource("/CocaCola.png"))),
    SPRITE(800,new ImageIcon(productos.class.getResource("/Sprite.png"))),
    FANTA(900,new ImageIcon(productos.class.getResource("/Fanta.png"))),
    SNICKERS(500,new ImageIcon(productos.class.getResource("/Snickers.png"))),
    SUPER8(100,new ImageIcon(productos.class.getResource("/super8.png")));

    private int valor;
    private ImageIcon imagen;
    private productos (int valor, ImageIcon imagen){
        this.valor = valor;
        this.imagen = imagen;
    }

    /**
     * Para conocer el valor del producto
     * @return valor: retorna el valor del producto segun el numero indicado
     */
    public int valorProductos(){
        return valor;
    }

    public ImageIcon imagenProducto(){ return imagen; }
}

package doo.tarea1;
/**
 * Esta clase hereda la abstracta de Moneda y le otorga el valor de 1000
 */
public class Billete1000 extends Moneda {
    public Billete1000() {
        super();
    }

    @Override
    public int getValor() {
        return 1000;
    }
}

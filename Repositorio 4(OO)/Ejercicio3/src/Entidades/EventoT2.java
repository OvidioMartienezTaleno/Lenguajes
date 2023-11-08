package Entidades;

/**
 *
 * @author Lenovo
 */
public class EventoT2 extends Evento{
    private int cantidadP;

    // Constructor
    public EventoT2(String titulo, String fecha, int cantidadP) {
        super(titulo, fecha);
        this.cantidadP = cantidadP;
    }

    // Método get
    public int getCantidadP() {
        return this.cantidadP;
    }

    // Método set
    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Cantidad de personas: " + this.cantidadP;
    }
    
}

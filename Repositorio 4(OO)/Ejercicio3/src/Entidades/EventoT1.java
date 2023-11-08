package Entidades;

/**
 *
 * @author Lenovo
 */
public class EventoT1 extends Evento{  
    private String ubicacion;

    // Constructor
    public EventoT1(String titulo, String fecha, String ubicacion) {
        super(titulo, fecha);
        this.ubicacion = ubicacion;
    }

    // Método get
    public String getUbicacion() {
        return this.ubicacion;
    }

    // Método set
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Ubicación: " + this.ubicacion;
    }
}

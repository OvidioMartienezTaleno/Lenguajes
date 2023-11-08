package Entidades;

/**
 *
 * @author Lenovo
 */
public class ContactoT2 extends Contacto{
     private String direccion;

    // Constructor
    public ContactoT2(String nombre, String telefono, String direccion) {
        super(nombre, telefono);
        this.direccion = direccion;
    }

    // Método get
    public String getDireccion() {
        return this.direccion;
    }

    // Método set
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Dirección: " + this.direccion;
    }
    
}

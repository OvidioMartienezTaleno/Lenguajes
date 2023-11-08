package Entidades;

/**
 *
 * @author Lenovo
 */
public abstract class Contacto {
    private String nombre;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método toString
    @Override
    public String toString() {
        return this.nombre + ", Teléfono: " + this.telefono;
    }
    
}

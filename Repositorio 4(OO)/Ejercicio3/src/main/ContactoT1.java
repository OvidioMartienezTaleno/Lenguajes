package main;

/**
 *
 * @author Lenovo
 */
public class ContactoT1 extends Contacto{
    private String email;

    // Constructor
    public ContactoT1(String nombre, String telefono, String email) {
        super(nombre, telefono);
        this.email = email;
    }

    // Método get
    public String getEmail() {
        return this.email;
    }

    // Método set
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Email: " + this.email;
    }
}

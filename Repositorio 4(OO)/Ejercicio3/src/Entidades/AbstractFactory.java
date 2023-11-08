
package Entidades;

/**
 *
 * @author Lenovo
 */
public interface AbstractFactory {
    public Contacto createContacto(String tipo, String nombre, String telefono, String extra);
    public Evento createEvento(String tipo, String titulo, String fecha, String extra);
}
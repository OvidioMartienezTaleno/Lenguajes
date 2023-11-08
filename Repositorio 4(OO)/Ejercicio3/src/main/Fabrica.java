package main;

/**
 *
 * @author Lenovo
 */
public class Fabrica {
    public Contacto crearContacto(String tipo, String nombre, String telefono, String extra) {
        if ("T1".equals(tipo)) {
            return new ContactoT1(nombre, telefono, extra);
        } else {
            return new ContactoT2(nombre, telefono, extra);
        }
    }

    public Evento crearEvento(String tipo, String titulo, String fecha, String extra) {
        return new EventoT1(titulo, fecha, extra);
    }
    
    public Evento crearEvento(String tipo, String titulo, String fecha, int extra) {
        
        return new EventoT2(titulo, fecha, extra);       
    }
}

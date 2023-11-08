package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Agenda { 
     // Variable de clase para almacenar la única instancia (Lazy Initialization)
    private static Agenda instance;

    private ArrayList<Contacto> contactos;
    private ArrayList<Evento> eventos;

    // Constructor privado
    private Agenda() {
        this.contactos = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    
    public static Agenda getInstance() {
        if (instance == null) {
            instance = new Agenda();
        }
        return instance;
    }

    // Métodos para añadir contactos y eventos
    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    public void addEvento(Evento evento) {
        this.eventos.add(evento);
    }

    // Métodos para eliminar contactos y eventos
    public void removeContacto(Contacto contacto) {
        this.contactos.remove(contacto);
    }

    public void removeEvento(Evento evento) {
        this.eventos.remove(evento);
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Agenda:\nContactos:\n");
        for (Contacto contacto : this.contactos) {
            result.append("     ").append(contacto.toString()).append("\n");
        }
        result.append("Eventos:\n");
        for (Evento evento : this.eventos) {
            result.append("     ").append(evento.toString()).append("\n");
        }
        return result.toString();
    }
    
}

package main;

import Entidades.Evento;
import Entidades.Agenda;
import Entidades.Contacto;
import Entidades.Fabrica;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Obtener la única instancia de Agenda
        Agenda agenda = Agenda.getInstance();

        // Crear una fábrica para crear contactos y eventos
        Fabrica factory = new Fabrica();

        // Crear algunos contactos y eventos utilizando la fábrica
        Contacto contacto1 = factory.crearContacto("T1", "Luis", "89329493", "correo1@gmail.com");
        Contacto contacto2 = factory.crearContacto("T1", "Maria", "83243484", "correo2@gmail.com");
        Contacto contacto3 = factory.crearContacto("T2", "Oscar", "86326509", "direcion 1");
        Contacto contacto4 = factory.crearContacto("T2", "Pedro", "85321190", "direccion 2");
                
        agenda.addContacto(contacto1);
        agenda.addContacto(contacto2);
        agenda.addContacto(contacto3);
        agenda.addContacto(contacto4);

        Evento evento1 = factory.crearEvento("T1", "Reunion", "2023-02-18", "Salon de usos");
        Evento evento2 = factory.crearEvento("T1", "Trabajo", "2023-07-22", "Oficina");
        Evento evento3 = factory.crearEvento("T2", "Evento de clases", "2023-09-05", 40);
        Evento evento4 = factory.crearEvento("T2", "Bingo", "2023-11-01", 50);      
        
        agenda.addEvento(evento1);
        agenda.addEvento(evento2);
        agenda.addEvento(evento3);
        agenda.addEvento(evento4);

        System.out.println(agenda);
    }
    
}

package main;
import Entidades.*;
import java.util.Date;
import java.util.List;

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
        Biblioteca biblioteca = new Biblioteca();

        // Crear socios
        Socio socio1 = new Socio(1, "Juan", "Calle A");
        Socio socio2 = new Socio(2, "Maria", "Calle B");
        Socio socio3 = new Socio(3, "Pedro", "Calle C");

        // Crear libros
        Libro libro1 = new Libro(101, "El señor de los anillos", "Autor 1", true, "Estante 1");
        Libro libro2 = new Libro(102, "El nombre del viento", "Autor 2", true, "Estante 2");
        Libro libro3 = new Libro(103, "Eltemor de un hombre sabio", "Autor 2", true, "Estante 3");
        Libro libro4 = new Libro(104, "Las puertas de piedra", "Autor 2", true, "Estante 3");


        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        biblioteca.agregarSocio(socio3);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Realizar préstamos
        socio1.prestarLibro(libro1,1, new Date());
        socio1.prestarLibro(libro2,1, new Date());
        socio1.prestarLibro(libro3,1, new Date());
        socio1.prestarLibro(libro4,1, new Date());
        socio2.prestarLibro(libro3,1, new Date());

        // Mostrar estado de los libros
        biblioteca.mostrarEstadoLibros();

        // Encontrar socios con más de 3 préstamos
        List<Socio> maximoPrestamo = biblioteca.prestamosMaximos();
        System.out.println("Socios con más de 3 préstamos:");
        for (Socio socio : maximoPrestamo) {
            System.out.println("Número de socio: " + socio.getNumeroSocio() + ", Nombre: " + socio.getNombre());
        }
        
        
        //Libros prestados
        biblioteca.librosPrestados();
    }
    
}

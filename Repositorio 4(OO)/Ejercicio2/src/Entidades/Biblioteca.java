package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lenovo
 */
public class Biblioteca {
    private List<Socio> socios;
    private List<Libro> libros;

    public Biblioteca() {
        socios = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Socio> prestamosMaximos() {
        return socios.stream()
                .filter(socio -> socio.getNumPrestamos() > 3)
                .collect(Collectors.toList());
    }

    public void librosPrestados() {
        for (int i = 0; i < socios.size();i++) {    
            socios.get(i).librosP();
        }
    }

    public void mostrarEstadoLibros() {
        System.out.println("Estado de los libros en la biblioteca:");
        for (Libro libro : libros) {
            String estado = libro.isDisponible() ? "Disponible" : "En préstamo";
            System.out.println("Código: " + libro.getCodigo() + ", Título: " + libro.getTitulo() +
                    ", Autor: " + libro.getAutor() + ", Estado: " + estado + ", Ubicación: " + libro.getUbicacion());
        }
    }
}

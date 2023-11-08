package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Socio {
    private int numeroSocio;
    private String nombre;
    private String direccion;
    private List<Prestamo> prestamos;

    public Socio(int numeroSocio, String nombre, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumPrestamos() {
        return prestamos.size();
    }

    public void prestarLibro(Libro libro,int id, Date fecha) {
        Prestamo prestamo = new Prestamo(libro,id, fecha);
        prestamos.add(prestamo);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    
    public void librosP(){
        System.out.println("\nLibros prestados por "+nombre+": ");
       
        for (int i = 0; i < prestamos.size(); i++) {
            System.out.println("Libro: " + prestamos.get(i).getLibro().getTitulo());            
        }
        
    }
    
}

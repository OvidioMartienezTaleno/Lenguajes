package Entidades;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Prestamo {
    private Libro libro;
    private int id;
    private Date fecha;

    public Prestamo(Libro libro,int id, Date fecha) {
        this.libro = libro;
        this.id = id;
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public int getId(){
        return id;
    }
}

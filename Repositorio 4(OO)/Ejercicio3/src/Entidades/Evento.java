package Entidades;

/**
 *
 * @author Lenovo
 */
public abstract class Evento {
    private String titulo;
    private String fecha;

    // Constructor
    public Evento(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
    }

    // Métodos get
    public String getTitulo() {
        return this.titulo;
    }

    public String getFecha() {
        return this.fecha;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + this.titulo + ", Fecha: " + this.fecha;
    }
    
}

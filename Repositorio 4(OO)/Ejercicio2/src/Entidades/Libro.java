package Entidades;

/**
 *
 * @author Lenovo
 */
public class Libro {
     private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private String ubicacion;

    public Libro(int codigo, String titulo, String autor, boolean disponible, String ubicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}
package Main;

/**
 *
 * @author Lenovo
 */
public class Texto extends ObjetoD{
    
    private String texto;

    public Texto(int x, int y, String text) {
        super(x, y);
        this.texto = text;
    }

    public String getText() {
        return texto;
    }

    @Override
    public void dibujar() {
        System.out.println("Escribiendo: \"" + texto + "\" en (x: " +
                getX() + ", y: " + getY() + ")");
    }
}

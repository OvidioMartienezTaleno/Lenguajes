package Main;

/**
 *
 * @author Lenovo
 */
public class ObjetoForma extends ObjetoD{
    
    private String type;

    public ObjetoForma(int x, int y, String type) {
        super(x, y);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un " + type + " en (x: " +
                getX() + ", y: " + getY() + ")");
    }
}

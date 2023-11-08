package Main;

/**
 *
 * @author Lenovo
 */
abstract class ObjetoD {
    private int x;
    private int y;

    public ObjetoD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void dibujar();
}

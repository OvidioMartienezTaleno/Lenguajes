
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Grupo extends ObjetoD{
    
    private List<ObjetoD> elementos;

    public Grupo(int x, int y) {
        super(x, y);
        elementos = new ArrayList<>();
    }

    public void addElemento(ObjetoD elemento) {
        elementos.add(elemento);
    }

    public void removeElemento(ObjetoD element) {
        elementos.remove(element);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un grupo en (x: " +
                getX() + ", y: " + getY() + ")");
        for (ObjetoD element : elementos) {
            element.dibujar();
        }
    }
}

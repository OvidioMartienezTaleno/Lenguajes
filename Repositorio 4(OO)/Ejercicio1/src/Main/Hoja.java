package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Hoja {
    private List<ObjetoD> elementos;

    public Hoja() {
        elementos = new ArrayList<>();
    }

    public void addElemento(ObjetoD elemento) {
        elementos.add(elemento);
    }

    public List<ObjetoD> getElemento() {
        return elementos;
    }
    
}

package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Documento {
    private List<Hoja> paginas;

    public Documento() {
        paginas = new ArrayList<>();
    }

    public void addP(Hoja pagina) {
        paginas.add(pagina);
    }

    public List<Hoja> getP() {
        return paginas;
    }
    
}

package Main;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Crear un documento
        Documento documento = new Documento();

        // Crear una página
        Hoja pagina = new Hoja();
        Hoja pagina2 = new Hoja();

        // Agregar elementos a la página
        pagina.addElemento(new ObjetoForma(100, 100, "círculo"));
        pagina.addElemento(new Texto(150, 150, "Hola"));
        
        Grupo group = new Grupo(200, 200);
        group.addElemento(new ObjetoForma(0, 0, "rectángulo"));
        group.addElemento(new Texto(50, 50, "Grupo"));
        pagina.addElemento(group);
        
        pagina2.addElemento(new ObjetoForma(100, 100, "Cuadrado"));
        pagina2.addElemento(new Texto(150, 150, "Hola mundo"));
        


        // Agregar la página al documento
        documento.addP(pagina);
        documento.addP(pagina2);

        // Mostrar el contenido del documento
        List<Hoja> paginas = documento.getP();
        for (Hoja page : paginas) {
            System.out.println("\nPágina: ");
            List<ObjetoD> elements = page.getElemento();
            for (ObjetoD element : elements) {
                element.dibujar();
                
            }
        }
    }
    
}

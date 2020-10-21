
import Backend.Ficha;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class prueba_oscar {
    
    private String NombreTorre;    
    private int tamaño;
    LinkedList<Ficha> fichas = new LinkedList();

    public prueba_oscar(String NombreTorre) {
        this.NombreTorre = NombreTorre;
    }

    public void Insertar(Ficha FichaNueva) {
        fichas.add(FichaNueva);
    }

    public Ficha ObtenerFicha() {
        Ficha ficha = fichas.getFirst();
        fichas.removeFirst();
        return ficha;
    }

    public LinkedList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(LinkedList<Ficha> fichas) {
        this.fichas = fichas;
    }
    
}

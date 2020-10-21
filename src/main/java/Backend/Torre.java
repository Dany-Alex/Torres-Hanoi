/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author goldtux
 */
public class Torre {

    private String NombreTorre;  
    private LinkedList<Ficha> fichas = new LinkedList();
    
    
    public Torre(String NombreTorre) {
        this.NombreTorre = NombreTorre;
    }
    

    public void Insertar(Ficha FichaNueva) {
        fichas.add(FichaNueva);
    }
    
    public void InsertarPrimero(Ficha FichaNueva) {
        fichas.addFirst(FichaNueva);
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
    
    public void Limpiar(){
        fichas.clear();
    }
    
    public Ficha VerFicha() {
        Ficha ficha = fichas.getFirst();
        return ficha;
    }

}

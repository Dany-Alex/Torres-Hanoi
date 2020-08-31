/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import javax.swing.JOptionPane;

/**
 *
 * @author goldtux
 */
public class Torre {

    private String NombreTorre;
    private Ficha inicio;
    private int tamaño;

    public Torre(String NombreTorre) {
        this.NombreTorre = NombreTorre;
        inicio = null;
        tamaño = 0;
    }

    public void Insertar(Ficha FichaNueva) {
        Ficha aux;
        if (tamaño == 0) {
            inicio = FichaNueva;
            System.out.println("Agregada");
            tamaño++;
        } else {
            aux = inicio;
            while (aux.getArriba() != null) {
                aux = aux.getArriba();
            }
            if (aux.getID() > FichaNueva.getID()) {
                System.out.println("AgregadaG");
                aux.setArriba(FichaNueva);
                tamaño++;
            } else {
                JOptionPane.showMessageDialog(null, "No se puede realizar el movimiento");
            }

        }
    }

    public void ObtenerNombreFicha() {
        Ficha aux = inicio;
        if (tamaño > 0) {
            while (aux != null) {
                System.out.println(aux.getNombre());
                aux = aux.getArriba();
            }
        }
    }

    public Ficha ObtenerFicha() {
        Ficha aux;
        Ficha obtener = null;
        System.out.println("tama = " +tamaño);
        if (tamaño > 0) {
            if (tamaño == 1) {
                obtener = inicio;
                tamaño = 0;
            } else {
                aux = inicio;
                while (aux.getArriba().getArriba() != null) {
                    aux = aux.getArriba();
                }
                obtener = aux.getArriba();
                aux.setArriba(null);
                tamaño--;
            }
        }
        return obtener;
    }

}

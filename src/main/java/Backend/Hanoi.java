/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author goldtux
 */
public class Hanoi {

    String mensaje = "";

    int contadorMovimentos = 0;

    /**
     *
     * @param numeroFichas es la cantidad de ficha que el usuario elige para
     * jugar
     * @param torreInicio es la torre donde se encuentran todas las fichas al
     * inicio del juego
     * @param torreAuxiliar es la torre de apoyo (la que esta en el medio)
     * @param torreDestino es la torre donde se desea mover cada ficha para
     * completar el juego
     */
    public void resolver(int numeroFichas, int torreInicio, int torreAuxiliar, int torreDestino) {

        if (numeroFichas == 1) {
            resolver(torreInicio, torreDestino);
        } else {
            resolver(numeroFichas - 1, torreInicio, torreDestino, torreAuxiliar);
            resolver(torreInicio, torreDestino);
            resolver(numeroFichas - 1, torreAuxiliar, torreInicio, torreDestino);
        }
    }

    /**
     *
     * @param torreInicio es la torre donde se encuentran todas las fichas al
     * inicio del juego
     * @param torreDestino es la torre donde se desea mover cada ficha para
     * completar el juego
     */
    public void resolver(int torreInicio, int torreDestino) {
        contadorMovimentos++;
        String mensajeAux;
        mensajeAux = " Movimiento #" + contadorMovimentos + ": Torre " + torreInicio + " a Torre " + torreDestino + "\n";
        mensaje += mensajeAux;
        

    }

    /**
     *
     * @return retorna un string donde se concatenan todos pasos de cada
     * movimiento ha ralizar para completar el juego
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     *
     * @return retorna la cantidad de movimeintos minimos
     */
    public int getContadorMovimentos() {
        return contadorMovimentos;
    }

}

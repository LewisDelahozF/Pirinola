/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * En esta clase se guardan todos los metodos que se pueden realizar con las
 * apuestas Posee un atributo monto que indica la cantidad de monedas en la
 * apuesta
 *
 * @author Lewis De la hoz
 */
public class Apuesta {

    private int monto;

    /**
     * Inicializa la apuesta en 0 para indicar que nadie a apostado
     */
    public Apuesta() {
        this.monto = 0;
    }

    /**
     * Permite saber la cantidad de monedas que hay en la apuesta
     *
     * @return Devuelve un entero que dice cuantas monedas hay en la apuesta
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Se actualiza el numero de monedas en la apuesta
     *
     * @param monto nuevo numero de monedas en la apuesta
     */
    public void setMonto(int monto) {
        this.monto = this.monto + monto;
    }

}

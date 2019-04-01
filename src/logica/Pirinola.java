/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * Define y le da cuerpo a los metodos que puede realizar la pirinola Le da
 * cuerpo a los metodos abstractos de la clase Trompo Posee un String caraArriba
 * el cual guarda textualmente la accion que debera hacer el jugador luego de
 * girar la pirinola
 *
 * @author Lewis De la hoz
 *
 */
public class Pirinola extends Trompo {

    private String caraArriba;

    /**
     * inicializa a la super clase para utilizar sus metodos y darle cuerpo a
     * los metodos abstractos inicializa el atributo caraArriba con un espacio
     * en blanco
     */
    public Pirinola() {
        super();
        this.caraArriba = " ";
    }

    @Override
    public int girar() {
        setcara();
        setCaraArriba();
        return getCara();
    }

    /**
     * Devuelve el nombre de la cara que salio luego de girar la pirinola
     *
     * @return retorna la cara que salio para jugar
     */
    public String getCaraArriba() {
        return caraArriba;
    }

    /**
     * Interpreta el valor obtenido al girar la pirinola asignandole a cada
     * valor una accion destinta
     */
    public void setCaraArriba() {
        if (getCara() == 0) {
            this.caraArriba = "Pon 1";
        }
        if (getCara() == 1) {
            this.caraArriba = "Pon 2";
        }
        if (getCara() == 2) {
            this.caraArriba = "Toma 1";
        }
        if (getCara() == 3) {
            this.caraArriba = "Toma 2";
        }
        if (getCara() == 4) {
            this.caraArriba = "Todos Ponen";
        }
        if (getCara() == 5) {
            this.caraArriba = "Toma Todo";
        }
    }

}

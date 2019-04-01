/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * Clase abstracta que nos brinda los metodos basicos que tiene cualquier trompo
 * Posee un atributo llamado cara el cual guarda la cara que salio luego de
 * girar el trompo
 *
 * @author Lewis De la hoz
 */
public abstract class Trompo {

    private int cara;

    /**
     * Inicializa el atributo cara en -1 indicando que no se a girado el trompo
     */
    public Trompo() {
        this.cara = -1;
    }

    /**
     * Elige al azar un numero entre 0 y 5 que simularan ser las caras de un
     * trompo El numero se genera 5 veces para que sea mas aleatorio Ese numero
     * al azar se guarda en el atributo cara
     */
    public void setcara() {
        for (int i = 0; i < 5; i++) {
            this.cara = (int) (Math.random() * 5);
        }

    }

    /**
     * Devuelve un entero entre 0 y 5 que identificara la cara que salio
     *
     * @return devuelve el numero aleatorio entre 0 y 5
     */
    public int getCara() {
        return cara;
    }

    /**
     * Metodo que da la posibilidad de girar un trompo pero como no se sabe que
     * clase de trompo es se define como abstracto
     *
     * @return Devuelve el numero aleatorio resultante de girar la pirinola
     */
    public abstract int girar();

}

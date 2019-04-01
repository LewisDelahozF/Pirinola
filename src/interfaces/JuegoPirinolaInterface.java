/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import logica.Jugador;

/**
 * Define los metodos del Juego Pirinola
 *
 * @author Lewis De la hoz
 */
public interface JuegoPirinolaInterface {

    /**
     * Permite iniciar sesion para un jugador. No permitira nombres repetidos
     * Solo iniciara sesion con jugadores con mas de una monedas
     *
     * @param nombre es el nombre de usuario del jugador. Se guardara siempre en
     * mayuscula
     * @param monedas es la cantidad de monedas conque inicia el jugador
     * @return Devuelve true si pudo iniciar sesion. Devuelve false si hubo
     * problemas con el nombre o la cantidad de monedas.
     */
    public boolean iniciarSesion(String nombre, int monedas);

    /**
     * Permite cerrar sesion para un jugador
     *
     * @param nombre es el nombre de usuario del jugador. Se guardara siempre en
     * mayuscula
     * @return Devuelve true si se pudo cerrar sesion. Devuelve false si hubo
     * algun problema con el nombre
     */
    public boolean cerrarSesion(String nombre);

    /**
     * Permite iniciar el juego para poder girar la pirinola y apostar
     *
     * @return Devuelve el String que contiene el texto que indica la cara que
     * salio para jugar
     */
    public String CaraArriba();

    /**
     * Permite saber que usuarios estan jugando
     *
     * @return Devuelve la lista de jugadores que hay
     */
    public ArrayList<Jugador> getJugadores();

    /**
     * Permite realizar las apuestas y mostrar el nuevo monto en las apuestas
     */
    public void setApuesta();

    /**
     * Devuelve la cantidad de monedas que hay en la apuesta
     *
     * @return Devuelve el total de monedas de la apuesta
     */
    public int getapuestas();

    /**
     * Verifica que el jugador tenga el turno, para proceder a girar la pirinola
     * Hace girar la pirinola si el jugador tiene el turno
     *
     * @param nombre es el nombre de usuario del jugador. Se guardara siempre en
     * mayuscula
     * @return Devuelve el numero aleatorio resultante de girar la pirinola
     */
    public int girarPirinola(String nombre);

    /**
     * Almacena en el atributo JugadorTurno de la clase para indicar quien tiene
     * el tuno
     *
     * @param JugadorTurno el indice de la persona con el turno en el arraylist
     */
    public void setJugadorTurno(int JugadorTurno);

    /**
     * Verifica si el jugador tiene el turno
     *
     * @param nombre Nombre del usuario a verificar
     * @return Devuelve true si el jugador tiene el turno. Devuelve false si el
     * jugador no tiene el turno
     */
    public boolean getJugadorTurno(String nombre);

    /**
     * Almacena el mensaje Privado en el arraylist de mensajes de el
     * destinatario
     *
     * @param envia String que indica quien envia el mensaje
     * @param recibe String que indica quien recibe el mensaje
     * @param Mensaje String con el mensaje a enviar
     */
    public void enviarMensajes(String envia, String recibe, String Mensaje);

    /**
     * Almacena los mensajes Publicos en un arraylist de string para luego ser
     * visualizados
     *
     * @param Remitente String que indica quien envia el mensaje
     * @param Mensaje String con el mensaje a enviar
     */
    public void enviarMensajes(String Remitente, String Mensaje);

    /**
     * Devuelve el arraylist de mensajes publicos
     *
     * @return Devuelve el Array donde se almacenan los mensajes publicos
     */
    public ArrayList<String> getMensajes();

    /**
     * Cambia la apuesta manualmente cuando solo queda un jugador en el juego
     * Este metodo sirve para que si un jugador queda solo automaticamente gane
     *
     * @param Monto Numero actual de monedas en la apuesta
     * @param nombre Nombre del usuario
     */
    public void setApuestaManual(int Monto, String nombre);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 * Define los metodos y atributos que tendra un usuario
 *
 * @author Lewis De la hoz
 */
public class Jugador {

    private int codigo;
    private ArrayList<String> mensaje;
    private String nombre;
    private int monedas;
    private boolean turno;

    /**
     * Inicializa los atributos de un nuevo jugador
     *
     * @param codigo codigo del nuevo jugador
     * @param nombre nombre del nuevo jugador
     * @param monedas el numero de monedas tiene el nuevo jugador
     * @param turno dice si el jugador tiene que girar la pirinola o no
     */
    public Jugador(int codigo, String nombre, int monedas, boolean turno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.monedas = monedas;
        this.turno = turno;
        this.mensaje = new ArrayList();
    }

    /**
     * Permite informar cual es el codigo del jugador
     *
     * @return Devuelve el codigo de el jugador
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Permite cambiar el codigo de un usuario
     *
     * @param codigo nuevo codigo de un usuario
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Informa cual es el nombre del jugador
     *
     * @return Devuelve el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite cambiar el nombre del usuario
     *
     * @param nombre nuevo nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite saber la cantidad de monedas con la que cuenta un jugador
     *
     * @return Devuelve el numero de monedas que tiene el usuario
     */
    public int getMonedas() {
        return monedas;
    }

    /**
     * Permite actualizar el numero de monedas que tiene el jugador
     *
     * @param monedas nueva cantidad de monedas
     */
    public void setMonedas(int monedas) {
        this.monedas = this.monedas + monedas;
    }

    /**
     * Permite saber el estado del turno del jugador
     *
     * @return Devuelve true si el usuario tiene el turno. Devuelve false si
     * todavia no tiene el turno
     */
    public boolean isTurno() {
        return turno;
    }

    /**
     * Cambia el estado de turno del jugador
     *
     * @param turno nuevo estado de turno del jugador
     */
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    /**
     * Devuelve el arraylist de mensajes recibidos del jugador
     *
     * @return retorna el array list de mensajes
     */
    public ArrayList<String> getMensaje() {
        return mensaje;
    }

    /**
     * Agrega el nuevo mensaje para el jugador en su arraylist de mensajes
     * recibidos
     *
     * @param mensaje Nuevo mensaje para el jugador
     */
    public void setMensaje(String mensaje) {
        this.mensaje.add(mensaje);
    }

    /**
     * Devuelve el nombre del usuario y su nomero de monedas en un String de
     * forma organizada
     *
     * @return retorna los datos necesarios para mostrar en pantalla
     */
    public String getDatos() {
        String Datos = ("Usuario: " + nombre + " - Monedas: " + monedas);
        return Datos;
    }

}

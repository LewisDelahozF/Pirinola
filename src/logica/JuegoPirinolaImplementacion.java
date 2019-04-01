/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import interfaces.JuegoPirinolaInterface;
import java.util.ArrayList;

/**
 * Realiza los metodos del juego Pirinola
 *
 * @author Lewis De la hoz
 */
public class JuegoPirinolaImplementacion implements JuegoPirinolaInterface {

    ArrayList<Jugador> jugadores;
    ArrayList<String> MensajesPublicos;
    int apuestas;
    int JugadorTurno;
    Pirinola pirinola;
    Apuesta apuesta;

    /**
     * Inicializa todos los atributos del Juego
     */
    public JuegoPirinolaImplementacion() {
        this.jugadores = new ArrayList();
        this.apuestas = 0;
        this.JugadorTurno = -1;
        this.apuesta = new Apuesta();
        this.pirinola = new Pirinola();
        this.MensajesPublicos = new ArrayList();
    }

    @Override
    public boolean iniciarSesion(String nombre, int monedas) {
        boolean encontro = false;
        int codigo = 0;
        if (monedas > 1) {
            for (int i = 0; i < jugadores.size(); i++) {
                codigo++;
                Jugador jugador = jugadores.get(i);
                if (jugador.getNombre().equals(nombre)) {
                    encontro = true;
                    break;
                }
            }
            if (!encontro) {
                Jugador jugador = new Jugador(codigo, nombre, monedas - 1, false);
                jugadores.add(jugador);
                apuesta.setMonto(1);
            }
        }
        return encontro;
    }

    @Override
    public boolean cerrarSesion(String nombre) {
        boolean encontro = false;
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equals(nombre)) {
                jugadores.remove(i);
                encontro = true;

            }

        }
        return encontro;
    }

    @Override
    public String CaraArriba() {
        return pirinola.getCaraArriba();
    }

    @Override
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    @Override
    public void setApuesta() {
        if (apuestas == 0) {
            apuesta.setMonto(1);
            Jugador jugador = jugadores.get(JugadorTurno);
            jugador.setMonedas(-1);
        }
        if (apuestas == 1) {
            apuesta.setMonto(2);
            Jugador jugador = jugadores.get(JugadorTurno);
            jugador.setMonedas(-2);
        }
        if (apuestas == 2) {
            apuesta.setMonto(-1);
            Jugador jugador = jugadores.get(JugadorTurno);
            jugador.setMonedas(1);
        }
        if (apuestas == 3) {
            apuesta.setMonto(-2);
            Jugador jugador = jugadores.get(JugadorTurno);
            jugador.setMonedas(2);
        }
        if (apuestas == 4) {
            apuesta.setMonto(jugadores.size());
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugador = jugadores.get(i);
                jugador.setMonedas(-1);
            }
        }
        if (apuestas == 5) {
            Jugador jugador = jugadores.get(JugadorTurno);
            jugador.setMonedas(apuesta.getMonto());
            apuesta.setMonto(-apuesta.getMonto());
        }

    }

    @Override
    public int getapuestas() {
        return apuesta.getMonto();
    }

    @Override
    public int girarPirinola(String nombre) {
        apuestas = pirinola.girar();
        return apuestas;
    }

    @Override
    public void setJugadorTurno(int JugadorTurno) {
        this.JugadorTurno = JugadorTurno;
    }

    @Override
    public boolean getJugadorTurno(String nombre) {
        Jugador jugador = jugadores.get(JugadorTurno);
        return jugador.getNombre().equals(nombre);
    }

    @Override
    public void enviarMensajes(String envia, String recibe, String Mensaje) {
        int clave = -1;
        boolean RemitenteEncontrado = false;
        boolean DestinatarioEncontrado = false;
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equals(envia)) {
                RemitenteEncontrado = true;
            }
            if (jugador.getNombre().equals(recibe)) {
                DestinatarioEncontrado = true;
                clave = i;
            }
        }
        if (RemitenteEncontrado == true && DestinatarioEncontrado == true) {
            Jugador jugador = jugadores.get(clave);
            Mensaje = "El usuario " + envia + " te dice: " + Mensaje;
            jugadores.get(clave).setMensaje(Mensaje);
        }

    }

    @Override
    public void enviarMensajes(String remitente, String Mensaje) {
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equals(remitente)) {
                MensajesPublicos.add(Mensaje);
            }
        }
    }

    @Override
    public ArrayList<String> getMensajes() {
        return MensajesPublicos;
    }

    @Override
    public void setApuestaManual(int Monto, String nombre) {
        apuesta.setMonto(-apuesta.getMonto());
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(nombre)) {
                Jugador jugador = jugadores.get(i);
                jugador.setMonedas(Monto);
            }

        }
    }
}

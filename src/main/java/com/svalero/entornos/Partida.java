package com.svalero.entornos;

import java.util.ArrayList;
import java.util.HashMap;

public class Partida {
    private String nombre;
    private ArrayList<Jugador> listaJugadores;
    private Baraja baraja;
    private HashMap<String, Integer> puntuacionJugadores;

    public Partida(String nombre) {
        this.nombre = nombre;
        listaJugadores = new ArrayList<>();
        puntuacionJugadores = new HashMap<>();
        baraja = new Baraja();
    }

    public void addJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public void jugarPartida(int turnos) {

    }

    public void jugarRonda() {

    }

    public void comprobarGanadorRonda() {

    }

    public void comprobarGanadorPartida() {

    }
}

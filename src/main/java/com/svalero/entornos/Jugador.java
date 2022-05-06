package com.svalero.entornos;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> misCartas;
    private int puntos;

    public Jugador(String nombre){
        this.nombre = nombre;
        misCartas = new ArrayList<>();
        puntos = 0;
    }

    public void preguntarMovimiento(){

    }

    public void addCarta(Carta cara){
        misCartas.add(cara);
    }

    public void imprimirCartas(){

    }

    public void resetarRonda(){
        
    }
}

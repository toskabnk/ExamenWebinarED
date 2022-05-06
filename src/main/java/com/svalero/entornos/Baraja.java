package com.svalero.entornos;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> listaCartas;
    public final int NUM_CARTAS = 52;

    public Baraja(){
        listaCartas = new ArrayList<>();
    }

    public void barajar(){

    }

    public Carta cogerCarta(){
        return listaCartas.get(5);
    }

    public ArrayList<Carta> repartirMano(){
        return listaCartas;
    }
}

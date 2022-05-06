package com.svalero.entornos;

public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero){
        this.numero = numero;
        this.palo = palo;
    }

    public int getValor(){
        return Integer.parseInt(numero);
    }

    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}

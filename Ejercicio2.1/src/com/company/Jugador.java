package com.company;

public class Jugador {

    String nombre;
    String posicion;
    Integer numCamiseta;

    public Jugador(String nombre, String posicion, Integer numCamiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
    }


    public String imprimirJugador() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numCamiseta=" + numCamiseta +
                '}';
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}


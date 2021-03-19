package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Equipo implements Iterator{
    ArrayList<Jugador> listaJugadores;

    public Equipo(ArrayList<Jugador> l1){
        this.listaJugadores = l1;
    }

    public void addJugador(Jugador j){
        listaJugadores.add(j);
    }

    public void deleteJugador(Jugador j){
        listaJugadores.remove(j);
    }

    public void imprimirJugadores(){
        Iterator<Jugador> it =listaJugadores.iterator();

        while (it.hasNext()){
            System.out.println(it.next().imprimirJugador());
        }

    }

    public Jugador buscarPorNombre(String nombre){
        Boolean acertado = false;
        while(!acertado){
            for (int i = 0; i < listaJugadores.size(); i++) {
                if (listaJugadores.get(i).nombre.toUpperCase(Locale.ROOT) == nombre.toUpperCase(Locale.ROOT)){
                    acertado = true;
                    return listaJugadores.get(i);
                }
            }
        }
        return null;

    }

    public void buscarMismaPosicion(String pos){
        for (int i = 0; i < listaJugadores.size(); i++) {
            if (listaJugadores.get(i).posicion.toUpperCase(Locale.ROOT) == pos.toUpperCase(Locale.ROOT)){
                listaJugadores.get(i).imprimirJugador();
            }
        }
    }

    public void cambiarPosicion(Jugador j,String pos){
        j.setPosicion(pos);
        j.imprimirJugador();
    }



    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

package com.company;

import javax.sound.midi.SysexMessage;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jugador j1 = new Jugador("Dani", "Centrocampista", 4);
        Jugador j2 = new Jugador("CArlos", "Central", 14);
        Jugador j3 = new Jugador("Chicharo", "Defensa", 63);
        Jugador j4 = new Jugador("Matias", "Delantero", 12);
        Jugador j5 = new Jugador("Pepe", "Centrocampista", 9);
        Jugador j6 = new Jugador("Santi", "Delantero", 47);
        Jugador j7 = new Jugador("Pablo", "Central", 6);

        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);
        listaJugadores.add(j5);
        listaJugadores.add(j6);
        listaJugadores.add(j7);

        Equipo e1 = new Equipo(listaJugadores);

        Boolean menuActivo = true;

        if (menuActivo){
            while(menuActivo){
                System.out.println("1. Añadir un nuevo jugador");
                System.out.println("2. Borrar un jugador");
                System.out.println("3. Imprimir todos los jugadores");
                System.out.println("4. Buscar por posición");
                System.out.println("5. Modificar la posición de un jugador");
                System.out.println("6.Ordenar la lista por posiciones");
                System.out.println("0. Salir");

                Integer opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        String nombre;
                        System.out.println("Introduzca el nombre del jugador");
                        nombre = sc.next();
                        String posicion;
                        System.out.println("Introduzca la posición (Defensa, Centrocampista o Delantero)");
                        posicion = sc.next();
                        Integer numero;
                        System.out.println("Introduzca el número");
                        numero = sc.nextInt();

                        Jugador j = new Jugador(nombre, posicion, numero);

                        e1.addJugador(j);
                        System.out.println("");
                        System.out.println(j.imprimirJugador());
                        break;
                    case 2:
                        Integer jugadorAEliminar;
                        System.out.println("Introduzca el indice del jugador de la siguiente lista que desee borrar");
                        System.out.println("");
                        e1.imprimirJugadores();
                        jugadorAEliminar = sc.nextInt();
                        jugadorAEliminar--;
                        e1.deleteJugador(e1.listaJugadores.get(jugadorAEliminar));

                        break;
                    case 3:
                        e1.imprimirJugadores();
                        break;
                    case 4:
                        String pos;
                        System.out.println("Introduzca la posición por la que desea buscar (Defensa, Centrocampista o Delantero)");
                        pos = sc.next();
                        e1.buscarMismaPosicion(pos);
                        break;
                    case 5:
                        String nuevaPos;
                        Integer indiceJugador;
                        System.out.println("Introduzca el indice del jugador de la siguiente lista que desee cambiar su posición");
                        e1.imprimirJugadores();
                        indiceJugador = sc.nextInt();
                        indiceJugador--;
                        System.out.println("Introduzca la posición (Defensa, Centrocampista o Delantero)");
                        nuevaPos = sc.next();
                        e1.imprimirJugadores();
                        e1.listaJugadores.get(indiceJugador).setPosicion(nuevaPos);

                        break;
                    case 6:
                        break;
                }
            }
        }



    }
}

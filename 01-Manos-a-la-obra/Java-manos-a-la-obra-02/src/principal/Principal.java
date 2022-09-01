/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package principal;

import java.util.ArrayList;


public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j1 = new Jugador("juan", "jota", "delantero", 10);
        Jugador j2 = new Jugador("juana", "bota", "arquero", 9);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);
        Equipo equipo1 = new Equipo();
        equipo1.setJugadores(jugadores);
        
        System.out.println("Muestro la lista de jugadores de equipo1");
       
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }    
            
        Jugador j3 = new Jugador("juan", "jota", "delantero", 10);
        Jugador j4 = new Jugador("juana", "bota", "arquero", 9);
        ArrayList<Jugador> jugadores2 = new ArrayList<>();
        jugadores2.add(j3);
        jugadores2.add(j4);
        Equipo equipo2 = new Equipo();
        equipo2.setJugadores(jugadores2);
        
        System.out.println("Muestro la lista de jugadores de equipo 2");
       
        for (Jugador jugadore2 : jugadores) {
            System.out.println(jugadore2);
        }
    
    }
    
}

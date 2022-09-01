/*
 EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package principal;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    
    private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
    //getter and setters

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    //to String

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
    
}

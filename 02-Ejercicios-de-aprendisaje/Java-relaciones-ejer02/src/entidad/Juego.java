/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidad;

import java.util.ArrayList;
import java.util.HashSet;


public class Juego {
    
    private HashSet<Jugador> jugadoresConjunto;
    private Revolver r1;
    
    // contructores

    public Juego() {
    }

    public Juego(HashSet<Jugador> jugadoresConjunto, Revolver r1) {
        this.jugadoresConjunto = jugadoresConjunto;
        this.r1 = r1;
    }
    
    //getter and setters

    public HashSet<Jugador> getJugadoresConjunto() {
        return jugadoresConjunto;
    }

    public void setJugadoresConjunto(HashSet<Jugador> jugadoresConjunto) {
        this.jugadoresConjunto = jugadoresConjunto;
    }

    public Revolver getR1() {
        return r1;
    }

    public void setR1(Revolver r1) {
        this.r1 = r1;
    }
    
    
    /*
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.
    */
    
    public  void llenarJuego(ArrayList<Jugador>jugadoresLista, Revolver r){
        this.jugadoresConjunto = new HashSet<>(jugadoresLista);                          
        this.r1 = r;
    }
    
    /*
     ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
    moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    mojar. Al final del juego, se debe mostrar que jugador se mojó.
    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    
    public void ronda(){
        boolean mojado = false;
        System.out.println("Comienza la ronda");
        do {
            for (Jugador jugador : this.jugadoresConjunto) {
                if (jugador.disparo(this.r1)) {
                    System.out.println("El jugador mojado es: " + jugador.getNombre() );
                    mojado = true;
                    break;
                }
        }
        } while (!mojado);
    }
}

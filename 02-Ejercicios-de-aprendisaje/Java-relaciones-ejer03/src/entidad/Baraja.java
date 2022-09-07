/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package entidad;

import entidad.Carta;
import enum_.Numero;
import enum_.Palo;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    
    private ArrayList<Carta> mazoinicial = new ArrayList();
    private ArrayList<Carta> cartasrepartidas = new ArrayList<>();
    
    //•    CREAR BARAJA:
    public static Baraja crearBaraja() {
        return new Baraja();
    }
    
    
    //metodos
     //LLENAR la BARAJA en el CONSTRUCTOR.-
    public Baraja(){
         System.out.println("Se crea la baraja: ");
         
         for (Numero num : Numero.values()) {
             for (Palo pal : Palo.values()) {
                 mazoinicial.add(new Carta(num, pal));
             }
         }
         
     }
       //• barajar(): cambia de posición todas las cartas aleatoriamente.  
       
       public void barajar(){
           Collections.shuffle(mazoinicial);
       
       }
         
     //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
     //se haya llegado al final, se indica al usuario que no hay más cartas.
     
        public Carta siguienteCarta(){
            if (mazoinicial.isEmpty()) {
               System.out.println("No hay cartas suficientes en el mazo");
            }
               Carta sigCarta = mazoinicial.get(0); // tomo la primer carta del mazo inicial
               
               mazoinicial.remove(0); //borro la carta del mazo inicial
               
               cartasrepartidas.add(sigCarta); // agrego la carta tomada al mazo de cartas repartidas
         
            return sigCarta;    
       }
        
     //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
        
        public void cartasDisponibles(){
            System.out.println("Las cartas disponible en el mazo son: " + mazoinicial.size());
        }
        
    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
        public int darCartas( int cantidad){
            if (mazoinicial.size() < cantidad) {
                System.out.println("No hay suficientes cartas en el mazo ");
                return 0;
            } else{
                for (int i = 0; i < cantidad; i++) {
                    siguienteCarta();
                }
                return cantidad;
            }
        }
      // cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
      //indicárselo al usuario  
        
        public void cartasMonton(){
            if (cartasrepartidas.isEmpty()) {   // isEmpty retorna true si el conjunto esta vacio
                System.out.println("No ha salido ninguna carta");
                return;
            }
            System.out.println("Las cartas que salieron son: ");
            for (Carta cartasrepartida : cartasrepartidas) {
                System.out.println(cartasrepartida);  
                
            }
             
        }
        
       // mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
       // luego se llama al método, este no mostrara esa primera carta.
        
        public void mostrarBaraja(){
             System.out.println("Las cartas que quedan en el mazo inicial son: ");
            for (Carta carta : mazoinicial) {
                System.out.println(carta);
            }
        }
        
        
}

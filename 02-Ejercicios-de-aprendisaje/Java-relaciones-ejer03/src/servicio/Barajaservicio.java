/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import entidad.Baraja;


public class Barajaservicio {
    
    private Baraja sb = new Baraja();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void menuBaraja(){
        System.out.println("Bienvenodo al menu de cartas ");
        int opcion = 20;
        do {
            do {
             System.out.println("Ingrese la operacion a realizar:\n1. Mostrar baraja\n2. "
            + "Barajar las cartas\n3. Pedir una carta\n4. Pedir varias cartas\n5. Saber la cantidad de"
            + " naipes entregados\n0. Salir");
             
            try {
                opcion = 20; // se reinicia con una opcion diferente a una valida
                opcion=Integer.parseInt(scan.next());
                break;
                }catch(Exception ex) {
                    System.out.println("Error, ingrese un numero ");
            }
            
            
        } while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion !=5 && opcion!=0 );
        
       
            switch(opcion)
            {
                case 1:                     
                    sb.mostrarBaraja();
                break;
                case 2:                    
                    sb.barajar();
                break;
                case 3: 
                   sb.siguienteCarta();
                break;
                case 4:
                    System.out.println("Ingrese la cartidad de cartas que quiere pedir: ");
                    int opc = scan.nextInt();
                    sb.darCartas(opc);
                    break;
                case 5:
                    sb.cartasMonton();
                    break;
                case 0: break;
            }
        } while (opcion != 0);
        
    }
    

     
}

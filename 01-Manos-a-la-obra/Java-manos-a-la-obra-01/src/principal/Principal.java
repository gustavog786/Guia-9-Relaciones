/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Dni d1= new Dni('a', 2500);
        Persona p1 = new Persona( "pepe","pol", d1);
       
        System.out.println(p1);
        
        p1.setNombre("lalo");
        p1.setApellido("jojo");
        
        d1.setSerie(scan.next().charAt(0));
        d1.setNumero(scan.nextInt());
        System.out.println(p1);
    }
    
}

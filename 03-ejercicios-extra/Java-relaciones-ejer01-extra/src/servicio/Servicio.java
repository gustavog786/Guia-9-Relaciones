/*
 
 */
/*
package servicio;

import entidad.Perro;
import entidad.Persona;
import enums.Raza;
import enums.Tamanio;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Servicio {
    Persona perso = new Persona();
    Perro perro = new Perro();
    ArrayList<Persona> personasCreadas = new ArrayList<>();
    ArrayList<Perro> perrrosCreados = new ArrayList<>();
    Scanner scan= new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(){
        System.out.println("vamos a crea una persona");
        System.out.println("Ingrese el nombre: ");
        perso.setNombre(scan.next());
        System.out.println("Ingrese el apellido: ");
        perso.setApellido(scan.next());
        System.out.println("Ingrese la edad: ");
        perso.setEdad(scan.nextInt());
        System.out.println("Ingrese el dni: ");
        perso.setDni(scan.nextInt());
        personasCreadas.add(perso);
    }
    
    public void crearPerro(){
         System.out.println("vamos a crea un perro");
         System.out.println("Ingrese el nombre del perro: ");
         perro.setNombre(scan.next());
         System.out.println("Ingrese la raza: ");
         for (Raza razaaux : Raza.values()) {
             System.out.println(razaaux);
        }
         int x = scan.nextInt();
         perro.setRaza(Raza.values()[x-1]);
         System.out.println("Ingrese la edad: ");
         perro.setEdad(scan.nextInt());
         System.out.println("Seleccione el tamanio: ");
         for (Tamanio tamanioaux : Tamanio.values()) {
             System.out.println(tamanioaux);
        }
        int y = scan.nextInt();
        perro.setTamanio(Tamanio.values()[y-1]); 
        perrrosCreados.add(perro);
    }
    
    public void mostrarPersonas(){
        for (Persona personasCreada : personasCreadas) {
            System.out.println(personasCreada);
        }
    }
    
    public void mostrarPerros(){
        for (Perro  perrocreado : perrrosCreados) {
            System.out.println(perrocreado);
        }
    
    }
    
    public void adoptarPerro(){
        System.out.println("Adoptar Perros");
        for (Persona personasCreada : personasCreadas) {
            System.out.println("Para:  " + personasCreada.getNombre()+ " "+ personasCreada.getApellido());
            System.out.println("Todos los perros son: ");
            
            for (Perro perrocreado : perrrosCreados) {
                System.out.println(perro.getNombre());   
            }
            System.out.println("Escriba el nombre del perro a adoptar: ");
            String nomPerro = scan.next();
            for (Perro perrocreado : perrrosCreados) {
                if (perrocreado.getNombre().equals(nomPerro)) {
                    if (Objects.isNull(perrocreado.getDueno())) {
                        perrocreado.setDueno(perso);
                        personasCreada.setPerros(perrrosCreados);
                        System.out.println("se asigno ok");   
                    }else{ System.out.println("El perro ya esta adoptado");}
                }
            }
        }
    }
}

   */
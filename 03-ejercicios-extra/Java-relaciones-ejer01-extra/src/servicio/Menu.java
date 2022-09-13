/*
 
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import enums.Raza;
import enums.Tamanio;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private Scanner scan = new Scanner(System.in);
    Persona perso = new Persona();
    Perro perro = new Perro();

    public void menu(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        int opcion = 50;
        boolean ok = false;
        do {
            System.out.println("Bienvenido a la tienda de mascotas: ");
            do {
                //opcion = 20;
                Scanner scan = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Ingrese la operacion a realizar:\n1. Mostrar personas\n2. "
                        + "Mostrar Perros\n3. Agregar personas\n4. Agregar perros\n5. Eliminar personas"
                        + " \n6. Eliminar perros\n7. Adoptar un perro\n8. Devolver Perro\n0. Salir");
                try {
                    opcion = (scan.nextInt());
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese un numero ");
                }
            } while (!ok);
            switch (opcion) {
                case 1:
                    mostrarPersonas(personas);
                    break;
                case 2:
                    mostrarPerros(perros);
                    break;
                case 3:
                    agregarPersona(personas);
                    break;
                case 4:
                    agregarPerro(perros);
                    break;
                case 5:
                    eliminarPersona(personas);
                    break;
                case 6:
                    eliminarPerro(perros);
                    break;
                case 7:
                    adoptarPerro(personas, perros);
                    break;
                case 8:
                    devolverPerro(personas, perros);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 0);
    }

    //METODOS
    public void mostrarPersonas(ArrayList<Persona> personas) {
        System.out.println("Lista de personas: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void mostrarPerros(ArrayList<Perro> perros) {
        System.out.println("Lista de perros: ");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public void agregarPersona(ArrayList<Persona> personas) {
        System.out.println("vamos a crear una persona");
        System.out.println("Ingrese el nombre: ");
        String Nombre = scan.next();
        System.out.println("Ingrese el apellido: ");
        String Apellido = scan.next();
        System.out.println("Ingrese la edad: ");
        int Edad = scan.nextInt();
        System.out.println("Ingrese el dni: ");
        int Dni = scan.nextInt();
        personas.add(new Persona(Nombre, Apellido, Edad, Dni, perro));
    }

    public void agregarPerro(ArrayList<Perro> perros) {
        System.out.println("Vamos a crear un perro");
        System.out.println("Ingrese el nombre del perro: ");
        String Nombre = scan.next();
        System.out.println("Ingrese la raza: ");
        for (Raza razaaux : Raza.values()) {
            System.out.println(razaaux);
        }
        int x = scan.nextInt();
        Raza raz = (Raza.values()[x - 1]);
        System.out.println("Ingrese la edad: ");
        int Edad = scan.nextInt();
        System.out.println("Seleccione el tamanio: ");
        for (Tamanio tamanioaux : Tamanio.values()) {
            System.out.println(tamanioaux);
        }
        int y = scan.nextInt();
        Tamanio tam = (Tamanio.values()[y - 1]);
        perros.add(new Perro(Nombre, raz, Edad, tam, true, perso));
    }

    public void eliminarPersona(ArrayList<Persona> personas) {
        System.out.println("Ingrese el nombre de la persona que quiere eliminar: ");
        mostrarPersonas(personas);
        String personaEliminada = scan.next();
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(personaEliminada)) {
                for (Perro perro1 : it.next().getPerros()) {
                    perro1.setDueno(null);
                }
                it.remove();
                return;
            }
        }
        System.out.println("La persona elegida no esta en la lista ");
    }

    public void eliminarPerro(ArrayList<Perro> perros) {
        System.out.println("La lista de perros es: ");
        for (Perro perro1 : perros) {
            System.out.println(perro1);
        }
        System.out.println("Ingrese el perro que quiere eliminar: ");
        mostrarPerros(perros);
        String perroEliminado = scan.next();
        boolean okk = true;
        Iterator<Perro> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(perroEliminado)) {
                it.next().getDueno().getPerros().remove(it);
                it.remove();
                okk = true;
            }
        }
        if (okk = false) {
            System.out.println("El perro no esta en la lista");
        }
    }

    public void adoptarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println("Introduzca el nombre del perro que quiere adoptar: ");
        String perroElegido = scan.next();
        for (Perro perro1 : perros) {
            if (perroElegido.equals(perro1.getNombre())) {
                if (!Objects.isNull(perro1.getDueno())) {
                    System.out.println("El perro elegido ya esta adoptado");
                    return;
                }
                System.out.println("Ingrese el nombre de la persona: ");
                String personaAdoptadora = scan.next();
                for (Persona persona1 : personas) {
                    if (personaAdoptadora.equals(persona1.getNombre())) {
                        perro1.setDueno(persona1);
                        persona1.getPerros().add(perro1);
                        return;
                    }
                }
            }
        }
        System.out.println("El perro es inexistente");
    }

    public void devolverPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println("Esta devolviendo un perro");
        System.out.println("Intruduzca el nombre del perro: ");
        String perroDevolver = scan.next();
        for (Perro perro1 : perros) {
            if (perroDevolver.equals(perro1.getNombre())) {
              if (Objects.isNull(perro1.getDueno())) {
                System.out.println("Perro no adoptado");
                return;
                }   
            }
            perro1.getDueno().getPerros().remove(perro1);
            perro1.setDueno(null);            
        }
        System.out.println("Perro devuelto con exito");
    }
}

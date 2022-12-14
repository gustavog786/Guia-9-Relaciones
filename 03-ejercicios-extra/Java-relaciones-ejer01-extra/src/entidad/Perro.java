/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enums.Raza;
import enums.Tamanio;
import java.util.Objects;


public class Perro {
    
    private String nombre;
    private Raza raza;
    private int edad;
    private Tamanio tamanio;
    private boolean adoptado;
    private Persona dueno;
    
///CONSTR:

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, Tamanio tamanio, boolean adoptado, Persona dueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
        this.dueno = dueno;
    }

    public Perro(String nombre, Raza raza, int edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    
    //getter and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public Persona getDueno() {
        return dueno;
    }


    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

///ToSTRING:
    
    /*
    @Override
    public String toString() {
        String base = "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ","
                + " tamanio=" + tamanio + ", adoptado=" + adoptado  + '}';
        if (Objects.isNull(dueno)){
            return base + ", dueno=SIN DUENO";
        }
        return base + ", dueno=" + dueno.getNombre() + '}';
    }
   
    */
    ///ToSTRING (MODIFICADO para evitar el bucle infinito de los ToString):
    @Override
    public String toString() {

        //Si la persona a??n no adopt?? (PERRO = NULO).-
        if (Objects.isNull(this.dueno)) {

            //Retorna Perro con todos los atributos menos la PERSONA.-
            return "Perro // Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tama??o: " + tamanio + ", Due??o: 0";
        }

        //Si la persona ya adopt?? un perro; retorna Perro con todos los atributos + el nombre y apellido de la PERSONA.-
        return "Perro // Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tama??o: " + tamanio + ", Due??o: " + this.dueno.getNombre();
    }
}

    


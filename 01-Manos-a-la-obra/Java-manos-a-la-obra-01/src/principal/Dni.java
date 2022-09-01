/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package principal;


class Dni {
    private char serie;
    private int numero;
    
    
    //Construtores

    public Dni() {
    }

    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    //getter and setters

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //to string

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
}

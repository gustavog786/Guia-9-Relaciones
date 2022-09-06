/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package entidad;


public class Revolver {
    private int posicionActual;
    private int pocisionAgua;
    
    final static int CANTIDADPOSICIONES = 6;
    
    //constructores

    public Revolver() {
        this.posicionActual=(int)(Math.random()*(CANTIDADPOSICIONES-1));
        this.pocisionAgua = (int)(Math.random()*(CANTIDADPOSICIONES-1));
    }
    
    //getter and setters

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPocisionAgua() {
        return pocisionAgua;
    }

    public void setPocisionAgua(int pocisionAgua) {
        this.pocisionAgua = pocisionAgua;
    }
    
    //to String

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", pocisionAgua=" + pocisionAgua + '}';
    }
    
    /*
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.
    */
    
    public void llenarRevolver(){
        this.posicionActual=(int)(Math.random()*(CANTIDADPOSICIONES-1));
        this.pocisionAgua = (int)(Math.random()*(CANTIDADPOSICIONES -1));
    }
    
    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar(){
   
        return this.posicionActual == this.pocisionAgua; // devuelve true si se cumple
    }
    
    //• siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro(){
        mojar();
        if (!mojar()) {
            this.posicionActual += 1;
            if (this.posicionActual == CANTIDADPOSICIONES) {
                this.posicionActual = 0;
            }
        } 
    }
    
}

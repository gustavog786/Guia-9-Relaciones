/*

 */
package enums;


public enum Tamanio {
    PEQUENIO("1. Pequenio"),MEDIANO("2. Mediano"),GRANDE("3. Grande");
    
     private String tam;
     
     
     //constructores

    private Tamanio() {
    }

    private Tamanio(String tam) {
        this.tam = tam;
    }
     
    //getter

    public String getTam() {
        return tam;
    }
    
    
    //to String

    @Override
    public String toString() {
        return "[" + tam + ']';
    }
    
    
}

/*

 */
package enum_;


public enum Numero {
    
    UNO(1),DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6),SIETE(7),DIEZ(10),ONCE(11),DOCE(12);
    
    private int numero;
    
    //constructores
    private Numero() {
    }

    private Numero(int numero) {
        this.numero = numero;
    }
    
    //getter

    public int getNumero() {
        return numero;
    }

    // to String 

    @Override
    public String toString() {
        return  "" + numero;
    }
    
    
}

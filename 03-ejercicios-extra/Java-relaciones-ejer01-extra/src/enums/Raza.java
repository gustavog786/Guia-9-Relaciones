/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import com.sun.corba.se.spi.transport.CorbaConnectionCache;

/**
 *
 * @author gusta
 */
public enum Raza {
        CANICHE("1. Caniche"),SALCHICHA("2. Salchicha"),PEQUINEZ("3. Pequinez"),DOGO("4. Dogo"),DELA("5. Dela");
    private String raza;
    
    //contructores

    private Raza(String raza) {
        this.raza = raza;
    }
    
    
    //getter

    public String getRaza() {
        return raza;
    }
    //to String 

    @Override
    public String toString() {
        return "[" + raza + ']';
    }
    
    
}

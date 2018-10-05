/*
 */

package ooj.uppgift_1;

public abstract class Djur implements IMatadjur {
    
    //instansvariabler som är skyddade från andra paket men går att nå i subklasser
    protected String namn;
    protected int vikt;
    
    Djur(String namn, int vikt){
        this.namn = namn;
        this.vikt = vikt * 1000;  
    }
}

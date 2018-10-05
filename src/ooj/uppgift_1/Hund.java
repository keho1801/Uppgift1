/*
 */

package ooj.uppgift_1;

public class Hund extends Djur{
    
    Hund(String namn, int vikt){
        super(namn, vikt);   
    }
    
    @Override
    public void mata() {
        System.out.println("Hunden " + namn + " ska få en portion: " + vikt/100 + "g av hundfoder");
    }
}

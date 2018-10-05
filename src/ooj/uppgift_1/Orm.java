/*
 */

package ooj.uppgift_1;

public class Orm extends Djur{
    
    Orm(String namn, int vikt){
        super(namn, vikt);   
    }
    
    @Override
    public void mata() {
        System.out.println("Ormen " + namn + " ska få en portion: " + 20 + "g av ormpellet");
    }
}

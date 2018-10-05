/*
 */

package ooj.uppgift_1;

public class Katt extends Djur{
      
    Katt(String namn, int vikt){
        super(namn, vikt);
    }   
    
    @Override
    public void mata() {
        System.out.println("Katten " + namn + " ska få en portion " + vikt/150 + "g av kattfoder");
    }
}

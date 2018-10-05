/*
 */

package ooj.uppgift_1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class OOJUppgift_1 {
    
    OOJUppgift_1(){
    
        Djur sixten = new Hund("Sixten",5);
        Djur dogge = new Hund ("Dogge",10);
        Djur venus = new Katt ("Venus",5);
        Djur ove = new Katt ("Ove",3);
        Djur hypno = new Orm ("Hypno",1);

        
        List<Djur> alladjur = new ArrayList<>();
       
        alladjur.add(sixten);
        alladjur.add(dogge);        
        alladjur.add(venus);
        alladjur.add(ove);
        alladjur.add(hypno);

        while(true){
                
            String s = JOptionPane.showInputDialog(null,"Vilket djur ska få mat?"); 

            if(s == null)
                break;

            for(int i = 0; i < alladjur.size(); i++)
                if(alladjur.get(i).namn.equalsIgnoreCase(s)){
                    alladjur.get(i).mata(); // Listan alladjur är av typen Djur men anropar metoden i subklassen på grund av polymorfism
                    return;
                    
                }  
            System.out.println("Det finns inget djur med det namnet");          
            
            }
    }
        
    public static void main(String[] args) {
        
        OOJUppgift_1 m = new OOJUppgift_1();
    }
}


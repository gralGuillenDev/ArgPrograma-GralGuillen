
package Comparadores;

import Entidad.Carta;
import java.util.Comparator;

/**
 * @author gralguillen
 */

public class OrdenarBaraja {
    
    
    
   public static Comparator<Carta> ordenarBaraja = new Comparator<Carta> (){
       @Override
       public int compare(Carta a, Carta b){
           return a.getPalo().compareTo(b.getPalo());
       }
   }; 
        
    

}

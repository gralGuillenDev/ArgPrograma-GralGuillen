

package gralguillendev.relacionesextra2;

import Entidades.Cine;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class RelacionesExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cine cine = new Cine();
        cine.crearSala();
        cine.mostrarAsientosSala();
        cine.crearPelicula();
        System.out.println(cine.getPelicula());
        cine.generarEspectadores();
        cine.imprimirEspectadores();
        cine.ubicarEspectadores();
        cine.mostrarAsientosSala();
        
       //Podemos Averiguar quien esta sentado en la Butaca
        do{
            System.out.println("Verificar Butaca y su ocupante");
            cine.buscarAsiento();
            System.out.println("quieres seguir");
        }while(leer.next().equalsIgnoreCase("S"));
      
    }
}

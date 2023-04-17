
package gralguillendev.nespressoapp.Service;

import Entidad.Cafetera;
import java.util.Scanner;


public class CafeteraService {
    private Scanner leer = new Scanner(System.in);
    
    
    public Cafetera crearCafetera(){
        return new Cafetera(1000,0);
    }
    
    public void llenarCafetera(Cafetera caf){
       // Cafetera c1 = new Cafetera();
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }
    
    public int servirTaza(int capacidadTaza, Cafetera caf){
        
       
        if(caf.getCantidadActual()<capacidadTaza){
            System.out.println("La taza solo se lleno a "+caf.getCantidadActual());
            caf.setCantidadActual(0);
            System.out.println("Su cafetera esta vacia");
        }else{
            caf.setCantidadActual(caf.getCantidadActual()-capacidadTaza);
            System.out.println("Se lleno la taza");
        }
        return caf.getCantidadActual();
    }
    
    public void vaciarCafetera(Cafetera caf){
        
        caf.setCantidadActual(0);
    }
    
    public int agregarCafe(int d, Cafetera caf){
        caf.setCantidadActual(caf.getCantidadActual()+d);
        return caf.getCantidadActual();
    }
    
    
}

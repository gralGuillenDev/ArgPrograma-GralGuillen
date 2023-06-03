
package gralguillendev.ejer2guia12;

import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ElectrodomesticoServicio;

/**
 * @author gralguillen
 */
public class Ejer2guia12 {

    public static void main(String[] args){
        ElectrodomesticoServicio ser = new ElectrodomesticoServicio();
        Televisor tv = ser.crearTelevisor();
        Lavadora lav = ser.crearLavadora();
        tv.precioFinal();
        lav.precioFinal();
        System.out.println(tv);
        System.out.println(lav);
    
    }
  
}

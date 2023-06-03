
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class ElectrodomesticoServicio extends Electrodomestico{

    private final Scanner leer =new Scanner(System.in);
    //Son los mismos metodos que estan en las clases, use servicio para que se vea mejor en el main
    public Lavadora crearLavadora() {
        System.out.println("Ingresa la Capacidad de Carga");
        int cap = leer.nextInt();
        Lavadora l = new Lavadora(cap);
        crearElectrodomestico(l);
        return l;
    }

    public Televisor crearTelevisor() {
        boolean tdt;
        System.out.println("Ingresa la resolucion en pulgadas");
        int pulg = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? S/N");
        if (leer.next().equalsIgnoreCase("S")) {
            tdt = true;
        } else {
            tdt = false;
        }
        Televisor tv = new Televisor(pulg, tdt);
        crearElectrodomestico(tv);
        return tv;
    }
}

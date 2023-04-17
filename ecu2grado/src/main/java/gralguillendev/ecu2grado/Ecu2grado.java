
package gralguillendev.ecu2grado;

import Entidad.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class Ecu2grado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        RaicesServicio serv = new RaicesServicio();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Bienvenido al Sistema de Resolucion de ecuaciones de segundo grado");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Desea cargar una funcion? S/N");
        if (leer.next().equalsIgnoreCase("S")) {
            Raices ra1 = serv.crearEcuacion();
            System.out.println("");
            System.out.println("Su Ecuacion es: " + ra1.getLadoA() + "x2 " + ra1.getLadoB() + "x " + ra1.getLadoC() + " = 0");
            System.out.println("");
            System.out.println("Hallaremos las soluciones posibles");
            if (serv.tieneRaices(ra1)) {
                System.out.println("Tiene dos soluciones posibles");
                System.out.println("Decea ver las soluciones? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    serv.calcular(ra1);
                }

            } else if (serv.tieneRaiz(ra1)) {
                System.out.println("Tiene una solucion posible");
                System.out.println("Decea ver las soluciones? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    serv.calcular(ra1);
                }
            }

        }
    }
}

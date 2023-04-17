

package gralguillendev.nespressoapp;

import Entidad.Cafetera;
import gralguillendev.nespressoapp.Service.CafeteraService;
import java.util.Scanner;


public class NespressoApp {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        CafeteraService cafeService = new CafeteraService();
        Cafetera cafeterita1 = cafeService.crearCafetera();
        int opcion;
        
        while (salir == false) {
            System.out.println("Bienvenido a NESPRESSO");
            System.out.println("Se creo una Cafetera nueva para ustes");
            System.out.println("Escoja entre las siguientes las opciones");
            System.out.println("1. Llena Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Mostrar cantidad de cafe");
           
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cafeService.llenarCafetera(cafeterita1);
                    break;
                case 2:
                    System.out.println("Ingrese la capacidad de su taza");
                    cafeService.servirTaza(leer.nextInt(), cafeterita1);
                    break;
                case 3:
                    cafeService.vaciarCafetera(cafeterita1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe");
                    cafeService.agregarCafe(leer.nextInt(), cafeterita1);
                    break;
                case 5: System.out.println("Su cafetera tiene "+cafeterita1.getCantidadActual()+" de cafe");
                
            }
            System.out.println("Desea realizar otra opcion? S/N");
            if(leer.next().equalsIgnoreCase("N")){
                salir = true;
            }
        }
    }
    
    
    
}
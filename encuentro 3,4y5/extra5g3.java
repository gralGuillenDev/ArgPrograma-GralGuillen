/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor,
pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada
y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’,
no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio,
y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.

 */
package gralguillendev.introjavaap;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra5g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String opcion;
       int costo;
        System.out.println("Ingrese la clase de Socio: A, B o C");
        opcion = leer.next();
        System.out.println("Ingrese el costo total de su tratamiento");
        costo = leer.nextInt();
       switch(opcion){
           case "A","a": System.out.println("El total a pagar con descuesto es: "+costo*0.5); break;
           case "B","b": System.out.println("El total a pagar con descuesto es: "+costo*0.35); break;
           case "C","c": System.out.println("El total a pagar con "+costo); break;
       }
    }
    
}

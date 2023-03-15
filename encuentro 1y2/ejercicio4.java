/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
    double grados;
    double F;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Dame grados C");
        grados = teclado.nextDouble();
        F = 32 + (9*grados/5);
        System.out.println("Tus grados en Fahrenheit son : "+F);
    
    }
    
}

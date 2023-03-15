/* Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. El programa deberá después mostrar el 
resultado de la suma
*/
package gralguillendev.apjava1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        int A;
        int B;
        Scanner tecladoIn = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        A = tecladoIn.nextInt();
        System.out.println("Ingrese el segundo numero");
        B = tecladoIn.nextInt();
        
        System.out.println("La suma de ambos numeros es: "+(A+B));
    }
}

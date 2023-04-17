/*
Realice un programa que calcule y visualice el valor máximo,
el valor mínimo y el promedio de n números (n>0). El valor de
n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del
programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package gralguillendev.introjavaap;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra7g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int max=0;
       int min=0;
       double n;
       double prom=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea");
        n = leer.nextDouble();
        while(n>0){
           System.out.println("Ingrese un numero");
           num=leer.nextInt();
           prom = prom + num;
           if(num>max){
               max = num;
           }else if(num<=min){
               min = num;
           }
           n--;
       }
        System.out.println("EL NUMERMO MAXIMO INGRESADO ES: "+max);
        System.out.println("EL NUMERMO MINIMO INGRESADO ES: "+min);
        System.out.println("EL PROMEDIO ES: "+(prom/n));
    }  
}

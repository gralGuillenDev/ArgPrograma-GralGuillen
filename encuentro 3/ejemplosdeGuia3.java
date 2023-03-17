
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejemplosdeGuia3 {
   public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
   int a, b;
       System.out.println("Ingrese uun numero");
       a = leer.nextInt();
       System.out.println("Ingrese otro numero");
       b = leer.nextInt();
       if(a>25 || b>25){
           System.out.println("Uno de los 2 numero es mayor de 25");
       }else{
           System.out.println("Ninguno es mayor que 25");
       }
   } 
}

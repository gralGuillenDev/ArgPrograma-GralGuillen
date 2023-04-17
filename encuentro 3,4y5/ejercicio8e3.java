
package gralguillendev.apjava1;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class ejercicio8e3 {
    public static void main(String[] args){
    int n;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamanio de los lados");
        n = leer.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        for(int i=0;i<(n-2);i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
                System.out.println(" ");
        }  
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
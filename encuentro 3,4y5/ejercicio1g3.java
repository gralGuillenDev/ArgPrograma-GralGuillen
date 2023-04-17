
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio1g3 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if(num%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}

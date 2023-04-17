
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio5Guia3 {
    public static void main(String[] args){
    int num;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entre 1 y 20");
        for(int i=0;i<4;i++){
            do{
            num = leer.nextInt();
            }while(num<1 || num>20);
              System.out.print(num);
              for(int a=0;a<num;a++){
              System.out.print("*");
              }
              System.out.println("");
        }
    }
}


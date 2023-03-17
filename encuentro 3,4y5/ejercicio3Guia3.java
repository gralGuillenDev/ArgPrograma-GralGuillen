
package gralguillendev.apjava1;

import java.util.Scanner;


public class ejercicio3Guia3 {
    public static void main(String[] args){
    int nota;
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = leer.nextInt();
        while(nota<0 || nota>10){
            System.out.println("Nota incorrecta, intenta nuevamente");
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota es correcta "+nota);
    }
}

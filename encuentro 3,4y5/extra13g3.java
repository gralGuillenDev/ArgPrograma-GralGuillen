/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea. 
Solicitar la altura de la escalera al usuario al comenzar. 
Ejemplo: si se ingresa el número 3:
 */
package gralguillendev.introjavaap;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra13g3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamanio para su escalera");
        int n = leer.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<i+2;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados
por el usuario, validando que el primer número múltiplo del segundo
e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;

public class ejemplo12guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        EsMultiplo(num,num2);

    }
    
    
    public static void EsMultiplo(int a,int b){
        if(a%b==0){
            System.out.println("El numero "+a+" es multiplo de "+b);
        }else{
            System.out.println("El numero "+a+" NO es multiplo de "+b);
        }
    }
    
}
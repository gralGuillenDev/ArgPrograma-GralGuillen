/*
Escribir un programa que lea un número entero y devuelva el
número de dígitos que componen ese número. Por ejemplo, 
si introducimos el número 12345, el programa deberá devolver 
5. Calcular la cantidad de dígitos matemáticamente utilizando 
el operador de división. Nota: recordar que las variables 
de tipo entero truncan los números o resultados.

 */
package gralguillendev.introjavaap;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra11g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,cont = 0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        while(num>0){
            num=num/10;
            cont++;
        }
        System.out.println("El numero ingresado tiene "+cont+" digitos");
    }
    
}

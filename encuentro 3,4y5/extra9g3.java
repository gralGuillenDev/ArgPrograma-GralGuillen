/*
Simular la división usando solamente restas. Dados dos números enteros 
mayores que uno, realizar un algoritmo que calcule el cociente y el 
residuo usando sólo restas. Método: Restar el dividendo del divisor 
hasta obtener un resultado menor que el divisor, este resultado es el 
residuo, y el número de restas realizadas es el cociente.
 */
package gralguillendev.introjavaap;

import java.util.Scanner;

public class extra9g3 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int div, dividendo, divisor, cont=0;
        System.out.println("Ingrese el numero dividendo");
        div = leer.nextInt();
        dividendo = div;
        System.out.println("Ingrese el numero divisor");
        divisor = leer.nextInt();
        while(dividendo>divisor){
        dividendo=dividendo-divisor;
        cont++;
        }
        System.out.println("La division de "+div+" entre "+divisor+" da:");
        System.out.println("Un cociente de "+cont+" y un residuo de "+dividendo+" da:");
    }
    
}

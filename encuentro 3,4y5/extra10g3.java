/*
Realice un programa para que el usuario adivine el resultado de 
una multiplicación entre dos números generados aleatoriamente 
entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe 
permitir al usuario ingresar su respuesta nuevamente. Para realizar
este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package gralguillendev.introjavaap;

import java.util.Scanner;

public class extra10g3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, respuesta, otro;
        num1 = (int) (Math.random()*10+1);
        num2 = (int) (Math.random()*10+1);
        System.out.println(num1*num2);
        System.out.println("Adivina la resultado de la multiplicacion de A * B");
        respuesta = leer.nextInt();
        do{
            respuesta = leer.nextInt();
            if(respuesta != num1*num2){
                System.out.println("Incorrecto, intenta nuevamente");
            }
        }while(respuesta != num1*num2);
        System.out.println("Felicidades, Acertaste");
           
    }    
}

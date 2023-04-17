/*
Leer la altura de N personas y determinar el promedio de estaturas
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package gralguillendev.introjavaap;
import java.util.Scanner;
public class extra6g3 {
    public static void main(String[] args) {
        String res;
        boolean salir = false;
        int contBajas=0;
        int cont=0;
        double altura;
        double promedio = 0;
        double bajas = 0;
       Scanner leer = new Scanner(System.in);
       do{
           System.out.println("Ingrese la altura de la persona");
           altura = leer.nextDouble();
           if(altura<1.60){
               bajas = bajas + altura;
               contBajas++;
           }
           promedio=promedio+altura;
           cont++;
           System.out.println("Desea ingresar mas alturas? S/N");
           res = leer.next();
                   if(res.equalsIgnoreCase("N")){
                   salir = true;
                   }
       }while(salir==false);
        System.out.println("Promedio de estaturas "+promedio/cont);
        System.out.println("Promedio de estaturas debajo de 1.60 mts. "+bajas/contBajas);
        
    }
}

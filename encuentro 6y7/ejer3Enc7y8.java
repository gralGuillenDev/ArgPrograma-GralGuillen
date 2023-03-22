/*
Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y
la moneda a convertir que será una cadena, este no devolverá ningún valor
y mostrará un mensaje indicando el cambio (void).
 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;

public class ejer3Enc7y8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        System.out.println("BIENVENIDO A CHANGE MONEY");
        System.out.println("Ingrese la cantidad de Euros que desea cambiar");
        euros = leer.nextInt();
        System.out.println("Escoja la Divisa que quiere obtener entre dólares, yenes o libras");
        moneda = leer.next();
        CambioDivisas(euros,moneda);
    }
     public static void CambioDivisas(double dinero, String divisa) {
        switch(divisa){
          case "libras","LIBRAS":
              System.out.println(dinero*0.86);
              break;
          case "DOLARES","dolares":
              System.out.println(dinero*1.28611);
              break;
          case "yenes","YENES":
              System.out.println(dinero*123);
              break;
        }
    }
}
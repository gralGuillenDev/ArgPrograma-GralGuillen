/*
Dado un tiempo en minutos, calcular su equivalente en días y horas
. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
calcular su equivalente: 1 día, 2 horas.

 */
package gralguillendev.introjavaap;

import java.util.Scanner;

public class extra1g3 {

    public static void main(String[] args) {
        int minutos;
        int horas;
        int dias;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        minutos = leer.nextInt();
        horas = minutos/60;
        if(minutos>60){
            if(horas>24){
                dias = horas/24;
                horas = horas-(dias*24);
                minutos = minutos-(dias*1440)-(horas*60);
                System.out.println( "Su equivalente es: "+dias+ "dias, " +horas+ "horas, "+minutos+" minutos.");
            }else{
                System.out.println( "Su equivalente es: 0 dias, " +horas+ "horas.");
            }
        }else{
            System.out.println( "Su equivalente es: 0 dias, 0 horas, "+minutos+" .");
        }
    }
}    


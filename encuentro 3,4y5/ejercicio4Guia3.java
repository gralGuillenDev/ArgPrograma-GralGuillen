
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio4Guia3 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int cont = 1;
    int num;
    int suma = 0;
        do{
        System.out.println("Ingrese un numero #"+cont);
        num = leer.nextInt();
        if(num>0){
            suma = suma + num;
        }
        cont ++;
        if(num==0){
            System.out.println("Se capturo el numero 0");
            System.out.println("La sumatoria de los numeros es "+suma);
            break;}
        }while(cont<=20);  
    }
}
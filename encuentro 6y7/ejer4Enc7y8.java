/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o 
no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí 
mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre
5, sin embargo, 17 si es primo.
 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;
public class ejer4Enc7y8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es PRIMO");
        int num = leer.nextInt();
        Primonizor(num);
    }
    public static void Primonizor(int a){
        boolean flag = true;
        int m=2; //le pongo 2 porq el uno no cuenta como numero primo
        while (flag==true && a>m) {
            if (a%m == 0){
            flag = false;
            }else{
            m++;
            }
        }
        if(flag==true){
            System.out.println("Es Primo");
        }else{
            System.out.println("no es primo");
        }
    }
}

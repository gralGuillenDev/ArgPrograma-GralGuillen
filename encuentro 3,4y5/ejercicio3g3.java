/*
Realizar un programa que solo permita introducir solo frases o palabras de 8
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package gralguillendev.apjava1;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class ejercicio3g3 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    String palabras;
        System.out.println("Ingrese una frase o palabra de 8 digitos como maximo");
        palabras = leer.nextLine();
        if (palabras.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Inconrrecto");
        }
    }
}

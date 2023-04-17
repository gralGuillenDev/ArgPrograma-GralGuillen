/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte
si se trata de una vocal. Caso contrario mostrar un mensaje.
Nota: investigar la función equals() de la clase String.
 */
package gralguillendev.introjavaap;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra3g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        if(letra.equalsIgnoreCase("a")||
           letra.equalsIgnoreCase("e")||
           letra.equalsIgnoreCase("i")||
           letra.equalsIgnoreCase("o")||
           letra.equalsIgnoreCase("u")){
            System.out.println("Correcto");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}

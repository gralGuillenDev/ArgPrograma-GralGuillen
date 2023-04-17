/*
Realizar un algoritmo que llene un vector con los 100 primeros
números enteros y los muestre por pantalla en orden descendente.

 */
package Guia5Java;

/**
 *
 * @author gralguillen
 */
public class ejer1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        for (int i = vector.length; i > 0; i--) {
            System.out.println(vector[i - 1]);
        }
    }
}

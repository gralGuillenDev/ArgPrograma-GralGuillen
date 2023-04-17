/*
Escribir un programa que procese una secuencia de caracteres 
ingresada por teclado y terminada en punto, y luego codifique
la palabra o frase ingresada de la siguiente manera: cada vocal
se reemplaza por el carácter que se indica en la tabla y el
resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.

 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;

public class ejemplo11guia4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caracter;
        String cadena = "";
        do {
            System.out.println("Ingrese un caracter para generar una frase");
            caracter = leer.nextLine();
            cadena = cadena.concat(caracter);
        } while (!caracter.equals("."));
        System.out.println("La frase armada es " + cadena);
        System.out.println("La Frase codificada es " + Codificador(cadena));
    }

    public static String Codificador(String frase) {
        String letra;
        String newFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a", "A":
                    letra = "@";
                    break;
                case "e", "E":
                    letra = "#";
                    break;
                case "i", "I":
                    letra = "$";
                    break;
                case "o", "O":
                    letra = "%";
                    break;
                case "u", "U":
                    letra = "*";
                    break;
                default:
                    break;
            }
            newFrase = newFrase.concat(letra);
        }
        return newFrase;
    }

}

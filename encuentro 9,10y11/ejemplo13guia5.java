/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
de compañeros de equipo y define su tipo de dato de tal manera
que te permita alojar sus nombres más adelante.

 */
package Guia5Java;

import java.util.Scanner;
public class ejemplo13guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos companieros son en el grupo");
        int n = leer.nextInt();
        String[] equipo = new String[n];
        for(int i=0;i<equipo.length;i++){
            System.out.println("Ingrese el nombre del companiero");
            equipo[i]=leer.next();
        }
        for(int i=0;i<equipo.length;i++){
            System.out.print(equipo[i]+" ");
        }
    }
    
}

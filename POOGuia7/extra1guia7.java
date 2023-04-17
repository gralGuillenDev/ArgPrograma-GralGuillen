/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOGuia7;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra1guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion play1 = new Cancion("Me Porto Bonito", "Bad Bunny");
        Cancion play2 = new Cancion();
        Cancion play3 = new Cancion();
        Cancion play4 = new Cancion();
        Cancion play5 = new Cancion();
        Cancion play6 = new Cancion();
        infoCancion(play2);
        
        System.out.println("titilo de cancion play2 "+play2.getTitulo());
        
        
    }
    public static void infoCancion(Cancion x){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion "+ x);
        x.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion "+ x);
        x.setAutor(leer.nextLine());
    }
    
}

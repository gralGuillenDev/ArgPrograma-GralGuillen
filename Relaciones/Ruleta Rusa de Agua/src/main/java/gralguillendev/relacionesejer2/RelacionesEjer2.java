package gralguillendev.relacionesejer2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Pistola;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class RelacionesEjer2 {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner leer = new Scanner(System.in);
        Juego newJuego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Pistola revolver = new Pistola();
        int c;
        do{
        System.out.println("Ingrese el numero de Jugadores? Max 6");
        c = leer.nextInt();
        }while(c<1 || c>6);
        int id = 1;
        for(int i=0;i<c;i++){
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = leer.next();
            jugadores.add(new Jugador(id,nombre,false));
            id++;
        }
        do{
            revolver.llenarRevolver();
            newJuego.llenarJuego(jugadores,revolver);
            System.out.println(revolver);
            newJuego.ronda();
            System.out.println("Desea Jugar otra ronda? S/N");
        }while(leer.next().equalsIgnoreCase("S"));
        
    }
}

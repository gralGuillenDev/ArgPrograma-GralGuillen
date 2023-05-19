
package gralguillendev.relacioneejer3;

import Servicios.BarajaService;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class RelacioneEjer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BarajaService ser = new BarajaService();
        int opcion;
        System.out.println("Ingresar la cantidad de Jugadores");
        int jogo = leer.nextInt();
        ser.crearJugadores(jogo);
        do{
            System.out.println("Juego de Cartas EGG");
            System.out.println("");
            System.out.println("Menu de Opciones");
            System.out.println("1. Crear Baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Mostrar Siguiente Carta");
            System.out.println("4. Mostrar Cartas disponibles para repartir");
            System.out.println("5. Repartir Cartas");
            System.out.println("6. Mostrar las cartas que ya salieron");
            System.out.println("7. Mostrar Baraja actual");
            System.out.println("8. Mostrar mano de jugadores");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ser.crearBaraja();
                    break;
                case 2:
                    ser.barajar();
                    break;
                case 3:
                    ser.siguienteCarta();
                    break;
                case 4:
                    ser.cartasDisponibles();
                    break;
                case 5:
                    ser.darCartas();
                    break;
                case 6:
                    ser.cartasMonton();
                    break;
                case 7:
                    ser.mostrarBaraja();
                    break;
                case 8: 
                    ser.mostrarManos();
                    break;
            }
            System.out.println("Seguir turno? S/N");
        } while (leer.next().equalsIgnoreCase("S"));
        
    }
}

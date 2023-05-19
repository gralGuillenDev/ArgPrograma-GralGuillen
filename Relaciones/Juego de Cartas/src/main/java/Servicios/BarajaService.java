
package Servicios;

import Comparadores.OrdenarBaraja;
import Entidad.Carta;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class BarajaService {
    
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> baraja = new ArrayList<>();
    private ArrayList<Carta> salidas = new ArrayList<>();
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    
    public void crearBaraja(){
        String []palos = {"Espada","Basto","Oro","Copa"};
        for(int i=0;i<4;i++){
            for(int j=1;j<=12;j++){
                if(j!=8 && j!=9){
                    baraja.add(new Carta((j), palos[i]));   
                }
            }
        }
        Collections.sort(baraja, OrdenarBaraja.ordenarBaraja);
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
        Collections.shuffle(baraja);
        Collections.shuffle(baraja);
    }
    
    public void siguienteCarta(){ //error
        if(baraja.isEmpty()){
            System.out.println("No hay mas cartas");
        }else{
            for(Carta carta : baraja){
                System.out.println(carta);
                salidas.add(carta);
                baraja.remove(carta);
                break;
            }
        }
        
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+baraja.size());
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas quiere?");
        int cant = leer.nextInt();
        for(int p=0;p<jugadores.size();p++){
            String jogador = jugadores.get(p).getNombre();
            Iterator<Carta> it = baraja.iterator();
            for (Jugador jug : jugadores) {
                if(jug.getNombre().equalsIgnoreCase(jogador)){
                    if(baraja.size()>=cant){
                        System.out.println("Mano de "+jogador);
                        for(int i=0;i<cant;i++){
                            if(it.hasNext()){
                                jug.getMano().add(it.next());
                                System.out.println(it.next());
                                it.remove();
                            }
                        }
                        System.out.println("");
                    }else{
                        System.out.println("No alcanzan las cartas disponibles, no le dimos ninguna carta");
                    }
                }
            }
        }
    }
       
    public void cartasMonton(){ //error
        if(salidas.isEmpty()){
            System.out.println("No salio ninguna carta");
        }else{
            for (Carta aux : salidas) {
                System.out.println(aux);
            }
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println("Numero: ["+carta.getNumero()+"] Palo: ["+carta.getPalo()+"]");
        }
    }
    
    public void crearJugadores(int num){
        for(int i=0;i<num;i++){
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = leer.next();
            jugadores.add(new Jugador(nombre, null));
        }
    }
    
    public void mostrarManos(){
        for (Jugador mano : jugadores) {
            System.out.println(mano);
        }
    }   
}


package Entidades;


import java.util.ArrayList;

/**
 * @author gralguillen
 */
public class Juego {
 
    private ArrayList<Jugador> jugadores;
    private Pistola pistola;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Pistola pistola) {
        this.jugadores = new ArrayList<>();
        this.pistola = pistola;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Pistola getPistola() {
        return pistola;
    }

    public void setPistola(Pistola pistola) {
        this.pistola = pistola;
    }
    
    public void llenarJuego(ArrayList<Jugador>jug, Pistola r){
        this.jugadores = jug;
        this.pistola= r ;
    }
    
    public void ronda() throws InterruptedException{  // throws InterruptedException es solo para usar los sleep : Thread.sleep(1000);
        boolean fin=true;
        while(fin){
            for (Jugador jug : jugadores) {
                System.out.println("Turno de "+jug.getNombre());
                Thread.sleep(1000);
                if(jug.disparo(pistola)){
                   Thread.sleep(2000);
                    System.out.println(jug.getNombre()+" SE MURIO DE UN TIRO Y PERDIO");
                    System.out.println(jug);
                    fin = false;
                    break;
                }
                Thread.sleep(2000);
                System.out.println("SAFASTE");
            }
        }        
    }
}

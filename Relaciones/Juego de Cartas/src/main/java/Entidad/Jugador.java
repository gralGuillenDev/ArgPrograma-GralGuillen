
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author gralguillen
 */
public class Jugador {
    
    private String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre, ArrayList<Carta> mano) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador: " + "Nombre [" + nombre + 
                "], Mano [" + mano + "]";
    }

}

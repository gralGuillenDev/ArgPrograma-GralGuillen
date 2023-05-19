
package Entidades;

/**
 * @author gralguillen
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Pistola r){
        if(r.mojar()){
            this.mojado = true;
            return true;
        }
        r.siguienteChorro();
        return false;
    }

    @Override
    public String toString() {
        return "Datos del Perdedor: " + "Jugador " + id +" - "+ nombre + ", mojado: " + mojado;
    } 
}

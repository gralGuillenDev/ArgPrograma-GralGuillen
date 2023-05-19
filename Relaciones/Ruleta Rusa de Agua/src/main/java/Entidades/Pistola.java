
package Entidades;

/**
 * @author gralguillen
 */
public class Pistola {
    
    private int posicionActual;
    private int posicionAgua;

    public Pistola() {
    }

    public Pistola(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){

        posicionActual = (int)(Math.random()*(6)+1);
        posicionAgua = (int)(Math.random()*(6)+1);
    }
    
    public boolean mojar(){
         return posicionActual==posicionAgua;
    }
    
    public void siguienteChorro(){
        
        posicionActual++;
        if(posicionActual==7){
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Datos de la Pistola: " + "Posicion Actual: [" + posicionActual + "], Posicion Agua: [" + posicionAgua+"]" ;
    }
}

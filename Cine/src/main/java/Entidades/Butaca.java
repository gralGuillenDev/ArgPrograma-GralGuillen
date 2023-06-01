
package Entidades;

/**
 * @author gralguillen
 */
public class Butaca {
    
    
    private boolean ocupado = false;
    public char simbolo;
    public String id;
    private Espectador persona;
    
    public Butaca() {
    }

    public Butaca(String id, boolean ocupado) {

        this.id = id;
        this.ocupado = ocupado;
    }


    public Espectador getPersona() {
        return persona;
    }

    public void setPersona(Espectador persona) {
        this.persona = persona;
    }
    
    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
   

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        if(ocupado){
            simbolo = 'X';
        }else{
            simbolo = 'O';
        }
        return "["+ id + simbolo +" "+ persona +']';
    }

    
    
    
    
}

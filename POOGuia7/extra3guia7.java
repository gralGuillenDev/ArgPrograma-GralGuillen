
package POOGuia7;

import IGU.IUdelJuego;
import entidad.Juego;


public class extra3guia7 {

    public static void main(String[] args) {
        Juego partida1 = new Juego();
        
        IUdelJuego jogo = new IUdelJuego();
        jogo.setVisible(true);
        jogo.setLocationRelativeTo(null);
        partida1.iniciar_juego();
    }
    
}

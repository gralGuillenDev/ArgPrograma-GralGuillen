
package Enumeraciones;

import java.util.Random;

public enum Nombres {
    Pedro,Juan,Ruth,Milena,Sol,Miguel,Lionel,Franco,Laura,Sofia;
    
    
    private static final Random PRNG = new Random();

    public static Nombres randomNombre()  {
        Nombres[] x = values();
        return x[PRNG.nextInt(x.length)];
    }
}
    


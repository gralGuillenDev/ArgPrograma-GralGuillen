
package Servicios;

import Entidad.Libro;
import java.util.HashSet;

/**
 * @author gralguillen
 */
public class LibroService {
    
    public boolean prestamo(Libro lib){
        if(lib.getEjemplares()>0){
            lib.setEjemplaresPrestados(lib.getEjemplaresPrestados()+1);
            lib.setEjemplares(lib.getEjemplares()-1);
            return true;
        } 
        return false;
    }
    
    public void devolucion(Libro lib){
        lib.setEjemplaresPrestados(lib.getEjemplaresPrestados()-1);
        lib.setEjemplares(lib.getEjemplares()+1);
    }
    
    public void mostrarLibrosDisponibles(HashSet<Libro> libreria){
        for (Libro aux : libreria) {
            System.out.println(aux);
        }
    }

}

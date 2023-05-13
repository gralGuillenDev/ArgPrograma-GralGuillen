
package gralguillendev.colextra3;

import Entidad.Libro;
import Servicios.LibroService;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class ColExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroService ser = new LibroService();
        HashSet<Libro> conjunto = new HashSet<>();
        
        do{
            Libro libro = new Libro();
            System.out.println("Ingrese el Titulo");
            libro.setTitulo(leer.next());
            System.out.println("Ingrese el Autor");
            libro.setAutor(leer.next());
            System.out.println("Cuantos ejemplares tiene?");
            libro.setEjemplares(leer.nextInt());
            libro.setEjemplaresPrestados(0);
            conjunto.add(libro);
            System.out.println("Decea guardar otro libro? S/N");
        }while(leer.next().equalsIgnoreCase("S"));
        
        do {
            System.out.println("Menu de Libreria");
            System.out.println("1. Prestarse Libro");
            System.out.println("2. Devolver Libro");
            System.out.println("3. Ver Libros Disponibles");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que libro queres prestarte?");
                    String librito = leer.next();
                    for (Libro aux : conjunto) {
                        if(aux.getTitulo().equalsIgnoreCase(librito)){
                           if(ser.prestamo(aux)){
                               System.out.println("Prestamo Exitoso");
                           }else{
                                System.out.println("No hay ejemplares disponibles");
                           }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Que libro queress devolver?");
                    String librito2 = leer.next();
                    for (Libro aux2 : conjunto) {
                        if(aux2.getTitulo().equalsIgnoreCase(librito2)){
                            ser.devolucion(aux2);
                        }
                    }
                    break;
                case 3:
                    ser.mostrarLibrosDisponibles(conjunto);
                    break;
            }
            System.out.println("Quiere realizar otra operacion? S/N");
        } while (leer.next().equalsIgnoreCase("S"));   
    }
}

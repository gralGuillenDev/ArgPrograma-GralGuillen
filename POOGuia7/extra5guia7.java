/*
Crea una clase "Empleado" que tenga atributos como
"nombre", "edad" y "salario". Luego, crea un método 
"calcular_aumento" que calcule el aumento salarial 
de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años
 */
package POOGuia7;

import entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra5guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        Empleado pepito = new Empleado();
        System.out.println("Cual es su nombre?");
        pepito.setNombre(leer.nextLine());
        System.out.println("Cuantos anios tiene");
        pepito.setEdad(leer.nextInt());
        System.out.println("Cuanto es su salario");
        pepito.setSalario(leer.nextDouble());
        pepito.calcularAumento();
        
    }
    
}

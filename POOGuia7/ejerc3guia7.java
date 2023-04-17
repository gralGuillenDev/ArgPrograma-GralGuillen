package POOGuia7;

import entidad.Operacion;
import java.util.Scanner;

public class ejerc3guia7 {

    public static void main(String[] args) {
        int opcion;
        boolean flag = false;
        Scanner leer = new Scanner(System.in);
        Operacion one = new Operacion();
        
        do{
        System.out.println("Bienvenidos a Operaciones Aritmeticas en POO");
        System.out.println("Escoja la opcion");
        System.out.println("1.Ingresar Numero");
        System.out.println("2.Sumar numeros");
        System.out.println("3.Restar numeros");
        System.out.println("4.Multiplicar numeros");
        System.out.println("5.Dividir numeros");
        System.out.println("6.Salir");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                one.crearOperacion();
                break;
            case 2:
                int suma = one.sumar();
                System.out.println("La Suma es "+ suma);
                break;
            case 3:
                int resta = one.restar();
                System.out.println("La Resta es "+ resta);
                break;
            case 4:
                int multi = one.multiplicar();
                System.out.println("La Multiplicacion es "+ multi);
                break;
            case 5:
                int div = one.dividir();
                System.out.println("La Division es "+ div);
                break;
            case 6:
                flag = true;
        }
        }while(flag==false);
        
    }
}

/*
Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio6e3 {
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    int a;
    int b;
    int opcion = 0;
    boolean flag = false;
    System.out.println("Ingrese el valor de A");
    a = scan.nextInt();
    System.out.println("Ingrese el valor de B");
    b = scan.nextInt();
        do{
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opcion:");
        opcion = scan.nextInt();
            switch(opcion){
                case 1 :
                System.out.println("La suma es "+ (a+b));
                break;
                case 2: 
                System.out.println("La resta es "+ (a-b));
                break;
                case 3:
                System.out.println("El producto es "+ (a*b));
                break;
                case 4:
                System.out.println("La Division da "+ (a/b));
                break;
                case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?"); 
                    if (scan.next().equalsIgnoreCase("s")){
                    flag = true;
                    break;
                    }
            }
        }while(flag==false);
    }               
}

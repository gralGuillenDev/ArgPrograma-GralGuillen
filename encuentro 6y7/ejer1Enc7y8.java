/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. 

 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;

public class ejer1Enc7y8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Operaciones Aritmeticas");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(Suma(num1, num2));
                break;
            case 2:
                System.out.println(Resta(num1, num2));
                break;
            case 3:
                System.out.println(Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(Division(num1, num2));
                break;
        }
    }

    public static int Suma(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int Resta(int a, int b) {
        int res = a - b;
        return res;
    }

    public static int Multiplicacion(int a, int b) {
        int res = a * b;
        return res;
    }

    private static int Division(int a, int b) {
        int res = a / b;
        return res;
    }
}

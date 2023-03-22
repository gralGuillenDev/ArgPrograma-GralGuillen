/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
de números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package gralguillendev.introjavaap;
import java.util.Scanner;
// @author gralguillen
public class extra8g3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=1;
        int cont=0;
        int par=0;
        int inpar=0;
        while(num>0){
            System.out.println("Ingrese un numero entero");
            num=leer.nextInt();
            if(num%5==0){
            break;
            }
            if(num%2==0){
                par++;
            }else if(num%2!=0){
                inpar++;
            }
            cont++;  
        }
        System.out.println("La cantidad de numeros ingresados es: "+cont);
        System.out.println("La cantidad de numeros pares ingresados es: "+par);
        System.out.println("La cantidad de numeros inpares ingresados es: "+inpar);
    }
}

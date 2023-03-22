/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
tome el valor de B. Mostrar los valores iniciales y los valores finales de
cada variable. Utilizar sólo una variable auxiliar.

 */
package gralguillendev.introjavaap;

public class extra2g3 {

    
    public static void main(String[] args) {
       int A,B,C,D,aux;
        
        A= (int) (Math.random()*(10+1));
        B= (int) (Math.random()*(10+1));
        C= (int) (Math.random()*(10+1));
        D= (int) (Math.random()*(10+1));
        
        System.out.println("Valores iniciales");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = B;
        
        System.out.println("Nuevos valores");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);  
    }
}

/*
 Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package Guia5Java;

/**
 *
 * @author gralguillen
 */
public class ejer3guia5 {
    public static void main(String[] args) {
        int un=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int[] vector = new int[100];
        for (int i = 0; i<100;i++){
            vector[i]= (int)(Math.random()*10000+1);
        }
        for (int i = 0; i<100;i++){
            System.out.println(vector[i]);
        }
         for (int i = 0; i<100;i++){
             switch(contadorDigitos(vector[i])){
                 case 1:
                     un++;
                     break;
                 case 2:
                     dos++;
                     break;
                 case 3:
                     tres++;
                     break;
                 case 4:
                     cuatro++;
                     break;
                 case 5:
                     cinco++;
                     break;
             }
        }
        System.out.println("Contabilizacion");
        System.out.println("Numeros de 1 digito: "+un);
        System.out.println("Numeros de 2 digitos: "+dos);
        System.out.println("Numeros de 3 digitos "+tres);
        System.out.println("Numeros de 4 digitos " +cuatro);
        System.out.println("NUmeros de 5 digitos "+cinco);
         
    }
    
    public static int contadorDigitos(int a){
        int cont = 0;
        while(a>0){
            a=a/10;
            cont++;
        }
        return cont;
    }
}

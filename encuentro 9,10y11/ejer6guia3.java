/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
son idénticas. Crear un programa que permita introducir un cuadrado 
por teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir
, están entre el 1 y el 9.

 */
package Guia5Java;

import java.util.Scanner;

public class ejer6guia3 {

    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        LlenarMatriz(matriz);
        MostrarMatriz(matriz);
        EsMagico(matriz);
    }
    
    public static void LlenarMatriz(int[][] cubo){
        Scanner leer = new Scanner(System.in);
        int num;
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                do{
                    System.out.println("Ingrese un numero del 1 al 9, para la posicion Matriz"+"["+i+"] ["+j+"]");
                    num = leer.nextInt();
                    if(num<0 || num>10){
                    System.out.println("Incorrecto");
                    }
                }while(num<0 || num>10);
                cubo[i][j]=num;
            }
        }
    }
    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
    }
    public static int SumaFilas(int[][] a){
        int res;
        
        int [] sumaF = new int [3];
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                sumaF[i] += a[i][j];
            }
        }
        if(SonIguales(sumaF,3)){
           res=sumaF[0];
           return res;
       }else{
           res=0;
       }
       return res;
    }
    public static int SumaColumnas(int[][] a){
        int res;
        int [] sumaC = new int [3];
        for(int j= 0;j<3;j++){
            for(int i=0;i<3;i++){
                sumaC[j] += a[i][j];
            }
        }
        if(SonIguales(sumaC,3)){
           res=sumaC[0];
           return res;
       }else{
           res=0;
       }
       return res;
    }
    public static int SumaDiagonales(int[][] a){
        int res = 0;
        int [] sumaD = new int [2];
        //Diagonal
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                sumaD[0] += a[i][j];
                }
            }
        } //Diagonal Invertida
        for(int i=0;i<3;i++){
            for(int j=3-1;j>0-1;j--){
                if(j==2-i){
                sumaD[1] += a[i][j];
                }
            }
        }
        
       if(SonIguales(sumaD,2)){
           res=sumaD[0];
           return res;
       }else{
           res=0;
       }
       return res;
    }
    public static void EsMagico(int[][] a){
        
        
        
        if(SumaFilas(a)==SumaColumnas(a)){
            if(SumaColumnas(a)==SumaDiagonales(a)){
                System.out.println("Es un Cuadrado Magico");
            }else{
                System.out.println("No es un Cuadrado Magico");
            }
        }else{
            System.out.println("No es un Cuadrado Magico");
        }
    }
    public static boolean SonIguales(int[] sumas,int n){
    boolean conf=false;
        for(int i=0;i<=n-1;i++){
            if (sumas[i]==sumas[n-1-i]){
                conf=true;
            }else{ conf=false;}
        }
    return conf;
    }
}

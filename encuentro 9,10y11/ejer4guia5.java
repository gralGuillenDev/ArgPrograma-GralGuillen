/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package Guia5Java;

public class ejer4guia5 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        RellenarMatriz(matriz,4);
        System.out.println("Matriz Original");
        MostrarMatriz(matriz);
        System.out.println("Matriz Traspuesta");
        Traspuestacion(matriz);
        }
    public static void RellenarMatriz(int[][] matriz,int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=(int)(Math.random()*10+1);
            }
        }
    }
    public static void MostrarMatriz(int[][] matriz) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("[ " +matriz[i][j]+ " ]");
            }
            System.out.println("");
        }
    }
    public static void Traspuestacion(int[][] matriz){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("[ " +matriz[j][i]+ " ]");
            }
            System.out.println("");
        }
    }    
}

    
    
    
    


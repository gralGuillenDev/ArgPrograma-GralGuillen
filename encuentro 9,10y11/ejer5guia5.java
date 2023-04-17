/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
si A = -AT. La matriz traspuesta de una matriz A se denota por AT 
y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package Guia5Java;

public class ejer5guia5 {

    public static void main(String[] args) {
        int[][] matrizA = {{0, -2, 4},
        {2, 0, 2},
        {-4, -2, 0}};
        System.out.println("Matriz Original");
        MostrarMatriz(matrizA);
        int[][] matrizB = new int[3][3];
        System.out.println("Matriz Traspuesta");
        Traspuestacion(matrizA, matrizB);
        MostrarMatriz(matrizB);
        System.out.println(verificarAntisimetrica(matrizA, matrizB));
        if(verificarAntisimetrica(matrizA, matrizB)){
            System.out.println("Es Antisimetrica");
        }else{
            System.out.println("No es Antisimetrica");
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

    public static void Traspuestacion(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz2 [i][j]= matriz1[j][i];
            }
        }
    }

    public static boolean verificarAntisimetrica(int[][] matriz1, int[][] matriz2) {
        int cont = 0;
        boolean flag = false;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if ((matriz1[i][j]) == -(matriz2[i][j])) {
                    flag = true;
                } else {
                    flag = false;
                    cont++;
                }
                if (cont == 1) {
                    break;
                }
            }
            if (cont == 1) {
                return flag;
            }   
        }
        return flag;
    }
}

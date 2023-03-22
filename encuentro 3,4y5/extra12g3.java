/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 
3 lo sustituya por una E. Ejemplo:
 */
package gralguillendev.introjavaap;

public class extra12g3 {

    public static void main(String[] args) {
        String C, D, U;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    C = Integer.toString(i);
                    D = Integer.toString(j);
                    U = Integer.toString(k);
                    if (C.equals("3")) {
                        C = "E";
                    }
                    if (D.equals("3")) {
                        D = "E";
                    }
                    if (U.equals("3")) {
                        U = "E";
                    }
                    System.out.println(C + "-" + D + "-" + U);
                }
            }

        }
    }

}

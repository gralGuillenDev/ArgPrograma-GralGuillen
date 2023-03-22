
package gralguillendev.introjavaap;

import java.util.Scanner;

public class ejercicio7Guia3 {

    public static void main(String[] args) {
       int correct = 0;
    int incorrect = 0;
    String FDE = "&&&&&";
    String prueba;
    Scanner leer = new Scanner(System.in);
    
            System.out.println("Bienvenido al dispositivo RS232");
            do{
                System.out.println("Ingrese sus cadenas");
                prueba = leer.nextLine();  
                if(prueba.equals(FDE)){
                    break;
                }
                    if(prueba.length()==5){
                        if(prueba.substring(0,1 ).equalsIgnoreCase("x")){
                            if(prueba.substring(4,5 ).equals("0")){
                                correct=correct+1;  
                            }else{
                                incorrect=incorrect+1;
                            }
                        }else{
                            incorrect=incorrect+1;
                        }
                    }else{
                        incorrect=incorrect+1;
                    }
            }while(!prueba.equals(FDE));
            System.out.println("Informe de dispositivo RS232");
            System.out.println("Ingresos totales: "+(correct+incorrect));
            System.out.println("Correctos: "+correct);
            System.out.println("Incorrectos: "+incorrect);
    }
    
}

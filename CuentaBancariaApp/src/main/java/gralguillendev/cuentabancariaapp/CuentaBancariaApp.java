
package gralguillendev.cuentabancariaapp;

import Entidad.CuentaBancaria;
import gralguillendev.cuentabancariaapp.cuentaBancariaService.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class CuentaBancariaApp {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner leer = new Scanner(System.in);
        CuentaBancariaService nuevaCuenta = new CuentaBancariaService();
        System.out.println("Bienvenido a nuestro Banco desea aperturar una Cuenta? S/N");
        if (leer.next().equalsIgnoreCase("S")) {
            CuentaBancaria c1 = nuevaCuenta.crearCuenta();
            System.out.println("Desea ingresar a la Plaraforma Virtual? S/N");
            if (leer.next().equalsIgnoreCase("S")) {
                while (salir==false) {
                    System.out.println("Bienvenido a la Plataforma Virtual, acontinuacion se desplegara un Menu de Servicios disponibles");
                    int menu;
                    System.out.println("1. Ingresar");
                    System.out.println("2. Retirar");
                    System.out.println("3. Extraccion Rapida");
                    System.out.println("4. Consultar Saldo");
                    System.out.println("5. Consultar Datos de Cuenta");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1 ->{
                            System.out.println("Ingrese el monto que desea depositar en su cuenta");
                            double nuevoIngreso = leer.nextDouble();
                            nuevaCuenta.ingresar(nuevoIngreso, c1);}
                        case 2 ->{
                            System.out.println("Ingrese la cantidad de dinero que desea retirar");
                            double retiro =  leer.nextInt();
                            nuevaCuenta.retirar(retiro,c1);}
                        case 3 ->
                            nuevaCuenta.extraccionRapida(c1);
                        case 4 ->
                            nuevaCuenta.consultarSaldo(c1);
                        case 5 ->
                            //c1.toString();
                            nuevaCuenta.consultarDatos(c1);
                    }
                    System.out.println("Desea realizar otro Servicio? S/N");
                    if (leer.next().equalsIgnoreCase("N")) {
                        salir=true;
                    }
                }
            }
        }
    }
    
    
}

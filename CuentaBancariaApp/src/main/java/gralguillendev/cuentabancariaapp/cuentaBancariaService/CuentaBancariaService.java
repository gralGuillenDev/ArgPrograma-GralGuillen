
package gralguillendev.cuentabancariaapp.cuentaBancariaService;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class CuentaBancariaService {
    
    private Scanner leer = new Scanner(System.in);
    //CuentaBancaria cuenta = new CuentaBancaria();
    public CuentaBancaria crearCuenta(){
        System.out.println("Bienvenido al Banco Java, acontinuacion crearemos una cuenta para usted:");
        System.out.println("Ingrese su nombre");
        String name = leer.nextLine();
        System.out.println("Ingrese su numero de DNI");
        long Document =  leer.nextInt();
        System.out.println("Ingrese su saldo de apertura");
        int saldoInicial = leer.nextInt();
        System.out.println("Hemos creado exitosamente su cuenta");
        int numCuenta = (int)(Math.random()*9999);
        System.out.println("Sr/a: "+name+" su numero de cuenta es: "+numCuenta);
    return new CuentaBancaria(name, numCuenta,Document,saldoInicial);
    }
    
    public void ingresar(double dinero, CuentaBancaria cuenta){
        //System.out.println("Ingrese el monto que desea depositar en su cuenta");
        //double nuevoIngreso = leer.nextDouble();
        cuenta.setSaldoTotal(cuenta.getSaldoTotal()+dinero);
        System.out.println("Deposito exitoso");
        
    }
    
    public void retirar(double retiro, CuentaBancaria cuenta){
       // System.out.println("Ingrese la cantidad de dinero que desea retirar");
        //double retiro =  leer.nextInt();
        if(retiro>cuenta.getSaldoTotal()){
            System.out.println("No cuenta con saldo suficiente");
            System.out.println("Usted tiene un saldo de " + cuenta.getSaldoTotal());
            System.out.println("Desea retirar todo? S/N");
            if(leer.next().equalsIgnoreCase("s")){
                cuenta.setSaldoTotal(0);
                System.out.println("Retiro Exitoso, su saldo esta en 0.");
            }
        }else{
            cuenta.setSaldoTotal(cuenta.getSaldoTotal()-retiro);
            System.out.println("Retiro Exitoso");
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double retRap = cuenta.getSaldoTotal()*0.20;
        System.out.println("La extraccion rapida le permite retirar el 20% de su saldo");
        System.out.println("Acepta retirar "+ retRap+ " ? S/N" );
        if(leer.next().equalsIgnoreCase("s")){
            cuenta.setSaldoTotal(cuenta.getSaldoTotal()-retRap);
            System.out.println("Retiro Exitoso");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es "+cuenta.getSaldoTotal());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println("Nombre de titular: "+ cuenta.getNombrePersona());
        System.out.println("Numero de cuenta: "+ cuenta.getNumeroCuenta());
        System.out.println("DNI de titular: "+ cuenta.getDniCliente());
        System.out.println("Saldo total en cuenta: "+ cuenta.getSaldoTotal());
    }
    
}

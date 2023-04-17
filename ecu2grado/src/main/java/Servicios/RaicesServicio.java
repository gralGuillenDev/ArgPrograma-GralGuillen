/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class RaicesServicio {
    private Scanner leer = new Scanner(System.in);
    public Raices crearEcuacion(){
        System.out.println("Ingrese el valor del coeficiente A");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor del coeficiente B");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor del coeficiente C");
        int c = leer.nextInt();
        return new Raices(a,b,c);
    }
    
    public double getDiscriminante(Raices tri){
        return (Math.pow(tri.getLadoB(),2))-4*tri.getLadoA()*tri.getLadoC(); 
    }
    
    public boolean tieneRaices(Raices tri){
        return (getDiscriminante(tri)>=0);
    }
    
    public boolean tieneRaiz(Raices tri){
        return (getDiscriminante(tri)==0);
    }
    
    public void obtenerRaices(Raices tri){
        double raiz1 = (-tri.getLadoB()+ Math.sqrt(Math.pow(tri.getLadoB(), 2)-4*tri.getLadoA()*tri.getLadoC()))/(2*tri.getLadoA());
        double raiz2 = (-tri.getLadoB()- Math.sqrt(Math.pow(tri.getLadoB(), 2)-4*tri.getLadoA()*tri.getLadoC()))/(2*tri.getLadoA());
        System.out.println( "x1 = "+raiz1);
        System.out.println("x2 = "+raiz2);
    }
    
    public void obtenerRaiz(Raices tri){
        double raiz1 = (-tri.getLadoB()+ Math.sqrt(Math.pow(tri.getLadoB(), 2)-4*tri.getLadoA()*tri.getLadoC()))/(2*tri.getLadoA());
        System.out.println( "x = "+raiz1);
    }
    
    public void calcular(Raices tri){
        if(tieneRaices(tri)){
            obtenerRaices(tri);
        }else if(tieneRaiz(tri)){
            obtenerRaiz(tri);    
        }
    }
    
}


package Entidades;

import java.util.Scanner;

/**
 * @author gralguillen
 */
public class Televisor extends Electrodomestico {
    private Scanner leer = new Scanner(System.in);
    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;
    //Constructores
    public Televisor() {
    }
    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //Getters & Setters
    public int getResolucion() {
        return resolucion;
    }
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //Metodos
    public Televisor crearTelevisor(){
        boolean tdt;
        System.out.println("Ingresa la resolucion en pulgadas");
        int pulg = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? S/N");
        if(leer.next().equalsIgnoreCase("S")){
            tdt = true;
        }else{
            tdt = false;
        }
        Televisor tv = new Televisor(pulg,tdt);
        crearElectrodomestico(tv);
        return tv;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion>40){
            precio+=(precio*0.3);
        }
        if(sintonizadorTDT){
            precio+=500;
        }
    }
    @Override
    public String toString() {
        return "Televisor {" + "precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + " Resolucion= "+ resolucion + " sintonizador digital= "+ sintonizadorTDT+'}';
    }
    
}

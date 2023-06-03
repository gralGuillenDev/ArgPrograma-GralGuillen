
package Entidades;

import java.util.Scanner;

/**
 * @author gralguillen
 */
public class Lavadora extends Electrodomestico {
    private Scanner leer = new Scanner(System.in);
    //Atributo
    private int carga;
    //Constructores
    public Lavadora() {
    }
    public Lavadora(int carga) {
        this.carga = carga;
    }
    public Lavadora(int carga, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //Getters & Setters
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    //Metodos
    public Lavadora crearLavadora(){
        System.out.println("Ingresa la Capacidad de Carga");
        int cap = leer.nextInt();
        Lavadora l = new Lavadora(cap);
        crearElectrodomestico(l);
        return l;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga>30){
            precio+=500;
        }
    }
    
    
    @Override
    public String toString() {
        return "Lavadora {" + "precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + " Carga= " +carga +'}';
    }
    
}

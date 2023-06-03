
package Entidades;

import Enumeraciones.Colores;
import Enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class Electrodomestico {
    //Atributos
    protected double precio = 1000;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;
    //Constructores
    public Electrodomestico() {
    }
    public Electrodomestico(double precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //Getters & Setters
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    //Metodos privados
    private String comprobarConsumoEnergetico(String letra){
        ConsumoEnergetico[] ls = ConsumoEnergetico.values();
        for (ConsumoEnergetico aux : ls) {
            if(letra.equalsIgnoreCase(aux.name())){
                return letra;
            }
        }       
        return "F";
    }
    private String comprobarColor(String color){
        Colores[] co = Colores.values();
            for (Colores aux : co) {
                if(color.equalsIgnoreCase(aux.name())){
                    return color;
                }
            }
             return "Blanco";
    }
    //Metodos
    public void crearElectrodomestico(Electrodomestico a){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el Color");
        String colores = comprobarColor(leer.next());
        System.out.println("Ingresa el Consumo Energetico");
        String cE = comprobarConsumoEnergetico(leer.next().toUpperCase());
        System.out.println("Ingresa el Peso");
        int pes = leer.nextInt();
        a.setColor(colores);
        a.setConsumoEnergetico(cE);
        a.setPeso(pes);
        a.setPrecio(1000);
    }
    public void precioFinal(){
        switch(consumoEnergetico){
            case "A" -> precio+=1000;
            case "B" -> precio+=800;
            case "C" -> precio+=600;
            case "D" -> precio+=500;
            case "E" -> precio+=300;
            case "F" -> precio+=100;
        }
        if(peso<=19){
            precio+=100;
        }else if(peso>=2 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
            precio+=800;
        }else if(peso>=80){
            precio+=1000;
        }
    }
}

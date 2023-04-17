/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOGuia7;

import entidad.Rectangulo;

/**
 *
 * @author gralguillen
 */
public class ejer4guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectito = new Rectangulo();
        rectito.crearRectangulo();
        int per = rectito.calcularPerimetro(rectito.getBase(),rectito.getAltura());
        System.out.println("El Perimetro es: "+per);
        int sup = rectito.calcularSuperficie(rectito.getBase(),rectito.getAltura());
        System.out.println("La Superficie es: "+sup);
        rectito.dibujarRectangulo(rectito.getBase(),rectito.getAltura());
    }
    
}

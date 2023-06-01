
package Entidades;

import Enumeraciones.Columnas;
import Enumeraciones.Nombres;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author gralguillen
 */
public class Cine {
    
    private Pelicula pelicula;
    //Creo una Matriz de Butacas
    private ArrayList<ArrayList<Butaca>> sala = new ArrayList<>();
    private double precio = 18;

    //Aqui se guarda la gente
    ArrayList<Espectador> gente = new ArrayList<>();
    //Creo un objeto random
    Random rdm = new Random();
    //Constructores
    public Cine() {
    }
    public Cine(Pelicula pelicula, ArrayList<ArrayList<Butaca>> sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }
    
    //Getters & Setters
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<ArrayList<Butaca>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Butaca>> sala) {
        this.sala = sala;
    }

    public double isPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    //Metodos
    //Creo una Pelicula
    public void crearPelicula(){
        String peli = "Guardianes de la Galaxia Vol.3";
        String director = "James Gunn";
        int duracion = 149;
        int edadMin = 17;
        this.pelicula = new Pelicula(peli,director,duracion,edadMin);
    }
    //Creo una Matriz de Butacas, una sala de Cine
    public void crearSala(){
        for(int i=8;i>=1;i--){
            ArrayList<Butaca> fila = new ArrayList<>();
            for(Columnas j : Columnas.values()){
                String id = (i+j.name());
                fila.add(new Butaca(id,false));
            }
            sala.add(fila);
        }
    }
   
    //Muestro la Sala segun lo pedia la consigna
    public void mostrarAsientosSala(){
    for (ArrayList<Butaca> aux : sala) {
            System.out.println(aux);
        }
    
    }
    
    //Metodo para ver quien se sento en una silla X
    public void buscarAsiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Que butaca quiere averiguar quien la ocupa fila y columna");
        int fil = leer.nextInt();
        //Como la consigna esta invertida, tengo que intercambiar las coordenadas para ubicarme correctamente en la matriz
        switch(fil){
                    case 1 -> fil = 7;
                    case 2 -> fil = 6;
                    case 3 -> fil = 5;
                    case 4 -> fil = 4;
                    case 5 -> fil = 3;
                    case 6 -> fil = 2;
                    case 7 -> fil = 1;
                    case 8 -> fil = 0;
                }
        String co = leer.next();
        //Leo las Columna que son Letras y las convierto a su index numerico y lo alojo en la variable colum
        int colum = 0;
        switch(co){
                    case "a","A" -> colum = 0;
                    case "b","B" -> colum = 1;
                    case "c","C" -> colum = 2;
                    case "d","D" -> colum = 3;
                    case "e","E" -> colum = 4;
                    case "f","F" -> colum = 5;
        }
        //Traigo la sala con ambos index Sala[fila][columna] y luego a la Persona
        System.out.println(sala.get(fil).get(colum).getPersona().getNombre());
        System.out.println(" ");
        System.out.println(sala.get(fil).get(colum));
    }
                
    public boolean verificarAsiento(String ide){
        //Verifico si una butaca esta ocupada retornara un true si esta ocupada y false sino
        for(int i=8;i>0;i--){
            for(int j=0;j<6;j++){
                    if(sala.get(i-1).get(j).getId().equals(ide)){
                        if(sala.get(i-1).get(j).isOcupado()){
                            return false;
                        }
                    }
                } 
        }
        return true;
    }
       
     public boolean verificarEspectador(Espectador p){
         //verificamos si cuenta con el dinero y la edad necesaria para ver la pelicula
         if(p.getDinero()>=precio){
             if(p.getEdad()>=pelicula.getEdadMin()){
                 return true;
             }
         }
     return false;
     }
    
    public void generarEspectadores(){
        //genero una cantidad de Espectadores random
        int usuarios = rdm.nextInt(48);
        //Creo Espectadores con un nombre y efectivo random la cantidad de veces que salio arriba
        for(int i=0;i<usuarios;i++){
            String name = Nombres.randomNombre().name();
            int edad = rdm.nextInt(9,50);
            //int edad = ((int)(Math.random()*50+1));
            double money = rdm.nextDouble(10,50);
            gente.add(new Espectador(name,edad,money));
        }
        System.out.println(gente.size());
    }
    
    public void imprimirEspectadores(){
        for (Espectador es : gente) {
            System.out.println(es);
        }  
    }
    //Ponemos a Sentar a los Espectadores solo si tienen dinero y edad necesarios
    public void ubicarEspectadores(){
        
        for(Espectador person : gente){
            boolean sentado = false;
            do{
                int fil = rdm.nextInt(1,8);
                int co = rdm.nextInt(0,5);
               //convertimos el index de la columna
                String colum ="";
                switch(co){
                    case 0 -> colum = "A";
                    case 1 -> colum = "B";
                    case 2-> colum = "C";
                    case 3 -> colum = "D";
                    case 4 -> colum = "E";
                    case 5 -> colum = "F";

                }
                //creamos un id de Butaca al random
                String idButaca = fil+colum;
                if(verificarAsiento(idButaca)){
                        if(verificarEspectador(person)){
                            //miestras no este sentado, repetira buscando otra butaca
                            sentado = true;
                            //despues setea la Butaca y la pone como true el atributo ocupado
                            sala.get(fil).get(co).setOcupado(true);
                            //y setea la persona en la Butaca
                            sala.get(fil).get(co).setPersona(person);
                        }else{
                            break;
                        }
                }
            }while(sentado==false);
        }
    }
  
    
    
    
    
}
        
        
            
    
        
    
    


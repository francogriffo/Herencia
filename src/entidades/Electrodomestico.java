
package entidades;

import java.util.Scanner;


public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(String letra){
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("f"))  {
            
            System.out.println("El consumo energetico es de valor " + letra);    
            
        }else{
            
            letra = "F";
           
            System.out.println("El valor ingreado no es correcto. Por defecto, el consumo energetico es de valor " + letra);
                 
        }
        
        
    }
    
    public void comprobarColor(String color){
        
       if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
           
           System.out.println("El color elegido es " + color);
           
        }else{
           
           color = "blanco";
           System.out.println("El valor ingresado es incorrecto. El color por defecto es " + color);
           
       }
    }
    
    public void crearElectrodomestico(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el precio del electrodomestico (el valor base es de $1000):");
        precio = leer.nextDouble();
        
        while(precio < 1000){
            System.out.println("El precio ingresado esta por debajo de $1000. Intente nuevamente:");
            precio = leer.nextDouble();
        }
        
        System.out.println("Ingrese el color del electrodomestico:");
        color = leer.next();
        comprobarColor(color);
        
        System.out.println("Ingrese el consumo energetico (A, B, C, D, E o F):");
        consumoEnergetico = leer.next();
        comprobarConsumoEnergetico(consumoEnergetico);
        
        System.out.println("Ingrese el peso del electrodomestico:");
        peso = leer.nextDouble();
        
        
    }
    
    public void precioFinal(){
        
        String letra = consumoEnergetico.toLowerCase();
        switch (letra){
            
            case "a" : precio += 1000;
            break;
            
            case "b": precio += 800;
            break;
            
            case "c": precio += 600;
            break;
            
            case "d": precio += 500;
            break;
            
            case "e": precio += 300;
            break;
            
            case "f": precio += 100;
            break;
        }
        
        if (peso >= 1 && peso <= 19) {
            
            precio += 100;
       
        }else if(peso >= 20 && peso <= 49){
            
            precio += 500;
            
        }else if(peso >= 50 && peso <= 79){
            
            precio += 800;
            
        }else if(peso > 80){
            
            precio += 1000;
        }
    }
    
}

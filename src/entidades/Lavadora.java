
package entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, String consumoEnergetico, Double peso, Double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la carga que soporta la lavadora (en kg):");
        carga = leer.nextDouble();
       
    }
    
    
    @Override
    public void precioFinal(){
    super.precioFinal();
    
    if(carga > 30){
        
        precio += 500; 
    }
     
    }
    
}

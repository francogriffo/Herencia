
package entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    protected Double resolucionPulgadas;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double precio, String color, String consumoEnergetico, Double peso, Double resolucionPulgadas, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(Double resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion del TV (en pulgadas):");
        resolucionPulgadas = leer.nextDouble();
        
        System.out.println("Ingrese si el TV tiene sintonizadorTDT (true/false):");
        sintonizadorTDT = leer.nextBoolean();
            
    }
    
    @Override
    public void precioFinal(){
        
      super.precioFinal();
      
      if(resolucionPulgadas > 40){
          
          precio += (precio*0.30);      
      }
      
      if(sintonizadorTDT == true){
          
          precio += 500;
      }
      
    }

    
    
    
    
}

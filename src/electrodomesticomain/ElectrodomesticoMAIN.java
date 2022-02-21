package electrodomesticomain;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

public class ElectrodomesticoMAIN {

    public static void main(String[] args) {

//        EJERCICIO 2:
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println("El precio final del televisor es de " + televisor.getPrecio());

        System.out.println("");

        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println("El precio final de la lavadora es de " + lavadora.getPrecio());

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

//       EJERCICIO 3:
        Televisor televisor1 = new Televisor(1500d, "negro", "B", 25d, 32d, false);
        Televisor televisor2 = new Televisor(2000d, "blanco", "A", 20d, 50d, true);
        Lavadora lavadora1 = new Lavadora(1200d, "gris", "C", 30d, 25d);
        Lavadora lavadora2 = new Lavadora(1800d, "azul", "A", 32d, 40d);
        
        System.out.println("");
        System.out.println("Se creo una lista con 4 electrodomesticos; 2 televisores y 2 lavadoras.");

        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);

        double precioLavadoras = 0;
        double precioTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();

            if (electrodomestico instanceof Televisor) {
                precioTelevisores += electrodomestico.getPrecio();

            } else if (electrodomestico instanceof Lavadora) {
                precioLavadoras += electrodomestico.getPrecio();
            }

        }
        
        System.out.println("La suma total de los precios de todos los electrodomesticos es de " + (precioTelevisores + precioLavadoras));
        System.out.println("La suma total de los precios de los televisores es de " + precioTelevisores);
        System.out.println("La suma total de los precios de las lavadoras es de " + precioLavadoras);

    }

}

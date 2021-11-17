/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter;

import ejemploadapter.adapters.PiezaCuadradaAdapter;
import ejemploadapter.cuadrado.PiezaCuadrada;
import ejemploadapter.redondo.AgujeroRedondo;
import ejemploadapter.redondo.PiezaRedonda;

/**
 *
 * @author danna
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgujeroRedondo agujero = new AgujeroRedondo(30);
        PiezaRedonda rpieza = new PiezaRedonda(30);
        
        if(agujero.encaja(rpieza)){
            System.out.println("Radio de 30 de la pieza redonda SI encaja en el agujero redondo r30");
        }
        PiezaCuadrada pequenaPieza = new PiezaCuadrada(2);
        PiezaCuadrada grandePieza = new PiezaCuadrada(20);
        
        PiezaCuadradaAdapter pequenaPiezaAdapter = new PiezaCuadradaAdapter(pequenaPieza);
        PiezaCuadradaAdapter grandePiezaAdapter = new PiezaCuadradaAdapter(grandePieza);
        if(agujero.encaja(pequenaPiezaAdapter)){
            System.out.println("Ancho 2 de la Pieza Cuadrada  SI encaja en el agujero redondo r30");
        }
        if(!agujero.encaja(grandePiezaAdapter)){
            System.out.println(" Ancho 20 de la pieza cuadrada  NO encaja dentro de el agujero redondo r30");
        }
    }
    
}

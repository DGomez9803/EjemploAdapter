/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter.redondo;

/**
 *
 * @author danna
 */
public class AgujeroRedondo {
    private double radio;
    
    public AgujeroRedondo(double radio){
        this. radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public boolean encaja(PiezaRedonda pieza){
        boolean resultado;
        resultado =(this.getRadio()>= pieza.getRadio());
        return resultado;
    }
    
    
}

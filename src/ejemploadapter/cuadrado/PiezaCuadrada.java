/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter.cuadrado;

/**
 *
 * @author danna
 */
public class PiezaCuadrada {
    private double ancho;
    
    public PiezaCuadrada(double ancho){
        this.ancho = ancho;
    }
    
    public double getAncho(){
        return ancho;
    }
    public double getCuadrado(){
        double resultado;
        resultado = Math.pow(this.ancho, 2);
        return resultado;
    }
}

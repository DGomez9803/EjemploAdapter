/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter.adapters;

import ejemploadapter.cuadrado.PiezaCuadrada;
import ejemploadapter.redondo.PiezaRedonda;

/**
 *
 * @author danna
 */
public class PiezaCuadradaAdapter extends PiezaRedonda {
    private PiezaCuadrada pieza;
    
    public PiezaCuadradaAdapter(PiezaCuadrada pieza){
        this.pieza = pieza;
    }
    
    @Override
    public double getRadio(){
        double resultado;
        resultado = (Math.sqrt(Math.pow((pieza.getAncho()/ 2), 2)* 2));
        return resultado;
    }
    
}

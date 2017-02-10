/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Espacio extends Pieza {

    public Espacio() {
    }

    public Espacio(Color color, String material) {
        super(Color.BLUE, material);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion {
        return tablero;
    }
    

    
    
}

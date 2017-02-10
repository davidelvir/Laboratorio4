/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;

/**
 *
 * @author David
 */
public class Duende extends Pieza{

    public Duende(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "D";
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Exception {
        
    }

    
    
}

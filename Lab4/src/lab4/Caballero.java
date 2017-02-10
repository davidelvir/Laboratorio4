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
public class Caballero extends Pieza{

    public Caballero() {
    }

    public Caballero(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "C";
    }

    
    public boolean movimiento(int i,int j,int x, int y) {
        if(j == y && ((i+1==x || i-1==x))){
            return true;
        }else if(i == x &&((j+1==y || j-1 == y))){
            return true;
        }else{
            return false;
        }
    }

    
    
}

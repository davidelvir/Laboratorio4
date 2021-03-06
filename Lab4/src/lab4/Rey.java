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
public class Rey extends Pieza{

    public Rey() {
        super();
    }

    public Rey(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion {
        if(x!=i || y!=j){
            throw new Excepcion("El rey no se puede mover");
        }
        return tablero;
    }

   public Pieza[][] comer(Pieza[][] tablero, int i, int j, int x, int y)throws Excepcion {
        return tablero;
    } 
    
}

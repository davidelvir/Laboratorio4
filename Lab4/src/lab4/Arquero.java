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
public class Arquero extends Pieza{

    public Arquero() {
        super();
    }

    public Arquero(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "A";
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion {
        if(tablero[i][j].getColor().equals(tablero[x][y].getColor())){
            throw new Excepcion("Pieza del mismo equipo en esa posicion. No se movio!");
        }else{
            tablero[x][y] = tablero [i][j];
            tablero[i][j] = new Espacio();
        }
        return tablero;
    }

    
    
}

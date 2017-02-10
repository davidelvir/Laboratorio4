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
public class Dragon extends Pieza{

    public Dragon() {
    }

    public Dragon(Color color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "F";
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Exception {
        if(tablero[x][y].getColor().equals(tablero[i][j].getColor())){
            throw new Excepcion("Pieza del mismo equipo en esa posicion. No se movio!");
        }else if(i!=x && j!=y){
            tablero[x][y] = tablero[i][j];
            tablero[i][j] = new Espacio();
        }else{
            throw new Excepcion("Movimiento no valido, no se movio");
        }
        return tablero;
    }

    
    
}

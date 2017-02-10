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

    
    public Pieza[][] movimiento(Pieza tablero[][],int i,int j,int x, int y) throws Excepcion{
        if(tablero[i][j].getColor().equals(tablero[x][y].getColor())){
            throw new Excepcion("Pieza del mismo equipo en esa posicion. No se movio!");
        }else if(j == y && ((i+1==x || i-1==x))){
            tablero[x][y]=tablero[i][j];
            tablero[i][j] = new Espacio();
        }else if(i == x &&((j+1==y || j-1 == y))){
            tablero[x][y]=tablero[i][j];
            tablero[i][j] = new Espacio();
        }else{
           throw new Excepcion("Nueva posicion no valida"); 
        }
        return tablero;
    }

    
    
}

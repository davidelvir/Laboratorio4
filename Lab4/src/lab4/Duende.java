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
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion {

        if(x<0||x>9||y<0||y>9){
            throw new Excepcion("Contacte al administrador. Fuera de la ");
        }
        else if(tablero[i][j].getColor().equals(tablero[x][y].getColor())){
            throw new Excepcion("Pieza del mismo equipo en esa posicion. No se movio!");
        }else if(x == i+1){
            tablero[x][y] = tablero [i][j];
            tablero[i][j] = new Espacio();
        }else{
            throw new Excepcion("Movimiento no valido, no se movio!");
        }
        return tablero;
    }
public Pieza[][] comer(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion{
        return tablero;
    }
    
    
}

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
    public Pieza[][] movimiento(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion {
        if(x<0||x>9||y<0||y>9){
            throw new Excepcion("Contacte al administrador. Fuera de la ");
        }
        else if(tablero[i][j].getColor().equals(tablero[x][y].getColor())){
            throw new Excepcion("Pieza del mismo equipo en esa posicion. No se movio!");
        }else if(i!=x && j!=y){
            tablero[x][y] = tablero[i][j];
            tablero[i][j] = new Espacio();
        }else{
            throw new Excepcion("Movimiento no valido, no se movio");
        }
        return tablero;
    }
public Pieza[][] comer(Pieza[][] tablero, int i, int j, int x, int y) throws Excepcion{
        if(i+1>9||i-1<0||j+1>9||j-1<0||i+2>9||i-2<0||j+2>9||j-2<0){
            throw new Excepcion("Se salio de la matriz");
        }else if(!tablero[i+1][j].getColor().equals(tablero[i][j].getColor())){
            tablero[i+1][j] = new Espacio();
        }else if(!tablero[i-1][j].getColor().equals(tablero[i][j].getColor())){
            tablero[i-1][j] = new Espacio();
        }else if(!tablero[i][j+1].getColor().equals(tablero[i][j].getColor())){
            tablero[i][j+1] = new Espacio();
        }else if(!tablero[i][j-1].getColor().equals(tablero[i][j].getColor())){
            tablero[i][j-1] = new Espacio();
        }else if(!tablero[i+2][j+2].getColor().equals(tablero[i][j].getColor())){
            tablero[i+2][j+2] = new Espacio();
        }else if(!tablero[i-2][j-2].getColor().equals(tablero[i][j].getColor())){
            tablero[i-2][j-2] = new Espacio();
        }else if(!tablero[i+2][j-2].getColor().equals(tablero[i][j].getColor())){
            tablero[i+2][j-2] = new Espacio();
        }else if(!tablero[i-2][j+2].getColor().equals(tablero[i][j].getColor())){
            tablero[i-2][j+2] = new Espacio();
        }
        return tablero;
    }
    
    
}

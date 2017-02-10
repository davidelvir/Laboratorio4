
package lab4;

import java.awt.Color;

public class Lab4 {

    
    public static void main(String[] args) {

        
        Pieza tablero [][] = new Pieza[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if((i == 0 && j == 0)||(i == 0 && j == tablero.length-1)){
                    tablero[i][j] = new Caballero(Color.BLACK,"madera");
                }else if((i == tablero.length-1 && j== 0)||(i==tablero.length-1 && j == tablero.length-1)){
                    tablero[i][j] = new Caballero(Color.WHITE,"madera");
                }else if((i == 0 && j == 2)||(i == 0 && j == 7)){
                    tablero[i][j] = new Dragon(Color.BLACK,"madera");
                }else if((i == tablero.length-1 && j == 2)||(i == tablero.length-1 && j == 7)){
                    tablero[i][j] = new Dragon(Color.WHITE,"madera");
                }else if((i == 0 && j == 3)||(i==0 && j == 6)||(i == 1 && j == 2)||(i == 1 && j == 7)){
                    tablero[i][j] = new Arquero(Color.BLACK,"madera");
                }else if((i == tablero.length-1 && j == 3)||(i==tablero.length-1 && j == 6)||(i == 8 && j == 2)||(i == 8 && j == 7)){
                    tablero[i][j] = new Arquero(Color.WHITE,"madera");
                }else if(i == 0 && j == 4){
                    tablero[i][j] = new Rey(Color.BLACK,"madera");
                }else if(i == tablero.length-1 && j == 5){
                    tablero[i][j] = new Rey(Color.WHITE,"madera");
                }else if(i == 0 && j == 5){
                    tablero[i][j] = new Mago(Color.BLACK,"madera");
                }else if(i == tablero.length-1 && j == 4){
                    tablero[i][j] = new Mago(Color.WHITE,"madera");
                }
                else{
                    tablero[i][j] = new Pieza();
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}

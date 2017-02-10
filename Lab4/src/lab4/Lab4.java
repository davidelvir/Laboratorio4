
package lab4;

import java.awt.Color;

public class Lab4 {

    
    public static void main(String[] args) {

        
        Pieza tablero [][] = new Pieza[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if((i == 0 && j == 0)||(i == 0 && j == tablero.length-1)){
                    tablero[i][j] = new Duende(Color.BLACK,"madera");
                }else if((i == tablero.length-1 && j== 0)||(i==tablero.length-1 && j == tablero.length-1)){
                    tablero[i][j] = new Duende(Color.WHITE,"madera");
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

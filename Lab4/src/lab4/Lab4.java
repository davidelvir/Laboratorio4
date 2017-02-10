package lab4;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4 {

    public static void main(String[] args) {

        Pieza tablero[][] = new Pieza[10][10];
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
                }else {
                    tablero[i][j] = new Pieza();
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println("");
        }

        String opcion = " ";
        ArrayList<Jugador> jugadores = new ArrayList();
        while (!opcion.equalsIgnoreCase("e")) {
            opcion = JOptionPane.showInputDialog("-------Menu------\n"
                    + "a. Agregar\n"
                    + "b. Listar\n"
                    + "c. Eliminar\n"
                    + "d. Jugar\n"
                    + "e. Salir \n");
            if (opcion.equalsIgnoreCase("a")) {
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
                String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario: ");
                int puntos = 0;
                String lugar_nacimiento = JOptionPane.showInputDialog("Ingrese Lugar de Nacimiento: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
                String sexo = JOptionPane.showInputDialog("Ingrese su sexo: ");
                jugadores.add(new Jugador(nombre, nombre_usuario, puntos, lugar_nacimiento, edad, sexo));
            }
            if (opcion.equalsIgnoreCase("b")) {
                String p1 = "";
                for (Object t1 : jugadores) {
                    if (t1 instanceof Jugador) {
                        p1 += jugadores.indexOf(t1) + " " + ((Jugador) t1) + "\n";
                    }

                }
                JOptionPane.showMessageDialog(null, p1);
            }
            if (opcion.equalsIgnoreCase("c")) {
                int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar: "));
                jugadores.remove(pos);
            }
            if (opcion.equalsIgnoreCase("d")){
                
            }
        }
    }

}

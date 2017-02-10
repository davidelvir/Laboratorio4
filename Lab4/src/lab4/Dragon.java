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
    
}

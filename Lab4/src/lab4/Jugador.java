/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author usuario
 */
public class Jugador {
    private String nombre;
    private String nombre_usuario;
    private int puntos;
    private String lugar_nacimiento;
    private int edad;
    private String sexo;

    public Jugador() {
    }

    public Jugador(String nombre, String nombre_usuario, int puntos, String lugar_nacimiento, int edad, String sexo) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.puntos = puntos;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edad = edad;
        this.sexo = sexo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nombre_usuario=" + nombre_usuario + ", puntos=" + puntos + ", lugar_nacimiento=" + lugar_nacimiento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}

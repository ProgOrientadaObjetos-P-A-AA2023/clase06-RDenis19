/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class Colegio {
    private String nombre;
    private String ciudad;
    
    public Colegio (String n, String c){
        nombre = n;
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }
    
    
}

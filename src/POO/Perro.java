/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Estudiante
 */
public class Perro {
    
    String nombre;
    String tipo;

    public Perro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    void ladrar() {
        System.out.println(nombre + tipo + " Guau! Guau!");
    }
}

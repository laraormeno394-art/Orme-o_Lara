/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante
 */
public class Personaa {
    
    String nombre;
    int edad;

    public Personaa(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void esMayorDeEdad() {
        JOptionPane.showMessageDialog(null, "Usted es mayor de edad.");
    }
}

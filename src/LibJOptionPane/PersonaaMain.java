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
public class PersonaaMain {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String input = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edad = Integer.parseInt(input);
        
        Personaa p1 = new Personaa(nombre, edad);
        
        if (edad >= 18) {
            p1.esMayorDeEdad();
        }
        else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad");
        }
    }
 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARREGLOS;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiante
 */
public class EdadesDeMiFamilia {
    public static void main(String[] args) {
        String[] edades = {"13","25","32","37","17"};
        
        JOptionPane.showMessageDialog(null, edades[1]);
        
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, edades[i]);
        }
    }
    
}

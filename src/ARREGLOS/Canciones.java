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
public class Canciones {
    public static void main(String[] args) {
        
        String[] canciones = {"Chantaje","Paque la pases bien","My Space","Billie Jean","Candy"};
        
        JOptionPane.showMessageDialog(null, canciones[0]);
        
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, canciones[i]);
        }
        
    }
   
}

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
public class EjemArreglo {
    public static void main(String[] args) {
        
        /*
        
        FORMA NUMERO 1
        String[] nombres = new String[5];

        nombres[0] = "Naty";
        nombres[1] = "Mara";
        nombres[2] = "Mariel";
        nombres[3] = "Lujan";
        nombres[4] = "Yago";
        
        
        
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, nombres[i]);
        }
*/
        
        //FORMA NUMERO 2
        String[] nombres = {"Naty","Mara","Lara","Mariel","Yago"};

        
        
        for (int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, nombres[i]);
        }
        
    }
}

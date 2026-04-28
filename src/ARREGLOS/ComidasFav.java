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
public class ComidasFav {
    public static void main(String[] args) {
     
        String comidasFavoritas[] = new String [5];
        
        comidasFavoritas[0] = "Alfajores";
        comidasFavoritas[1] = "Arroz";
        comidasFavoritas[2] = "Pollo al horno";
        comidasFavoritas[3] = "Napolitana";
        comidasFavoritas[4] = "LomoPizza";
        
        JOptionPane.showMessageDialog(null, comidasFavoritas[1]);
        
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, comidasFavoritas[i]);
        }
    }
}

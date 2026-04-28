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
public class MiMochila {
    public static void main(String[] args) {
        
        String mochila [] = new String[5];
        
        mochila[0] = "carpeta";
        mochila[1] = "compu";
        mochila[2] = "cartuchera";
        mochila[3] = "hojas";
        mochila[4] = "cargador";
        
        JOptionPane.showMessageDialog(null, mochila[2]);
        JOptionPane.showMessageDialog(null, mochila[4]);
        
        
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, mochila[i]);
        }
    }
}

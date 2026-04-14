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
public class MainAuto {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
        String modelo = JOptionPane.showInputDialog("Ingrese la marca del auto");
        
        Aauto a1 = new Aauto (modelo, marca);
        Aauto a2 = new Aauto (modelo, marca);
        
        a1.arrancar();
    }
}

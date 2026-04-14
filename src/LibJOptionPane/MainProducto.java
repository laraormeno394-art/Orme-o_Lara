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
public class MainProducto {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de producto: ");
        String input= JOptionPane.showInputDialog("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(input);
        
        Producto p1 = new Producto(nombre, precio);
        
        if (precio >= 10000) {
            p1.esCaro();
        }
        else {
            JOptionPane.showMessageDialog(null, "Está barato.");
        }
    }
}

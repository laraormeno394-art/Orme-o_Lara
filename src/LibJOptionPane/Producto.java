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
public class Producto {
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    void esCaro(){
        JOptionPane.showMessageDialog(null, "ES MUY CARO");
    }
}

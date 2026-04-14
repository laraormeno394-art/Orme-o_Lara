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
public class Aauto {
    String marca;
    String modelo;

    public Aauto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    void arrancar() {
        JOptionPane.showMessageDialog(null, "El auto arrancó");
    }
}

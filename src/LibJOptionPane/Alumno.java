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
public class Alumno {
    String nombre;
    int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    void aprobo(){
        JOptionPane.showMessageDialog(null, "El alumno aprobó");
    }
}

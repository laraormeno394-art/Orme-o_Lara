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
public class alumnoMain {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
        String input = JOptionPane.showInputDialog("Ingrese la nota: ");
          int nota = Integer.parseInt(input);
          
          Alumno a1 = new Alumno(nombre, nota);
          
          if (nota >= 6) {
          a1.aprobo();
          }
          else {
              JOptionPane.showMessageDialog(null, "El alumno reprobó");
          }
    }
}

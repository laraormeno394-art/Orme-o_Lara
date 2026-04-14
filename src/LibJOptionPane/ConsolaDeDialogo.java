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
public class ConsolaDeDialogo {
    public static void main(String[] args) {
        String nombre;
      int edad;

      nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Perro: ");      
      JOptionPane.showMessageDialog(null,"Hola soy: "+nombre);
       
      edad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos anios tiene: "));
      JOptionPane.showMessageDialog(null,"Tengo: "+edad + " anios");
    }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Estudiante
 */
public class Personas {
    
   String nombre;
   String apellido;
   int edad;
   String nacionalidad;

    public Personas(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

  
   
   void saludar () {
       System.out.println("hola " + nombre + " " + apellido);
   }
   void leerD () {
       System.out.println("edad: "+ edad + "nacionalidad: " + nacionalidad );
   }
}

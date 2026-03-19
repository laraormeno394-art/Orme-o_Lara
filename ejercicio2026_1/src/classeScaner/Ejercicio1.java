/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeScaner;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        char color;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Hola " + nombre);
        
        System.out.println("Ingrese su color favorito: ");
        color = input.next().charAt(3);

    }
      
    
}

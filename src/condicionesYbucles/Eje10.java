/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionesYbucles;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Eje10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opciones = 0;
        
        
        while (opciones != 3) {
        
        
        System.out.println("Seleccione una de las opciones: ");
        System.out.println("1. Saludo");
        System.out.println("2. Mostrar fecha.");
        System.out.println("3. Salir.");
        
        opciones = input.nextInt();
        
        if (opciones == 1) {
            System.out.println("Hola Lara!");
            
        } if (opciones == 2) {
            System.out.println("Hoy es 31 de marzo del 2026.");
        }
          if (opciones == 3) {
            System.out.println("Hasta pronto.");
        } 
         
        }
       
    }
    
}

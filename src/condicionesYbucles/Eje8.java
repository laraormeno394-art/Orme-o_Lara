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
public class Eje8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cont, repeticionC;
        
        System.out.println("Ingrese una contraseña numérica: ");
        cont = input.nextInt();
        
        System.out.println("Compruebe la contraseña ingresada: ");
        repeticionC = input.nextInt();
        
       while (cont != repeticionC) {
           System.out.println("Contraseña incorrecta, intentelo de nuevo.");
           repeticionC = input.nextInt();
           
       }
        System.out.println("Bienvenido.");
        
    }
    
}

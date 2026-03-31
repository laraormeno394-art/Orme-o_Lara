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
public class Eje9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num; 
        
        System.out.println("Ingrese un numero mayor a 0.");
        num = input.nextInt();
        
        while (num < 0) {
            System.out.println("El numero debe ser mayor a 9. Intentelo de nuevo: ");
            num = input.nextInt();
        }
        
    }
    
}

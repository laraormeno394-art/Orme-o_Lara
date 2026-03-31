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
public class Eje13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numSecreto = (int) (Math.random()* 10) + 1;
        int intentos = 0;
        
        while (intentos != numSecreto) {
            System.out.println("Adivine un numero entre el 1 y el 10: ");
            intentos = input.nextInt();
            
            if (intentos != numSecreto) {
            System.out.println("El numero no es el correcto, intentelo de nuevo.");
             } else {
                System.out.println("Felicidades, logró adivinar!!!");
                }
    }
    }
}

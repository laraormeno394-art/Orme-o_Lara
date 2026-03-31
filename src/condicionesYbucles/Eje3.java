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
public class Eje3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Ingrese su nota: ");
        nota = input.nextDouble();
        
        if (nota == 10 || nota == 9) {
            System.out.println("Excelente");
            
        } if (nota == 7 || nota == 8) {
            System.out.println("Aprobado");
        }
        if (nota == 4 || nota == 5 || nota == 6) {
            System.out.println("Recupera");
        }
        if (nota >= 0 && nota <= 3 ) {
            System.out.println("Desaprobado");
        }
    }
}

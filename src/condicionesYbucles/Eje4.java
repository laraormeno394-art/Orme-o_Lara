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
public class Eje4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Ingrese el numero 1 : ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el numero 2 : ");
        num2 = input.nextInt();
        
        System.out.println("Ingrese el numero 3 : ");
        num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero "+ num1 + "es el mayor de todos.");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + "es el mayor de todos.");
            
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("EL numero " + num3 + " es el mayor de todos.");
        }
    }
}

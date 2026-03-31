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
public class Eje2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        
        
        System.out.println("Ingrese un numero: ");
        num= input.nextDouble();
        
        if (num > 0) {
            System.out.println("El numero es positivo");
            
        } else if ( num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("EL numero es neutro");
        }
    }
}

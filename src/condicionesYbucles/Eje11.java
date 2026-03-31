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
public class Eje11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        int i = 1;
        
        System.out.println("Ingrese un numero del 1 al 10: ");
        num = input.nextInt();
        
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i = i + 1;
        }
    }
}

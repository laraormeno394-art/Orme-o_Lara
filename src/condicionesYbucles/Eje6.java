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
public class Eje6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, res;
       
        System.out.println("Ingrese dos numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
       
        System.out.println("Ingrese la opración que desea realizar: +, -, /, * ");
        res = input.next().charAt(0);
        
        switch (res) {
            case '+':
                System.out.println("El resultado es de: " + (num1 + num2));
            
                break;
            case '-':
                System.out.println("El resultado es de: " + (num1 - num2));
                break;
                
            case '/':
                System.out.println("El resultado es de: " + (num1/ num2));
                break;
                
            case '*':
                System.out.println("El resultado es de: " + (num1 * num2));
                break;
        }
        
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class DatosEmpleado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        double salario;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
        System.out.println("Ingrese su salario: ");
        salario = input.nextDouble();
        
        System.out.println("Datos del empleado: ");
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Salario del empleado: " + salario);
    }
}

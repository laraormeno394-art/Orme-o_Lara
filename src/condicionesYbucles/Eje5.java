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
public class Eje5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        
        System.out.println("Menú:");
        System.out.println("Ingrese la opción que desea:");
        System.out.println("1. Ver perfil");
        System.out.println("2. Editar datos");
        System.out.println("3. Cerrar Sesión");
        op = input.nextInt();
        
        if (op == 1) {
            System.out.println("Seleccionaste: La opcion 1: Ver Perfil");
        }
        if (op == 2) {
            System.out.println("Seleccionaste: La opcion 2: Editar Datos");
        }
        if (op == 3) {
            System.out.println("Seleccionaste: La opcion 3: Cerrar Sesion");
        }
    }
}

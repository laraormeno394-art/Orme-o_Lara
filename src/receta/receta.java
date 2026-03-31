/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class receta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String receta;
        String ingredientes;
        double preparacion;
        String dificultad;
        
        System.out.println("Ingrese el nombre de la receta: ");
        receta = input.nextLine();
        
        System.out.println("Ingrese los ingredientes: ");
        ingredientes = input.nextLine();
        
        System.out.println("Ingrese los minutos de coccion: ");
        preparacion= input.nextDouble();
        
        System.out.println("Ingrse la dificultad de la receta (facil, media, dificil)");
        dificultad = input.nextLine();
        
        System.out.println("La receta: " +receta + "se guardó corractamente.");
    }
}

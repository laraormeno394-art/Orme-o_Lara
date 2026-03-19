/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helado;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class disponibleono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String sabor;        
        
        System.out.println("Ingrese el sabor de helado deseado: ");
        sabor = input.nextLine();
      
        if (sabor.equals("vainilla") || 
            (sabor.equals("frutilla"))||
            (sabor.equals("dulce de leche"))||
            (sabor.equals("chocolate"))) {
            System.out.println("El sabor está disponible");
        }
        else {
            System.out.println("El sabor no está disponible");
        }
      
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Auto {
   
   Scanner input = new Scanner(System.in);
           
    String marca;
    String modelo;
    int velocidad;

    public Auto(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    void acelerar () {
        velocidad += 10;
        System.out.println("Acelerando... Velocidad actual: " + velocidad);
    }
    void frenar () {
       velocidad -= 10;
        System.out.println("Disminuyendo la velocidad... Velocidad: " + velocidad);
    }
    
}

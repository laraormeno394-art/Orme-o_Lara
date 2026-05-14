/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author Estudiante
 */
public class ejercicio_Mundial {
    public static void main(String[] args) {
        
        String [][] mundial = new String [8] [2];
        
        mundial[0][0] = "Argentina";
        mundial[0][1] = "2";
        mundial[1][0] = "Brasil";
        mundial[1][1] = "1";
        mundial[2][0] = "España";
        mundial[2][1] = "3";
        mundial[3][0] = "México";
        mundial[3][1] = "0";
        mundial[4][0] = "Francia";
        mundial[4][1] = "4";
        mundial[5][0] = "Alemania";
        mundial[5][1] = "2";
        mundial[6][0] = "Japon";
        mundial[6][1] = "1";
        mundial[7][0] = "Portugal";
        mundial[7][1] = "5";
        
        System.out.println("Selección  Goles:");
        
        for (int i = 0; i < mundial.length; i++) {
            for (int j = 0; j < mundial[i].length; j++) {
                System.out.print("["+mundial[i][j]+"]");
            }
            System.out.println();
        }
    }
}

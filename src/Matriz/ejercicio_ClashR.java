/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author Estudiante
 */
public class ejercicio_ClashR {
    public static void main(String[] args) {
            
        String [][] arena = new String [3][3];
        
        arena[0][0] = "Arqueras";
        arena[0][1] = "Gigante";
        arena[0][2] = "Mini P.E.K.K.A";
        arena[1][0] = "P.E.K.K.A";
        arena[1][1] = "Mosquetera";
        arena[1][2] = "Valquiria";
        arena[2][0] = "Principe";
        arena[2][1] = "Mago";
        arena[2][2] = "Bruja";
        
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena.length; j++) {
                System.out.print("["+arena[i][j]+ "]");
            }
            System.out.println();
        }
    
    }
}

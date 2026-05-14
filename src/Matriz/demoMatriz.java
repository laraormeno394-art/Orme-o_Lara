/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author Estudiante
 */
public class demoMatriz {
    public static void main(String[] args) {
            
    
    String [][] arena= new String [5][5];
    
    arena[1][3] = "Bárbaro";
    arena[2][1] = "pou";
    arena[4][4] = "goku";
    arena[3][2] = "ubyv";
    arena[4][4] = "Blok";
    
    
        //FILAS
        for (int i = 0; i < arena.length; i++) {
            
            //COLUMNAS
            for (int j = 0; j < arena.length; j++) {
                System.out.print("["+arena[i][j]+"]");
            }
            System.out.println();
        }
    }
}

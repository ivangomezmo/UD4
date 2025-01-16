/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja4;
 
import java.util.Scanner;
 
/**
 *
 * @author DAW107
 */
public class ejer1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int matriz[][] = {{101, 102, 103, 104, 105},
            {201, 202, 203, 204, 205},
            {301, 302, 303, 304, 305},
            {401, 402, 403, 404, 405},
            {501, 502, 503, 504, 505}};
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int nFilas = matriz.length;
        int nColumnas = matriz[0].length;
        
        System.out.println("Operaciones en un Array Bidimensional");
        System.out.println("OPCIONES");
        
        do{
            System.out.println("1.- Mostrar elementos de una fila");
            System.out.println("2.- Mostrar elementos de una columna");
            System.out.println("3.- Mostrar elementos de la diagonal principal");
            System.out.println("4.- Mostrar elementos de la diagonal inversa");
            System.out.println("5.- Mostrar elementos de la diagonal hacia arriba");
            
            System.out.println("Introduce una opción");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1-> {
                    System.out.println("Introduce el número de la fila que quieres ver");
                    int fila = teclado.nextInt();
                    ejer1.mostrarFila(matriz, fila);
                }
                
                case 2-> {
                    System.out.println("Introduce el número de la columna que quieres ver");
                    int columna = teclado.nextInt();
                    ejer1.mostrarColumna(matriz, columna);
                    
                }
                
                case 3-> {
                    System.out.println("Introduce 1 para mostrar la diagonal principal");
                    int diagonal = teclado.nextInt();
                    ejer1.mostrarDiagonal(matriz);
                }
                
                case 4-> {
                    System.out.println("Introduce 1 para mostrar la diagonal inversa");
                    int diagonalInversa = teclado.nextInt();
                    ejer1.mostrarDiagonal(matriz);
                }
    
            }
 
        }while(opcion!=6);
 
    }
    
    public static void mostrarFila(int[][] matriz, int nFila){
        for(int i = 0; i< matriz[nFila].length; i++){
            System.out.println(matriz[nFila-1][i]);
        }
    }
    
    public static void mostrarColumna(int[][] matriz, int nColumna){
        for(int i = 0; i< matriz[0].length; i++){
            System.out.println(matriz[i][nColumna-1]);
        }
    }
    
    public static void mostrarDiagonal(int[][] matriz){
        int k = matriz.length;
        int m = matriz[0].length;
        
        for(int i = 0; i<k; i++){
            for(int j = 0; j < m; j++){
                if(i == j){
                    System.out.println(matriz[i][j]);
                }
            }
        } 
    }
    
    public static void mostrarDiagonalInversa(int[][] matriz){
        int k = matriz.length;
        int m = matriz[-1].length;
        
        for(int j = -1; j<m; j++){
            for(int i = -1; i<k; i++){
                if(j == i){
                    System.out.println(matriz[j][i]);
                }
            }
        } 
    }
    
    
}

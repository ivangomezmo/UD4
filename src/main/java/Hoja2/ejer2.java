/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja2;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int size;
        System.out.println("Array de temperaturas");
        System.out.println("Introduce el numero de temperaturas para almacenar");
        size = teclado.nextInt();
        
        Invierno winter = new Invierno(size);
        
    }
    
    
    
}

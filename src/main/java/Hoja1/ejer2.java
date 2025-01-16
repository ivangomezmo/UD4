/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja1;

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
        double[] temperaturas = new double[10];
        
        double total = 0;
        
        System.out.println("Programa que calcula la temperatura media de 10 ciudades");
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Introduce la temperatura " + ( i+1) + "/10");
            temperaturas[i] = teclado.nextDouble();
            total += temperaturas[i];
        }
        
        System.out.printf("La temperatura media es %.2f", total/temperaturas.length );
        
    }
    
}

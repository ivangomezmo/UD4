/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja1;

/**
 *
 * @author DAW107
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[] = new int[10];
        int array2[] = new int[10];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10 + 1);
        }
        
        System.out.println("El array de partida es: ");
        
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        
        System.out.println("");
        
        System.out.println("Mostramos el array de partida invertido en otro array");
         for(int k = 0; k < array.length; k++){
            array2[k] = array[array.length - k - 1];
        }
        
         System.out.println("El array invertido es: ");
         for(int j = 0; j < array.length; j++){
            System.out.print(array2[j] + "\t");
        }
         
    }
    
}

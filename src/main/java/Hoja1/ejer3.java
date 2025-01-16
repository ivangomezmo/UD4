/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja1;

/**
 *
 * @author DAW107
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int numero = 1;
        boolean encontrado = false;
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10)+1;
        }
        
        System.out.println("Array");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        
        System.out.println("\nValor a buscar: " + numero);
        for(int i = 0; i < array.length; i++){
            if(array[i] == numero){
                encontrado = true;
            }
        }
        
        String msg = encontrado ? " ha " : " no ha ";
        System.out.println("El numero " + numero + msg +" sido encontrado en el array ");
    }
    
}
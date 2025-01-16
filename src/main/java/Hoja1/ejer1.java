/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hoja1;

/**
 *
 * @author DAW107
 */
public class ejer1 {

    public static void main(String[] args) {
        
        int[] array = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        
        System.out.println("El tamano del array es " + array.length);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        
        }
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            array[i] = -1;
        }
        System.out.println("Contenido actual del array");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        
        }
        System.out.println("");
        System.out.println("Inicializamos el array con Math.random");
        for(int j = 0; j < array.length; j++){
            array[j] = (int) (Math.random()*100) + 1;
        }
        System.out.println("Contenido actual del array");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        }
    }
}

/*                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                           
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja2;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Operaciones {
    
    private int[] numeros = new int [5];
    
    public Operaciones(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero entero " + (i+1) + "/5");
            numeros[i] = teclado.nextInt();
        }
    }
    
    public void dobleNumeros(){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
    }
    
}
//                                                                                                                                                                                                                                                                                                                                                                                                  |                       
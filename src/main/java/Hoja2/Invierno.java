/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja2;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Invierno {
    
    private double[] temperaturas;
    
    public Invierno(int size){
        
        temperaturas = new double[size];
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Introduce el valor de la temperatura en C" + (i+1) + "/" + size + ".");
            temperaturas[i] = teclado.nextDouble();
        }
        
    }
    
    public double tempMedia(){
        double suma = 0;
        for (int i = 0; i < temperaturas.length; i++){
            suma += temperaturas[i];
        }
        return suma / temperaturas.length;
    }
    
    public double[] fahrenheit(){
        double tempFahrenheit[] = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++){
            tempFahrenheit[i] = temperaturas[i] * 1.8 + 32;
        }
        return tempFahrenheit;
    }
    
    
    
}

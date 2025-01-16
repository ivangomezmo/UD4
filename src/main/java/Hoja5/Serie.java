/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja5;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Serie {
    
    private double[] numeros;
    private char variable;
    
    public Serie(int dimension, char variable){
        this.variable = variable;
        
        numeros = new double[dimension];
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i < numeros.length; i++){
            System.out.println("Introduce un valor all array");
            numeros[i] = teclado.nextDouble();
        }
    }
    
    public double resultado(){
        double resultado=0;
        
        if(variable == '+'){
            for(int i=0; i<numeros.length; i++){
                resultado += numeros[i];
            }
        }else if(variable == '*'){
            resultado = 1;
            for(int i=0; i < numeros.length; i++){
                resultado *= numeros[i];
            
        }
    }
        return resultado;
    }
}


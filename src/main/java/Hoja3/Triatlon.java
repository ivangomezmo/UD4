/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja3;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Triatlon {
    
    private String nombre;
    private int dorsal;
    private int[] puntuaciones;
    
    public Triatlon(int dorsal, String nombre, int size){
        Scanner teclado = new Scanner(System.in);
        this.puntuaciones = new int[size];
        this.dorsal = dorsal;
        this.nombre = nombre;
        
        for (int i = 0; i < size; i++){
            System.out.println("Introduce la puntuacion de la prueba " + (i+1) + "/" + size);
            this.puntuaciones[i] = teclado.nextInt();
            
        }
        
        teclado.close();
        
    }
    
    public Triatlon(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dorsal");
        this.dorsal = teclado.nextInt();
        
        System.out.println("Introduce el nombre del atleta");
        this.nombre = teclado.next();
        
        System.out.println("Introduce el numero de prueba");
        int numeroPruebas = teclado.nextInt();
        this.puntuaciones = new int[numeroPruebas];
        
        System.out.println("Introduce los valores de las " + numeroPruebas + " pruebas");
        for (int i = 0; i < puntuaciones.length; i++){
            System.out.println("Introduce la puntuacion de la prueba " + (i+1));
            this.puntuaciones[i] = teclado.nextInt();
            
        }
        
        teclado.close();
        
    }
    
    public double pMedia(){
        double suma = 0;
        
        for(int i = 0; i < puntuaciones.length; i++){
            suma += this.puntuaciones[i];
        }
        
        return suma/puntuaciones.length;
        
    }
    
    public boolean esSeleccionado(){
        boolean seleccionado = false;
        
         for (int i = 0; (i < puntuaciones.length && !seleccionado); i++){
             if(puntuaciones[i]>10){
                 seleccionado = true;
             }
             
             
             
         }
         
         return seleccionado;
         
    }
    
    public String mostrar(){
        String msg = "";
        msg+= "Dorsal = " + this.dorsal + " Nombre = " + this.nombre + " Puntos = ";
        
        for (int i = 0; i < puntuaciones.length; i++){
            msg+= puntuaciones[i] + " ,";
        }
        msg += " Media = " + pMedia();
        
        return msg; 
    }
            
}



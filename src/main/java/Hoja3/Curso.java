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
public class Curso {
    
   private String nombre;
   private String[] alumnos;
   
   public Curso(String nombre, int dimension){
       this.nombre = nombre;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce los alumnos del Curso");
       alumnos = new String[dimension];
       
       for(int i = 0; i<alumnos.length; i++){
           System.out.println("Introduce el alumnos " + (i+1) + "/" + dimension);
           alumnos[i] = teclado.next();
       }
   }
   
   public void iniciales(){
       for(int i=0; i < alumnos.length; i++){
       System.out.println(alumnos[i].toUpperCase().charAt(0) + ".");
        }
   }
   
   public void desplaza(){
       String aux = alumnos[alumnos.length - 1];
       
       for(int i = alumnos.length - 1; i>1; i--){
           alumnos[i] = alumnos[i-1];
       }
       alumnos[0] = aux;
   }
   
   public void desplaza2(){
       String[] alumnos2 = new String[alumnos.length];
       for(int i = 0; i < alumnos.length; i++){
           if(i==0){
               alumnos2[i] = alumnos[alumnos.length - 1];
           }else{
               alumnos2[i] = alumnos[i - 1];
           }
       }
       alumnos = alumnos2;
   }
   
   public String verNombre(int posicion){
       String nombre = "";
       for(int i = 0; i < alumnos.length; i++){
           if(i==posicion){
               nombre = alumnos[i];
               break;
           }
       }
       return nombre;
   }
   
   public boolean esDaw(){
       return this.nombre.toUpperCase().contains("DAW");
   }
    
}

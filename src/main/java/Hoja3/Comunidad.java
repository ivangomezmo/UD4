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
public class Comunidad {
    
    private String nombre;
    private String[] provincias;
    
    public Comunidad(String nombre, int dimension){
        this.nombre = nombre;
        Scanner teclado = new Scanner(System.in);
        this.provincias = new String[dimension];
        
        for(int i = 0; i < provincias.length; i++){
            System.out.println("Introduce la provincia numero " + (i+1) + " de " + nombre);
            provincias[i] = teclado.next();
        }
        
        System.out.println("Comunidad  de " + nombre + " completada.");
    }
    
    public String mostrar(){
        String txt="";
        txt = txt + nombre.toUpperCase();
        for(int i = 0; i < provincias.length; i++){
            if(provincias[provincias.length -1 -i].length()>=4){
                txt+= " " + provincias[provincias.length -1 -i ].substring(0,4);
            }else{
                txt+= " dimension " + provincias[provincias.length -1 -i];
            }
        }
        return txt;
    }
    
    public String sorteo(){
        return provincias[(int)Math.random()*(provincias.length)];
    }
    
    public int buscar(String nombre){
        boolean encontrado = false;
        int posicion = -1;
        
        for(int i = 0; (i < provincias.length && !encontrado); i++){
            if(nombre.equalsIgnoreCase(provincias[i])){
                encontrado = true;
                posicion = i;
            }
        }
        return posicion;
    }
    
}

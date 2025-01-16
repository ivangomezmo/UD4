/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja6;

import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Agenda {
    private Persona[] personas;
    private int contador;
    
    public Agenda(int dimension){
        personas = new Persona[dimension];
        this.contador = 0;
    }
    
    public void insertar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Datos del Contacto");
        System.out.println("Introduce el nombre del contacto");
        String nombre = teclado.next();
        System.out.println("Introduce el numero de telefono del contacto");
        String telefono = teclado.next();
        
        if(contador < personas.length){
            personas[contador] = new Persona(nombre, telefono);
            this.contador++;
            System.out.println("Se ha añadido un contacto a la agenda");
        }else{
            System.out.println("No ha sido posible guardar el contacto");
        }
    }
    
    public void mostrarAgenda(){
        for(Persona p : personas){
            System.out.println(p.toString());
        }
    }
    
//    public void insertar()
    
}

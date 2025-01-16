/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja5;

/**
 *
 * @author DAW107
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sopa s1 = new Sopa();
        
        Sopa s2 = new Sopa(10,10);
        
        System.out.println("La primera sopa");
        s1.setPalabra("XXXXXXXX", 1, 17, -1);
        System.out.println(" ");
        s1.mostrar();
        System.out.println(" ");
        System.out.println("La segunda sopa");
        s2.setPalabra("XXXXXXXX", 1, 9, -1);
        System.out.println(" ");
        s2.mostrar();
        
        
        
    }
    
}

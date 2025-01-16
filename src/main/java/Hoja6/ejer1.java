/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja6;

/**
 *
 * @author DAW107
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Almacén almacen1 = new Almacén(3);
        
        almacen1.llenar();
        almacen1.mostrar();
        
        System.out.println("Articulos de menos de 10 unidades ...");
        almacen1.pedidos();
        
    }
    
}

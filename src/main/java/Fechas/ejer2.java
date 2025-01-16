/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fechas;

/**
 *
 * @author DAW107
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Veterinario MiguelHerrero = new Veterinario();
        
        Mascota pluto = new Mascota("pluto", 1956, 2, 1);
        Mascota abba = new Mascota("abba", 2023, 7, 2);
        
        MiguelHerrero.añadir(abba);
        MiguelHerrero.añadir(pluto);
        
        System.out.println("PROGRAMA DE PRUEBA DE VETERINARIOS");
        System.out.println("Datos de las mascotas");
        System.out.println(MiguelHerrero.mostrar());
        System.out.println("_________________________");
        
        System.out.println("Mascotas de más de 5 años");
        System.out.println(MiguelHerrero.mostrarMayores());
        
        System.out.println("Buscar una mascota por nombre");
        System.out.println(MiguelHerrero.buscarPorNombre("abba"));
        System.out.println(MiguelHerrero.buscarPorNombre("pluto"));
        
    }
    
}

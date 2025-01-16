/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Mascota {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    
    public Mascota(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("DATOS DE LA MASCOTA");
        System.out.println("Introduce el nombre de la mascota");
        this.nombre = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento de la mascota (dd-mm-yyyy)");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(teclado.nextLine(), formato);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    public void mostrar(){
        System.out.println("DATOS DE LA MASCOTA");
        System.out.println("El nombre de la mascota es " + nombre);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("La fecha de vencimiento de la letra es " + fechaNacimiento.format(formato));
    }
    
}

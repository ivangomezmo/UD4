/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Letra {
    
    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;
    
    public Letra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("DATOS DE LA LETRA");
        System.out.println("Introduce el numero de la letra");
        this.numLetra = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el titular de la letra");
        this.titular = teclado.nextLine();
        System.out.println("Introduce el importe de la letra");
        this.importe = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce la fecha de vencimiento de la letra dd-mm-yyyy");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaVencimiento = LocalDate.parse(teclado.nextLine(), formato);
        
    }
    
    public boolean vencida(){
        boolean vencida = fechaVencimiento.isBefore(LocalDate.now());
        return vencida;
    }
    
    public void demora(long plazo){
        fechaVencimiento = fechaVencimiento.plusDays(plazo);
    }
    
    public long diasFaltan(){
        long diasFaltan;
        diasFaltan = ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
        return diasFaltan;
    }
    
    public void mostrar(){
        System.out.println("DATOS DE LA LETRA");
        System.out.println("El número de la letra es " + numLetra);
        System.out.println("El titular de la letra es " + titular);
        System.out.println("El importe de la letra es " + importe + " euros");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("La fecha de vencimiento de la letra es " + fechaVencimiento.format(formato));
    }
    
    public int devuelveMes(){
        int mes = fechaVencimiento.getMonthValue();
        return mes;
    }
    
    public String getTitular(){
        return titular;
    }
    
}

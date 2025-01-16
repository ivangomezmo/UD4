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
public class Cliente {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;
    
    public Cliente(){
        
    }
    public Cliente(int codigo, String nombre, String apellidos, String telefono, double saldo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    } 
//    public Cliente(){
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce el código del cliente");
//        this.codigo = teclado.nextInt();
//        System.out.println("Introduce el nombre del cliente");
//        this.nombre = teclado.next();
//        System.out.println("Introduce los apellidos del cliente");
//        this.apellidos = teclado.next();
//        System.out.println("Introduce el teléfono del cliente");
//        this.tlf = teclado.next();
//    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }

    
}

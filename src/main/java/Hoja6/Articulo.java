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
public class Articulo {
    
    private String codigo;
    private String descripcion;
    private int existencias;
    
    public Articulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el código del producto");
        this.codigo = teclado.next();
        System.out.println("Introduce la decripcion del producto");
        this.descripcion = teclado.next();
        System.out.println("Introduce las existencias del producto");
        this.existencias = teclado.nextInt();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", existencias=" + existencias + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja6;

/**
 *
 * @author DAW107
 */
public class Almacén {
    
    private Articulo[] miTienda;
    
    public Almacén(int dimension){
        miTienda = new Articulo[dimension];
    }
    
    public void llenar(){
        for(int i = 0; i<miTienda.length; i++){
            miTienda[i] = new Articulo();
        }
    }
    
    public void mostrar(){
        for(Articulo item : miTienda){
            System.out.println(item.toString());
        }
    }
    
    public void pedidos(){
        Articulo[] menosDiez = new Articulo[miTienda.length];
        int inicio = 0;
        for(int i = 0; i<miTienda.length; i++){
            if(miTienda[i].getExistencias() < 10){
                menosDiez[inicio] = miTienda[i];
                inicio++;
            }
        }
        if(inicio>=1){
            for(int i = 0; i < inicio; i++){
                System.out.println(menosDiez[i]);
            }
        }else{
            System.out.println("No hay articulos con menos de diez existencias");
        }
    }
    
}

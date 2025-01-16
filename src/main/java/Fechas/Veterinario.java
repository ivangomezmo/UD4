/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

/**
 *
 * @author DAW107
 */
public class Veterinario {
    
    private Mascota[] mascotas;
    private int cuantas;
            
    public Veterinario(){
        mascotas = new Mascota[20];
        this.cuantas = 0;
    }
    
    public void añadir(Mascota mascota){
        mascotas[cuantas] = mascota;
        cuantas++;
    }
    
    public String mostrar(){
        String msg = "";
        for(int i = 0; i < cuantas; i++){
            msg+=mascotas[i].toString()+"\n";
        }
        return msg;
        
    }
    
    public String mostrarMayores(){
        String msg="";
        for(int i=0; i < cuantas; i++){
            if(mascotas[i].getEdad() > 5){
                msg+=mascotas[i].toString()+"\n";
            }
        }
        return msg;
    }
    
    public String buscarPorNombre(String nombre){
        for(int i = 0; i< cuantas; i++){
            if(mascotas[i].getNombre().equalsIgnoreCase(nombre)){
                return "Mascota encontrada:\n" + mascotas[i].toString();
            }
        }
        return "Mascota no encontrada -> " + nombre;
    }
    
}

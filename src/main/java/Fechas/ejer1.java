/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fechas;

/**
 *
 * @author DAW107
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Letra[] L1 = new Letra[3];
        int dimension = L1.length;
        System.out.println("");
        
        System.out.println("CREACIÓN DE LAS LETRAS");
        
        for(int i = 0; i < dimension; i++){
            L1[i] = new Letra();
            System.out.println("Se ha guardado la letra");
            L1[i].mostrar();
        }
        
        System.out.println("DATOS DE LAS LETRAS VENCIDAS");
        for(int i = 0; i < dimension; i++){
            if(L1[i].vencida()){
                L1[i].mostrar();
            }
        }
        
        System.out.println("Aplicamos un aplazamiento de 15 días");
        int aplazar = 15;
        
        for(int i = 0; i < dimension; i++){
            if(L1[i].vencida() && L1[i].devuelveMes() == 1){
                L1[i].demora(aplazar);
            }
        }
        
        System.out.println("LA SITUACION DE LAS LETRAS ACTUALMENTE");
        for(int i = 0; i < dimension; i++){
            L1[i].mostrar();
        }
        
        System.out.println("LOS DATOS DE LAS LETRAS NO VENCIDAS");
        for(int i = 0; i < dimension; i++){
            if(!L1[i].vencida()){
                System.out.println("El titular es -> " + L1[i].getTitular());
                System.out.println("\tLos días que faltan son -> " + L1[i].diasFaltan());
            }
        }
        
    }
    
}

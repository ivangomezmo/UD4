/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja4;

/**
 *
 * @author DAW107
 */
public class Tabla {
    
    private int[][] matriz = new int[4][5];
    
    public Tabla(){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                matriz[i][j] = (int) (Math.random()*100) + 1;
            }
        }
        
        System.out.println("Matriz creada correctamente");
    }
    
    public void mostrar(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public int mayorF(int nFila){
        int mayor = 0;
        for(int i = 0; i<matriz[0].length; i++){
            if(matriz[nFila-1][i] > mayor)
                mayor = matriz[nFila -1][i];
        }
        return mayor;
    }
    
    public int mayorC(int nColumna){
        int mayor = 0;
        for(int i = 0; i<matriz[0].length; i++){
            if(matriz[nColumna-1][i] > mayor)
                mayor = matriz[nColumna -1][i];
        }
        return mayor;
    }
    
}

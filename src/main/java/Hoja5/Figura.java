/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja5;

/**
 *
 * @author DAW107
 */
public class Figura {
    
    private char[][] matriz;
    private char letra;
    
    public Figura(char letra, int n){
        matriz = new char [n][n];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = letra;
            }
        }
    }
    
    public String cuadrado(){
        String msg = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = letra;
            }
            msg+="\n";
        }
        return msg;
    }
    
    public String cuadradoVacio(){
        String msg = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(i==0 || i==matriz.length -1){
                    matriz[i][j] = letra;
                    msg+=matriz[i][j];
                }else{
                    if(j==0 || j==matriz.length -1){
                        msg+=matriz[i][j];
                    }else{
                        msg+= " ";
                    }
                    
                }
                
            }
            msg+="\n";
        }
        return msg;
    }
    
    public String aspa(){
        String msg="";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(i==0 || i==matriz.length -1){
                    matriz[i][j] = letra;
                    msg+=matriz[i][j];
            }else{
                    if(i + j == matriz[0].length -1){
                        matriz[i][j] = letra;
                        msg+=matriz[i][j];
                    }else{
                        msg+= " ";
                        }
                    }
                }
            msg+="\n";
        }
        return msg;
    }
    
}

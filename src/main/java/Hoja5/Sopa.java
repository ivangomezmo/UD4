/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja5;

/**
 *
 * @author DAW107
 */
public class Sopa {
    
    private char[][] letras;
    
    public Sopa(){
        letras = new char[10][20];
        
        for(int i=0; i<letras.length; i++){
            for(int j=0; j<letras[0].length; j++){
                letras[i][j]= (char) (Math.floor(Math.random()*(90-65+1)+65));
            }
        }
    }
    
    public Sopa(int filas, int columnas){
        letras = new char[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                letras[i][j]= (char) (Math.floor(Math.random()*(90-65+1)+65));
            }
        }
    }
    
    public void mostrar(){
        for(int i=0; i<letras.length; i++){
            for(int j =0; j<letras[0].length; j++){
            System.out.print(letras[i][j]+" ");
        }
            System.out.println("");
        }
    }
    
    public void setPalabra(String palabra, int x, int y, int D){
        if(D==1){
            if(palabra.length() + y >letras.length){
                for(int i=0; i<palabra.length(); i++){
                    letras[x][y++] = palabra.charAt(i);
                    
                }
            }
        }else if(D==-1){
            if(palabra.length() + y >letras[x].length){
                for(int j=0; j<palabra.length(); j++){
                    letras[x++][y] = palabra.charAt(j);
                }
            }   
        }
    }
}

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
public class Banco {
    
    private Cliente[] clientes;
    private int contador;
    
    public Banco(int cuantos){
        this.clientes = new Cliente[cuantos];
        this.contador = 0;
        System.out.println("");
        
    }
    
    public void Ingresar(){
        
        if(contador < clientes.length){
            int codigo;
            String nombre, apellidos, telefono;
            double saldo;
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Vamos a dar de alta el usuario");
            codigo = (contador + 1);
            
            System.out.println("Introduce el nombre del usuario");
            nombre = teclado.nextLine();// se usa nextLine por si hubiera espacios en blanco en el nombre
            System.out.println("Introduce los apellidos del usuario");
            apellidos = teclado.nextLine();
            System.out.println("Introduce el telefono del usuario");
            telefono = teclado.nextLine();
            System.out.println("Introduce el saldo del usuario");
            saldo = teclado.nextDouble();
            
            Cliente cliente = new Cliente();
            
            cliente.setCodigo(codigo);
            cliente.setNombre(nombre);
            cliente.setApellidos(apellidos);
            cliente.setTelefono(telefono);
            cliente.setSaldo(saldo);
            
            clientes[contador] = cliente;
            contador++;
            System.out.println("Cliente creado correctamente");      
        }else{
            System.out.println("El usuario no se puede dar de alta");
        }
        
    }
    
    public String buscar(int codigo){
        String cadena = "";
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < contador) {
            if(clientes[i] !=null && clientes[i].getCodigo() == codigo){
                encontrado = true;
            }else{
                i++;
            }
        }
                if(encontrado){
                    cadena += "Codigo: " + clientes[i].getCodigo() + "\n"
                            + "Nombre: " + clientes[i].getNombre() + "\n"
                            + "Apellidos: " + clientes[i].getApellidos() + "\n"
                            + "Telefono: " + clientes[i].getTelefono() + "\n"
                            + "Saldo: " + clientes[i].getSaldo() + "\n";
            }
                
            else{
                System.out.println("No existe ese cliente en el banco");
            }
            return cadena;
    }
    
    public void eliminar(int codigo){
        boolean encontrado = false;
    int i = 0;
    while (!encontrado && i < contador){
        if (clientes[i] != null && clientes[i].getCodigo() == codigo){
            encontrado = true;
            
            for (int j = i; j < contador - 1; j++){
                clientes[contador - 1] = null;
                contador--;
            }
            
        }else{
            i++;
        }
        
        if(encontrado){
            System.out.println("El cliente ha sido eliminado");
        }else{
            System.out.println("No existe ese cliente en el banco");
        }
        
        }
    
    }
    
    public void mostrar(){
        if(contador>0){
            for(int i = 0; i < contador; i++){
                System.out.println(clientes[i].toString());
            }
        }else{
            System.out.println("No hay clientes registrados");
        }
    }
    
}

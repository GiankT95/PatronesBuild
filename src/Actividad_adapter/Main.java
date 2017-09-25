/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_adapter;

import static Actividad_adapter.Manejadorconstantes.comando;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fuller 101
 */
public class Main {
    public static void main(String[] args) {
     ImplDDservicios c=new ImplDDservicios();
          String mensaje="ejemplo de encriptado"; 
        char array[]=mensaje.toCharArray(); 
         
        for(int i=0;i<array.length;i++){ 
            array[i]=(char)(array[i]+(char)5); 
} 
        String encriptado =String.valueOf(array); 
        System.out.println(encriptado); 
         
        char arrayD[]=encriptado.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){ 
            arrayD[i]=(char)(arrayD[i]-(char)5); 
        } 
      String desencriptado =String.valueOf(arrayD); 
        System.out.println(desencriptado);   
    }
    
    
}

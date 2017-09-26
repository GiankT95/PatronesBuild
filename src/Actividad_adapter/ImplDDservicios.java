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


/**
 *
 * @author Ts
 */
public class ImplDDservicios implements DDservicios{

    public ImplDDservicios() {
    }

    @Override
    public String getserial() {
     
        String Serial=null;
        try {
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String line = null;
            
            while ((line = in.readLine()) != null) {
                String[] words = line.split(" ");
                for (String c : words) {
                    
                    if (!c.startsWith("Serial") || c.startsWith(" ")  ) {
                        Serial=c;
                        
                    } else {
                       
                    }
                }

            }
        
            System.out.println(Serial);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    return Serial;
    }
    @Override
    public String Serialencriptado(){
    String codigo=null;
    codigo=getserial();
    return encriptar(codigo);
    //return "hola";
    }
    
    public String Serialdesencriptado(){
    String codigo=null;
    codigo=getserial();
    return desencriptar(codigo);
    //return "hola";
    }
    @Override
    public String desencriptar(String encriptado){
    char arrayD[]=encriptado.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){ 
            arrayD[i]=(char)(arrayD[i]-(char)5); 
        } 
      String desencriptado =String.valueOf(arrayD); 
        return desencriptado;       
    }
    
    @Override
   public String encriptar(String mensaje){ 
  char array[]=mensaje.toCharArray(); 
         
        for(int i=0;i<array.length;i++){ 
            array[i]=(char)(array[i]+(char)5); 
} 
        String encriptado =String.valueOf(array); 
        return encriptado;
   }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_adapter;

import static Actividad_adapter.Manejadorconstantes.comando;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author Ts
 */
public class Serie {
public void serie(){
        ArrayList<String> serial = new ArrayList<>();
        String Serial=null;
        try {
            Process p = Runtime.getRuntime().exec(comando);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String line = null;
            
            while ((line = in.readLine()) != null) {
                String[] words = line.split(" ");
                for (String c : words) {
                    
                    if (line.startsWith("Serial") || line.startsWith(" ")  ) {
                        //System.out.println(c);
                    } else {
                        serial.add(c);
                    }
                }

            }
            for (String s : serial) {
                if(!s.startsWith(" "))
                {
                  Serial=s;  
                }
                
            }
            System.out.println(".."+Serial);
        } catch (IOException ioe) {
            System.out.println("--"+ioe);
        }

}      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_adapter;

/**
 *
 * @author Ts
 */
public interface DDservicios {
public abstract String getserial();  
public abstract String encriptar(String me);
public abstract String desencriptar(String me);
public abstract String Serialencriptado();
public abstract String Serialdesencriptado();
}

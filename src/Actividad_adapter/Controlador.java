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
public class Controlador {

    static Controlador instance = null;
    DDservicios serv = new Adaptador(new ImplDDservicios());

    public static Controlador instance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }

    public String encriptado() {
        return serv.Serialencriptado();
    }
     public String deseencriptado() {
        return serv.Serialdesencriptado();
    }
     

}

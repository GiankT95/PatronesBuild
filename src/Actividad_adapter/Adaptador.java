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
public class Adaptador implements DDservicios{
DDservicios inDDservicios;

    public Adaptador(DDservicios implDDservicios) {
        this.inDDservicios = inDDservicios;
    }

    @Override
    public String getserial() {
     return inDDservicios.getserial();
    }

    @Override
    public String encriptar(String me) {
     return inDDservicios.encriptar(me);
    }

    @Override
    public String Serialencriptado() {
    return inDDservicios.Serialencriptado();
    }

    @Override
    public String desencriptar(String me) {
    return inDDservicios.desencriptar(me);
    }

    @Override
    public String Serialdesencriptado() {
       return inDDservicios.Serialdesencriptado();
}

    
   

}

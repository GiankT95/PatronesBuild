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

    public Adaptador(DDservicios inDDservicios) {
        this.inDDservicios = inDDservicios;
    }

    @Override
    public String getserial() {
     return inDDservicios.getserial();
    }

}

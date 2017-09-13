/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;

/**
 *
 * @author Fuller 101
 */
public class Documentacion_enblanco extends Documentacion {

    public Documentacion_enblanco() {
    this.listaDocumentos= new ArrayList();
    }
    public void incluye(Documento d){
    this.listaDocumentos.add(d);
    }
    public void excluye(Documento d){
    this.listaDocumentos.remove(d);
    } 
    
}

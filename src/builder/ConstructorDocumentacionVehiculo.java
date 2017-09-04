/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Fuller 101
 */
public abstract class ConstructorDocumentacionVehiculo {
Documentacion doc;    
public abstract void construyesolicitudpedido(String cliente); 
public abstract void solicitudmatriculacion(String solicita);
public Documentacion  resultado(){
return doc;    
}
}

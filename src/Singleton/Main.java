/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Fuller 101
 */
public class Main {
public static void main(String[] args) {
    Documentacion_cliente doc= new Documentacion_cliente();
    doc.crea("Informacion del cliente.\n", Gestor_Documentos.instance().documentacionCompra());
    doc.crea("Informacion del cliente.\n", Gestor_Documentos.instance().documentaciondevolucion());
    doc.crea("Informacion del cliente.\n", Gestor_Documentos.instance().documentaciongarantia());
     
}    
}

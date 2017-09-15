/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Fuller 101
 */
public class Main {
public static void main(String[] args) {
    
Ordenpedido orden=new Ordenpedido();
Solicitudmatriculacion solicitud= new Solicitudmatriculacion();
CertificadoCesion certificado= new CertificadoCesion();

Documentacion_enblanco doc= new Documentacion_enblanco();

doc.incluye(orden);
doc.incluye(solicitud);
doc.incluye(certificado);

}    
}

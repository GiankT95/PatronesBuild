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
public class Gestor_Documentos {
private static Gestor_Documentos instance=null;
public static Gestor_Documentos instance(){
if(instance==null ){
instance=new Gestor_Documentos();

        
}  
return instance;
}
public Documentacion_enblanco documentacionCompra(){
Ordenpedido orden=new Ordenpedido();
Solicitudmatriculacion solicitud= new Solicitudmatriculacion();
CertificadoCesion certificado= new CertificadoCesion();

Documentacion_enblanco doc= new Documentacion_enblanco();

doc.incluye(orden);
doc.incluye(solicitud);
//doc.incluye(certificado);

return doc;
}

public Documentacion_enblanco documentaciongarantia(){
    
Solicitud_garantia garantia=new Solicitud_garantia();
Documentacion_enblanco doc= new Documentacion_enblanco();
doc.incluye(garantia);
return doc;    
}
public Documentacion_enblanco documentaciondevolucion(){

Solicitud_Devolucion devolucion=new Solicitud_Devolucion ();
Documentacion_enblanco doc= new Documentacion_enblanco();
doc.incluye(devolucion);
return doc;
}


}

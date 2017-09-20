/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Fuller 101
 */
public class Documento_Pdf implements Documento {
//String contenido;    

    Componente_Pdf herramientapdf;

    public Documento_Pdf(Componente_Pdf herramientapdf) {
        this.herramientapdf = herramientapdf;
    }

    @Override
    public void setcontenido(String contenido) {
        herramientapdf.pdffijacontenido(contenido);
    }

    @Override
    public void dibuja(String contenido) {
        herramientapdf.preparavisualizacion();
        herramientapdf.pdfrefresca();
        herramientapdf.finalizavisualizacion();
    }

    @Override
    public void imprimie() {
        herramientapdf.pdfenviaimpresora();
    }

}
/*






*/

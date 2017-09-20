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
public class Componente_Pdf {
    
public void pdffijacontenido(String contenido){
    System.out.println("fija contenido pdf");    
}
public void preparavisualizacion(){
    System.out.println("visualiza contenido pdf");    
}
public void pdfrefresca(){
    System.out.println("refresca contenido pdf");  
}
public void finalizavisualizacion(){
     System.out.println("visualiza contenido pdf"); 
}
public void pdfenviaimpresora(){
     System.out.println("imprime contenido pdf"); 
}
}

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
public class Main {
public static void main(String[] args) {
    
Documento cli1=new Documento_Pdf(new Componente_Pdf());
cli1.dibuja("dibuja");
cli1.imprimie();
cli1.setcontenido("contenido");
}    
}

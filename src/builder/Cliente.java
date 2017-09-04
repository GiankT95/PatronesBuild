/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;

/**
 *
 * @author Fuller 101
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ConstructorDocumentacionVehiculo constructor;
        Scanner sc=new Scanner(System.in);
        String x= sc.next();
    if(x.equals("htlm")){
    constructor=new ConstructorDocumentacionVehiculoHtml();
    }
    Vendedor vend =new Vendedor (constructor);
        }
    
}

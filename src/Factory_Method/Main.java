/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Method;

/**
 *
 * @author Fuller 101
 */
public class Main {
 public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente_contado("Jair",11111 );
        Cliente cliente2 = new Cliente_credito("Santiago",22222 );
        cliente1.creaPedido(1232);
        cliente2.creaPedido(4567);
 
    
        
    }    
}

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
        
        Cliente cliente1 = new Cliente_contado("Juan", 500000);
        Cliente cliente2 = new Cliente_credito("Mario", 200000);
        
 
        
    }    
}

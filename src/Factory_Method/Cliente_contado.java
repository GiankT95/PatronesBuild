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
public class Cliente_contado extends Cliente {
String cc;
    public Cliente_contado(String nombre, double dinero) {
        super(nombre, dinero);
        
    }

    @Override
    protected Pedido creaPedido(double cantidad) {
      return new Pedido_contado(cantidad);
  
    
    }
    
}

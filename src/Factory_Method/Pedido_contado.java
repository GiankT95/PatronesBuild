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
public class Pedido_contado extends Pedido {

    public Pedido_contado(double cantidad) {
        super(cantidad);
    }

    @Override
    protected void paga() {
     
    }

    @Override
    protected boolean valida() {
       return true;
    }
    

   
    
}

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
public abstract class Pedido {
protected double cantidad;

    public Pedido(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    protected abstract void paga();
protected abstract boolean valida(); 

}

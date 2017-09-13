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
public abstract  class Cliente {
    protected String nombre;
    protected double dinero;

    public Cliente(String nombre, double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return dinero;
    }

    public void setSaldo(double saldo) {
        this.dinero = saldo;
    }
    
public void nuevoPedido(double cantidad_pedido){
        
        System.out.println("Cliente:"+nombre+"Dinero:"+dinero);
        
        Pedido pedido = creaPedido(cantidad_pedido);
        
        if(pedido.valida()){
            pedido.paga();
        }        
    }   
    
    protected abstract Pedido creaPedido(double cantidad_pedido);      
    
}

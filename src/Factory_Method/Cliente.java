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
    
public void nuevoPedido(double montoPedido){
        
        System.out.println("Cliente: "+nombre+"     Saldo: $"+dinero);
        
        Pedido pedido = creaPedido(montoPedido);
        
        if(pedido.valida()){
            pedido.paga();
        }
        
        System.out.println("");
        
    }
    
    protected abstract Pedido creaPedido(double monto);

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
        
}

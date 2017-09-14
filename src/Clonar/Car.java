/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clonar;

/**
 *
 * @author Fuller 101
 */
public class Car implements Cloneable{
    private String marca;

    public Car(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
   
   public Object clone(){
   try{return super.clone();}
   catch(CloneNotSupportedException e)
   {return null;}
   }
    
}

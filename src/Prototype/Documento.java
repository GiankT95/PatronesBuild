/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Fuller 101
 */
public abstract class Documento implements Cloneable{
   
    
    public Object clone(){
   try{return super.clone();}
   catch(CloneNotSupportedException e)
   {return null;}
   }    
    
    public abstract void imprime();
}

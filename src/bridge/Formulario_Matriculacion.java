/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Fuller 101
 */
public abstract class Formulario_Matriculacion {
Formulario_Impl imp;

    public Formulario_Matriculacion(Formulario_Impl imp ) {
        this.imp = imp;
    }

 public void visualiza(){
     
 }
 protected abstract void  generadocuemnto();
 protected abstract void  administrazona();
 protected abstract void controlzona();

}

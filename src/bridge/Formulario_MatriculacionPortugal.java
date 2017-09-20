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
public class Formulario_MatriculacionPortugal extends Formulario_Matriculacion {

    public Formulario_MatriculacionPortugal(Formulario_Impl imp) {
        super(imp);
    }

    @Override
    protected void controlzona() {
    System.out.println("controla portugal");  
    }

    @Override
    protected void generadocuemnto() {
    System.out.println("documento portugal");     
    }

    @Override
    protected void administrazona() {
    System.out.println("administra portugal");
     imp.dibujatecto();
    }
    
}

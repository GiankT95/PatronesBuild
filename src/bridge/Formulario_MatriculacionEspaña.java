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
public class Formulario_MatriculacionEspaña extends Formulario_Matriculacion {

    public Formulario_MatriculacionEspaña(Formulario_Impl imp) {
        super(imp);
    }

    @Override
    protected void controlzona() {
        System.out.println("zona españa");
    
    }

    @Override
    protected void generadocuemnto() {
        System.out.println("documento españa");
           }

    @Override
    protected void administrazona() {
     System.out.println("administra españa");
     imp.dibujatecto();
    }
    
}

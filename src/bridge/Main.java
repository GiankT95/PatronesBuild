/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ts
 */
public class Main {
public static void main(String[] args) {
List<Formulario_Matriculacion> form= new ArrayList<>();
form.add(new Formulario_MatriculacionEspaña(new Formulario_Htlmimpl()));
form.add(new Formulario_MatriculacionEspaña(new Formulario_Appleimpl()));
form.add(new Formulario_MatriculacionPortugal(new Formulario_Htlmimpl()));
form.add(new Formulario_MatriculacionPortugal(new Formulario_Appleimpl()));
}    
}

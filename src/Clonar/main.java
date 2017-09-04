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
public class main {

    public static void main(String[] args) {
      
        EmployeeModel empl1 = new EmployeeModel("", "", "", "",new Car("toyota") );
      
        Car car2= empl1.getcar();
          car2.setMarca("ferrari");
        
        System.out.println(empl1.getcar().getMarca());
       System.out.println(car2.getMarca());
    }
}

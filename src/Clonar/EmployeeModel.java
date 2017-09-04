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
public final class EmployeeModel {
    
private  final String firstName;
private  final String lastName;
private  final String SSN;
private final String address;
private final Car car;

    public EmployeeModel(String firstName, String lastName, String SSN, String address, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.address = address;
        this.car=car;
    }
 

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }
    public Car getcar(){
    return (Car) car.clone();
    //return car;
    }

}

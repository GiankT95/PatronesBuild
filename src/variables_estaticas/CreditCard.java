/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables_estaticas;

/**
 *
 * @author Fuller 101
 */
public class CreditCard {
public static final String CC_DATA_FILE="CC.TXT";
public static final String VALID_CC_CHARS="01234578";
public static final String MASTER="MASTER";
public static final String VISA="VISA";
public static final String DISCOVER="DISCOVER";

    public static String getCC_DATA_FILE() {
        return CC_DATA_FILE;
    }

    public static String getVALID_CC_CHARS() {
        return VALID_CC_CHARS;
    }

    public static String getMASTER() {
        return MASTER;
    }

    public static String getVISA() {
        return VISA;
    }

    public static String getDISCOVER() {
        return DISCOVER;
    }
public void save(){
    
}    
}

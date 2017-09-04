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
public class Address {
public static final String ADRESS_DATA_FILE ="ADDRESS.TXT";
public static final int VALID_ST_LEN=2;
public static final String VALID_ZIP_CHARS ="0123456789"; 

    public static String getADRESS_DATA_FILE() {
        return ADRESS_DATA_FILE;
    }

    public static int getVALID_ST_LEN() {
        return VALID_ST_LEN;
    }

    public static String getVALID_ZIP_CHARS() {
        return VALID_ZIP_CHARS;
    }
public void save(){
    
} 
}

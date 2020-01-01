/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MY-PC
 */

public class MainClass {
    public static void main(String []args) throws SQLException{
        NewClass database= new NewClass();
        ArrayList  y=database.GetAllData();
        
        database.InsertData("Ra", "F", "fd", "dfd", "dfd", "dfdfs");
        
        
        
    
    }
    
}

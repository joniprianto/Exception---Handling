package latihanexceptionhandling;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class configDB {
    private static Connection mysqlConfig;
    
    public static Connection koneksi (){
        try {
            String url="jdbc:mysql://localhost/akademikdb";
            String user="root"; 
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e){
            System.err.print("gagal koneksi "+e.getMessage());
        }
        return mysqlConfig;
        
    } 
    public static boolean islogin=false;
}

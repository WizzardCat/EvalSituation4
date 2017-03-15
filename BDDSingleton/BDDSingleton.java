/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Formation
 */
public class BDDSingleton {
    
    private static final String DB_URL = "jdBc:mysql://localhost:3306/airafpa";
    private static final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "airafpa1";
    private static final String DB_PASSWORD = "blurp31";
    
    private Connection cn = null;
        
        
              
    
    private BDDSingleton() {
        
        try {
            Class.forName(BDDSingleton.DB_JDBC_DRIVER);
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.exit(1);
        } 
    }
    
    
    public static BDDSingleton getInstance() {
        return BddSingletonHolder.INSTANCE;
    }
    
    private static class BddSingletonHolder {

        private static final BDDSingleton INSTANCE = new BDDSingleton();
    }
    
    public boolean connect() {
        
        if (this.cn == null) {
            
            
            try {
                this.cn = DriverManager.getConnection(BDDSingleton.DB_URL, BDDSingleton.DB_USER, BDDSingleton.DB_PASSWORD);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }  
        }else {
                try {
                
                    Statement st = this.cn.createStatement();
                    String requete = "SELECT 1"; 
                    ResultSet rs = st.executeQuery(requete);
               
                } catch (SQLException ex) {
                     ex.printStackTrace();
                
                    try {
                        this.cn = DriverManager.getConnection(BDDSingleton.DB_URL, BDDSingleton.DB_USER, BDDSingleton.DB_PASSWORD);
                
                    } catch (SQLException ex1) {
                        ex1.printStackTrace();
                        return false;
                    } 
                
                }   
               
        } return true;       
        
    }
    
    public Connection getConnectonManager() {
        return this.cn;
    }
    
}


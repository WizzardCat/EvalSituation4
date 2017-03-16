/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;

import BDDSingleton.BDDSingleton;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public abstract class DAO<T,S> {
    
    protected BDDSingleton bddmanager = null;
     Connection connect = BDDSingleton.getInstance().connect;
    
     public DAO (){
        this.bddmanager = BDDSingleton.getInstance();
    }
    
    public abstract T create(T obj);
    // INSERT INTO
    
    public abstract T update(T obj);
    // Modify 
    
      
    public abstract void delete(S id);
    // supress
    
    
    public abstract T find(S id);
    // Select
    
    public abstract boolean isValid(T obj);
    // just in case to test all proprieties
    
    
    public abstract ArrayList<T>getAll();
    // Test the id if it exist
}
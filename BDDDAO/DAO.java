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
public abstract class DAO<T> {
    
    protected BDDSingleton bddmanager = null;
     Connection connect = BDDSingleton.getInstance().connect;
    
     public DAO (){
        this.bddmanager = BDDSingleton.getInstance();
    }
    
    public abstract boolean create(T obj);
    // INSERT INTO
    
    public abstract boolean update(T obj);
    // Modify 
    
    public abstract boolean read(T obj);
    // Select
    
    public abstract boolean delete(T obj);
    // supress
    
    
    public abstract T find(int id);
    
}
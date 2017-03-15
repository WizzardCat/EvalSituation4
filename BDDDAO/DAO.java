/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;

import BDDSingleton.BDDSingleton;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public abstract class DAO<T> {
    
    protected BDDSingleton bddmanager = null;
    
    public DAO (){
        this.bddmanager = BDDSingleton.getInstance();
    }
    
    public abstract boolean creer(T obj);
    // INSERT INTO
    
    public abstract boolean supprimer(T obj);
    // requete préparée
    public abstract ArrayList<T> getAll();
    
}
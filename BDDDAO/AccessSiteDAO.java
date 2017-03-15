/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;

import BDDAIRAFPA.AccessSite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Formation
 */
public class AccessSiteDAO extends DAO {
    
    public AccessSiteDAO() {
        super();
}

    @Override
    public boolean create(Object obj) {
       
        boolean success = false;
            
        
        if(this.bddmanager.connect()) {
      
            try {
                
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                PreparedStatement createst = this.connect.prepareStatement(
                "INSERT INTO AccessSite values(?,?,?)");
      
                createst.setInt(1,23);
                createst.setString(2,"Roshan");
                createst.setString(3, "CEO");
                createst.executeUpdate();
                String requete = "SELECT * FROM AccessSite";
                ResultSet rs = st.executeQuery(requete);
                rs.next();
                           
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }
        } else {
            return success;
        }
        
        return success;
        
            }

    @Override
    public boolean delete(Object obj) {
        return false;
    }

    @Override
    public AccessSite find(int id) {
        
       
        try {
            Statement st;
            st = this.bddmanager.getConnectonManager().createStatement();
            String requete = "SELECT * from accessite where id =id";
            ResultSet rs = st.executeQuery(requete);
            rs.next();
           
            AccessSite accesssites = new AccessSite();
            rs.getInt(1);
            rs.getString(requete);
                    
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
       return accesssites;
    }
    
    @Override
    public boolean update(Object obj) {
        boolean success = false;
                
        
        if(this.bddmanager.connect()) {
      
            try {
                
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                PreparedStatement updeatest = this.connect.prepareStatement(
                "ALTER TABLE AccessSite values(?,?,?)");
      
                updeatest.setInt(1,23);
                updeatest.setString(2," ");
                updeatest.setString(3, " ");
                updeatest.executeUpdate();
                
                Statement stmt = connect.createStatement();
                String query = "select * from AccessSite";
                ResultSet rs =  stmt.executeQuery(query);
                rs.next();
                
                
                                           
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }
        } else {
            return success;
        }
        
        return success;
        
            }


    @Override
    public boolean read(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}


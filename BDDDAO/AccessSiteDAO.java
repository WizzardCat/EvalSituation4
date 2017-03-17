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
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AccessSiteDAO extends DAO<AccessSite, Integer> {

    public AccessSiteDAO() {
        super();
    }

    @Override
    public AccessSite create(AccessSite obj) {
      
        AccessSite accessite = new AccessSite();

        if(this.bddmanager.connect()) {
        try {
            
            //Statement st = this.bddmanager.getConnectonManager().createStatement();
            PreparedStatement createst = this.bddmanager.getConnectonManager().prepareStatement("INSERT INTO Access_Site values(?,?,?)");

            
            createst.setInt(1, obj.getUser_id());
            createst.setString(2, obj.getNickname());
            createst.setString(3, obj.getPassword());
            createst.executeUpdate();
            
            
            accessite = this.find(obj.getUser_id());

        } catch (SQLException ex) {
            ex.printStackTrace();
           // return accessite;

        }
      }return accessite;
    }
    @Override
    public AccessSite update(AccessSite obj) {
        AccessSite accessite = new AccessSite();

        try {

            PreparedStatement updeatest = this.connect.prepareStatement("UPDATE Access_Site SET nickname = ?, password = ? WHERE user_id = ?");

            updeatest.setInt(3, obj.getUser_id());
            updeatest.setString(1, obj.getNickname());
            updeatest.setString(2, obj.getPassword());
            updeatest.executeUpdate();

            
            accessite = this.find(obj.getUser_id());

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return accessite;

    }

    @Override
    public AccessSite find(Integer id) {
        AccessSite accessite = new AccessSite();

        if (this.bddmanager.connect()){
       
            try {
            Statement st;
            st = this.bddmanager.getConnectonManager().createStatement();
            String requete = "SELECT * FROM access_site WHERE user_id = " + id;
            
            ResultSet rs = st.executeQuery(requete);
            if(rs.next()){
                accessite.setUser_id(rs.getInt("user_id"));
                accessite.setNickname(rs.getString("nickname"));
                accessite.setPassword(rs.getString("password"));
            };
            
            
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
            
        } else {
            return accessite;
            
        }   return accessite;
    }
    
    
    @Override

    public void delete(Integer id) {

        try {
            //Statement st = this.bddmanager.getConnectonManager().createStatement();
            PreparedStatement deletest = this.connect.prepareStatement("DELETE FROM access_site WHERE user_id = " + id);
            deletest.executeUpdate(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public boolean isValid(AccessSite obj) {
        if(obj.getUser_id() == -1 || obj.getNickname() == null || obj.getPassword() == null){
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<AccessSite> getAll() {
        
    ArrayList<AccessSite> listeAccessSite = new ArrayList<>();
      
        if(this.bddmanager.connect()) {
      
            try {
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                String requete = "SELECT * FROM Access_Site";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    AccessSite accessite = new AccessSite(rs.getInt("user_id"), rs.getString("nickname"), rs.getString("password"));
                    listeAccessSite.add(accessite);
                }
            
                } catch (SQLException ex) {
                ex.printStackTrace();
                return listeAccessSite;
             }
        } else {
            return listeAccessSite;
            
        }return listeAccessSite;
    }
    
}

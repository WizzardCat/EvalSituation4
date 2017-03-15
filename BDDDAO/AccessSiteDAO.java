/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;

import BDDAIRAFPA.AccessSite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AccessSiteDAO extends DAO {
    
    public AccessSiteDAO() {
        super();
}

    @Override
    public boolean creer(Object obj) {
       
        boolean success = false;
        AccessSite ass = (AccessSite) obj;
        
        if(this.bddmanager.connect()) {
      
            try {
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                String requete = "INSERT INTO AccessSite (id, nickname, password) VALUES (\" " + ass.getUser_id() + "\", \"" + ass.getNickname() + "\",  " + ass.getPassword() + ")";
                int resultat = st.executeUpdate(requete);
                
                if(resultat != 0) {
                    success = true;
                }
                
                            
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
    public boolean supprimer(Object obj) {
        return false;
    }

    @Override
    public ArrayList getAll() {
        ArrayList<AccessSite> listeAccessSite = new ArrayList<>();
      
        if(this.bddmanager.connect()) {
      
            try {
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                String requete = "SELECT * FROM eleves";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    AccessSite ass = new AccessSite(rs.getInt("id"), rs.getString("Nickname"), rs.getString("Password"));
                    listeAccessSite.add(ass);
                }
            
            } catch (SQLException ex) {
                ex.printStackTrace();
                return listeAccessSite;
            }
        } else {
            return listeAccessSite;
        }
      
        
        return listeAccessSite;
    }

    
    
    
}


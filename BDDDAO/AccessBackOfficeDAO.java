/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDDAO;




import BDDAIRAFPA.AccessBackOffice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AccessBackOfficeDAO extends DAO<AccessBackOffice, Long>{

	    public AccessBackOfficeDAO() {
        super();
    }

      
    //Override of my methods and application of my CRUD

    @Override
    public AccessBackOffice create(AccessBackOffice obj) { 
        
     AccessBackOffice accesbackoffice = new AccessBackOffice();

        if(this.bddmanager.connect()) {
        try {
            
    
            PreparedStatement createst = this.bddmanager.getConnectonManager().prepareStatement("INSERT INTO access_backoffice values(?,?,?)");

            
            createst.setLong(1, obj.getUser_id());
            createst.setString(2, obj.getNickname());
            createst.setString(3, obj.getPassword());
            createst.executeUpdate();
            
            accesbackoffice = this.find(obj.getUser_id());

        } catch (SQLException ex) {
            ex.printStackTrace();
          

        }
      }return accesbackoffice;
    }
    
    @Override
    public AccessBackOffice update(AccessBackOffice obj) {
        AccessBackOffice accesbackoffice = new AccessBackOffice();

        try {

            PreparedStatement updeatest = this.connect.prepareStatement("UPDATE access_backoffice SET nickname = ?, password = ? WHERE user_id = ?");

            updeatest.setLong(3, obj.getUser_id());
            updeatest.setString(1, obj.getNickname());
            updeatest.setString(2, obj.getPassword());
            updeatest.executeUpdate();

            accesbackoffice = this.find(obj.getUser_id());

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return accesbackoffice;

    }
    
    @Override
    public AccessBackOffice find(Long id) {
        AccessBackOffice accesbackoffice = new AccessBackOffice();

        if (this.bddmanager.connect()){
       
            try {
            Statement st;
            st = this.bddmanager.getConnectonManager().createStatement();
            String requete = "SELECT * FROM access_backoffice WHERE user_id = " + id;
            
            ResultSet rs = st.executeQuery(requete);
            if(rs.next()){
                accesbackoffice.setUser_id(rs.getInt("user_id"));
                accesbackoffice.setNickname(rs.getString("nickname"));
                accesbackoffice.setPassword(rs.getString("password"));
            };
            
            
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
            
        } else {
            return accesbackoffice;
            
        }   return accesbackoffice;
    }

    @Override
    public void delete(Long id) {

        try {
        
            PreparedStatement deletest = this.connect.prepareStatement("DELETE FROM access_backoffice WHERE user_id = " + id);
            deletest.executeUpdate(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    

    @Override
    public boolean isValid(AccessBackOffice obj) {
        if(obj.getUser_id() == -1 || obj.getNickname() == null || obj.getPassword() == null){
            return false;
        }
        return true;
    }

   @Override
    public ArrayList<AccessBackOffice> getAll() {
        
    ArrayList<AccessBackOffice> listeAccessSiteBackOffice = new ArrayList<>();
      
        if(this.bddmanager.connect()) {
      
            try {
                Statement st = this.bddmanager.getConnectonManager().createStatement();
                String requete = "SELECT * FROM access_backoffice";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    AccessBackOffice accesbackoffice = new AccessBackOffice(rs.getInt("user_id"), rs.getString("nickname"), rs.getString("password"));
                    listeAccessSiteBackOffice.add(accesbackoffice);
                }
            
                } catch (SQLException ex) {
                ex.printStackTrace();
                return listeAccessSiteBackOffice;
             }
        } else {
            return listeAccessSiteBackOffice;
            
        }return listeAccessSiteBackOffice;
    }
    
}

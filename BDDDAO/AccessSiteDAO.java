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
public class AccessSiteDAO extends DAO<AccessSite, Integer> {

    public AccessSiteDAO() {
        super();
    }

    @Override
    public AccessSite create(AccessSite obj) {
        AccessSite accessite = new AccessSite();

        try {

            Statement st = this.bddmanager.getConnectonManager().createStatement();
            PreparedStatement createst = this.connect.prepareStatement("INSERT INTO AccessSite values(?,?,?)", Statement.RETURN_GENERATED_KEYS);

            createst.setString(2, " ");
            createst.setString(3, " ");
            createst.executeUpdate();
            ResultSet keys = createst.getGeneratedKeys();
            keys.next();
            int key = keys.getInt(1);
            accessite = this.find(key);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return accessite;

        }
        return accessite;
    }

    @Override
    public AccessSite update(AccessSite obj) {
        AccessSite accessite = new AccessSite();

        try {

            PreparedStatement updeatest = this.connect.prepareStatement("ALTER TABLE AccessSite values(?,?,?)", Statement.RETURN_GENERATED_KEYS);

            updeatest.setInt(1, 23);
            updeatest.setString(2, " ");
            updeatest.setString(3, " ");
            updeatest.executeUpdate();

            ResultSet keys = updeatest.getGeneratedKeys();
            keys.next();
            int key = keys.getInt(1);
            accessite = this.find(key);

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
            String requete = "SELECT * from accessite where id = ?";
            PreparedStatement stSuppr = this.bddmanager.getConnectonManager().prepareStatement(requete);
            stSuppr.setInt(1, id);
            ResultSet rs = st.executeQuery(requete);
            rs.next();
            accessite.setUser_id(rs.getInt("user_id"));
            accessite.setNickname(rs.getString("nickname"));
            accessite.setPassword(rs.getString("password"));
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


         }return accessite;
    }
    @Override

    public void delete(Integer id) {

        try {
            Statement st;
            st = this.bddmanager.getConnectonManager().createStatement();
            PreparedStatement deletest = this.connect.prepareStatement("ALTER TABLE AccessSite values(?,?,?)");
            String requete = "SELECT * from accessite where id =id";
            deletest.executeUpdate(requete); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}

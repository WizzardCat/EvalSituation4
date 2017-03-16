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

            createst.setString(2, "Roshan");
            createst.setString(3, "CEO");
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

            Statement st = this.bddmanager.getConnectonManager().createStatement();
            PreparedStatement updeatest = this.connect.prepareStatement(
                    "ALTER TABLE AccessSite values(?,?,?)");

            updeatest.setInt(1, 23);
            updeatest.setString(2, " ");
            updeatest.setString(3, " ");
            updeatest.executeUpdate();

            Statement stmt = connect.createStatement();
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
    public AccessSite delete(Integer id) {
        AccessSite accessite = new AccessSite();

        return accessite;
    }

    @Override
    public AccessSite find(Integer id) {
        AccessSite accessite = new AccessSite();

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

        return accessite;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalsituation4;

import BDDAIRAFPA.AccessSite;
import BDDDAO.AccessSiteDAO;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class EvalSituation4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AccessSiteDAO assDAO = new AccessSiteDAO();
        
        /*AccessSite komaji = new AccessSite(31, "Komaji", "bubup");
        boolean resultat = assDAO.create(komaji);

        System.out.println();
        System.out.println(resultat);

        ArrayList<AccessSite> listeAccessSite = assDAO.find();
        System.out.println();
        System.out.println("Il y a " + listeAccessSite.size() + " élèves dans cette école");
        System.out.println();

        for (AccessSite ass : listeAccessSite) {
            System.out.println("Identifiant " + ass.getUser_id() + " Nickname " + ass.getNickname() + " Password " + ass.getPassword());

        }*/

    }
}

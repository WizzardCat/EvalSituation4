/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDAIRAFPA;

/**
 *
 * @author Formation
 */
public class Airports {
    
    private String aita;
    private String city;
    private String country;

    public Airports(String aita, String city, String country) {
        this.aita = aita;
        this.city = city;
        this.country = country;
    }

    public String getAita() {
        return aita;
    }

    public void setAita(String aita) {
        this.aita = aita;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
}

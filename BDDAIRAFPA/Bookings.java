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
public class Bookings {
   private int id;
   private int user_id;
   private int flight_id;
   private int place;

    public Bookings(int id, int user_id, int flight_id, int place) {
        this.id = id;
        this.user_id = user_id;
        this.flight_id = flight_id;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Bookings{" + "id=" + id + ", user_id=" + user_id + ", flight_id=" + flight_id + ", place=" + place + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + this.user_id;
        hash = 71 * hash + this.flight_id;
        hash = 71 * hash + this.place;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bookings other = (Bookings) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.flight_id != other.flight_id) {
            return false;
        }
        if (this.place != other.place) {
            return false;
        }
        return true;
    }
 
   
   
   
   
   
}

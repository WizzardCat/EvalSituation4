/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDAIRAFPA;

import java.util.Objects;

/**
 *
 * @author Formation
 */
public class Flights {
    private int id;
    private String departing_aita;
    private String arrival_aita;
    private String departing_hour;
    private int duration;
    private Double price;
    private int id_pilot;
    private int id_copilot;
    private int id_staff1;
    private int id_staff2;
    private int id_staff3;
    private int planned;

    public Flights(int id, String departing_aita, String arrival_aita, String departing_hour, int duration, Double price, int id_pilot, int id_copilot, int id_staff1, int id_staff2, int id_staff3, int planned) {
        this.id = id;
        this.departing_aita = departing_aita;
        this.arrival_aita = arrival_aita;
        this.departing_hour = departing_hour;
        this.duration = duration;
        this.price = price;
        this.id_pilot = id_pilot;
        this.id_copilot = id_copilot;
        this.id_staff1 = id_staff1;
        this.id_staff2 = id_staff2;
        this.id_staff3 = id_staff3;
        this.planned = planned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparting_aita() {
        return departing_aita;
    }

    public void setDeparting_aita(String departing_aita) {
        this.departing_aita = departing_aita;
    }

    public String getArrival_aita() {
        return arrival_aita;
    }

    public void setArrival_aita(String arrival_aita) {
        this.arrival_aita = arrival_aita;
    }

    public String getDeparting_hour() {
        return departing_hour;
    }

    public void setDeparting_hour(String departing_hour) {
        this.departing_hour = departing_hour;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId_pilot() {
        return id_pilot;
    }

    public void setId_pilot(int id_pilot) {
        this.id_pilot = id_pilot;
    }

    public int getId_copilot() {
        return id_copilot;
    }

    public void setId_copilot(int id_copilot) {
        this.id_copilot = id_copilot;
    }

    public int getId_staff1() {
        return id_staff1;
    }

    public void setId_staff1(int id_staff1) {
        this.id_staff1 = id_staff1;
    }

    public int getId_staff2() {
        return id_staff2;
    }

    public void setId_staff2(int id_staff2) {
        this.id_staff2 = id_staff2;
    }

    public int getId_staff3() {
        return id_staff3;
    }

    public void setId_staff3(int id_staff3) {
        this.id_staff3 = id_staff3;
    }

    public int getPlanned() {
        return planned;
    }

    public void setPlanned(int planned) {
        this.planned = planned;
    }

    @Override
    public String toString() {
        return "Flights{" + "id=" + id + ", departing_aita=" + departing_aita + ", arrival_aita=" + arrival_aita + ", departing_hour=" + departing_hour + ", duration=" + duration + ", price=" + price + ", id_pilot=" + id_pilot + ", id_copilot=" + id_copilot + ", id_staff1=" + id_staff1 + ", id_staff2=" + id_staff2 + ", id_staff3=" + id_staff3 + ", planned=" + planned + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.departing_aita);
        hash = 97 * hash + Objects.hashCode(this.arrival_aita);
        hash = 97 * hash + Objects.hashCode(this.departing_hour);
        hash = 97 * hash + this.duration;
        hash = 97 * hash + Objects.hashCode(this.price);
        hash = 97 * hash + this.id_pilot;
        hash = 97 * hash + this.id_copilot;
        hash = 97 * hash + this.id_staff1;
        hash = 97 * hash + this.id_staff2;
        hash = 97 * hash + this.id_staff3;
        hash = 97 * hash + this.planned;
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
        final Flights other = (Flights) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.duration != other.duration) {
            return false;
        }
        if (this.id_pilot != other.id_pilot) {
            return false;
        }
        if (this.id_copilot != other.id_copilot) {
            return false;
        }
        if (this.id_staff1 != other.id_staff1) {
            return false;
        }
        if (this.id_staff2 != other.id_staff2) {
            return false;
        }
        if (this.id_staff3 != other.id_staff3) {
            return false;
        }
        if (this.planned != other.planned) {
            return false;
        }
        if (!Objects.equals(this.departing_aita, other.departing_aita)) {
            return false;
        }
        if (!Objects.equals(this.arrival_aita, other.arrival_aita)) {
            return false;
        }
        if (!Objects.equals(this.departing_hour, other.departing_hour)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

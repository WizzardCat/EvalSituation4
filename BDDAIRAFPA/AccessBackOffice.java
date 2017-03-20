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
public class AccessBackOffice {
    
   private long user_id = -1;
   private String nickname;
   private String password;

    public AccessBackOffice(long user_id, String nickname, String password) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.password = password;
    }
    
    // Empty constructor
    
    public AccessBackOffice (){
        
    }
    
    // Getters & Setters
    
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Modified override of my methods
    
    @Override
    public String toString() {
        return "AccessBackOffice{" + "user_id=" + user_id + ", nickname=" + nickname + ", password=" + password + '}';
    }

   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.user_id);
        hash = 37 * hash + Objects.hashCode(this.nickname);
        hash = 37 * hash + Objects.hashCode(this.password);
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
        final AccessBackOffice other = (AccessBackOffice) obj;
        if (this.user_id != other.user_id) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

   
    
}

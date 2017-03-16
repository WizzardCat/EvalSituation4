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
public class RolesRights {
    
    private int user_id;
    private int admin;
    private int blocked;

    public RolesRights(int user_id, int admin, int blocked) {
        this.user_id = user_id;
        this.admin = admin;
        this.blocked = blocked;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "RolesRights{" + "user_id=" + user_id + ", admin=" + admin + ", blocked=" + blocked + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.user_id;
        hash = 83 * hash + this.admin;
        hash = 83 * hash + this.blocked;
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
        final RolesRights other = (RolesRights) obj;
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.admin != other.admin) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        return true;
    }
    
    
    
}

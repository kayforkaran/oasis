package com.nams.kay.oasis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import static org.junit.Assert.assertEquals;
//import role;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String passwordHash;
    private String phoneNumber;
    private UserRole role;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    
    public void setRole(UserRole role) {
    	this.role = role;
    }
    
    public UserRole getRole() {
    	return this.role;
    }
    
    public void setPasswordHash(String passwordHash) {
    	this.passwordHash = passwordHash;
    }
    
    public String getPasswordHash() {
    	return this.passwordHash;
    }
}

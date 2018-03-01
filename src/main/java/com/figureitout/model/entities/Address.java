package com.figureitout.model.entities;
// Generated 1 mars 2018 16:29:03 by Hibernate Tools 4.3.1



/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String line1;
     private String line2;
     private String zipCode;
     private String city;
     private String country;

    public Address() {
    }

	
    public Address(User user) {
        this.user = user;
    }
    public Address(User user, String line1, String line2, String zipCode, String city, String country) {
       this.user = user;
       this.line1 = line1;
       this.line2 = line2;
       this.zipCode = zipCode;
       this.city = city;
       this.country = country;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getLine1() {
        return this.line1;
    }
    
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getLine2() {
        return this.line2;
    }
    
    public void setLine2(String line2) {
        this.line2 = line2;
    }
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }




}



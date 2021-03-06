package com.figureitout.model.entities;
// Generated 1 mars 2018 16:29:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer id;
     private Shippinginfo shippinginfo;
     private User user;
     private String date;
     private String status;
     private Set transactions = new HashSet(0);
     private Set lineorders = new HashSet(0);

    public Orders() {
    }

	
    public Orders(Shippinginfo shippinginfo, User user) {
        this.shippinginfo = shippinginfo;
        this.user = user;
    }
    public Orders(Shippinginfo shippinginfo, User user, String date, String status, Set transactions, Set lineorders) {
       this.shippinginfo = shippinginfo;
       this.user = user;
       this.date = date;
       this.status = status;
       this.transactions = transactions;
       this.lineorders = lineorders;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Shippinginfo getShippinginfo() {
        return this.shippinginfo;
    }
    
    public void setShippinginfo(Shippinginfo shippinginfo) {
        this.shippinginfo = shippinginfo;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Set transactions) {
        this.transactions = transactions;
    }
    public Set getLineorders() {
        return this.lineorders;
    }
    
    public void setLineorders(Set lineorders) {
        this.lineorders = lineorders;
    }




}



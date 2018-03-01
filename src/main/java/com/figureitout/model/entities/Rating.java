package com.figureitout.model.entities;
// Generated 1 mars 2018 16:29:03 by Hibernate Tools 4.3.1



/**
 * Rating generated by hbm2java
 */
public class Rating  implements java.io.Serializable {


     private Integer id;
     private Item item;
     private User user;
     private Integer rate;

    public Rating() {
    }

	
    public Rating(Item item, User user) {
        this.item = item;
        this.user = user;
    }
    public Rating(Item item, User user, Integer rate) {
       this.item = item;
       this.user = user;
       this.rate = rate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getRate() {
        return this.rate;
    }
    
    public void setRate(Integer rate) {
        this.rate = rate;
    }




}



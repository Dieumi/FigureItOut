package com.figureitout.model.entities;
// Generated 1 mars 2018 16:29:03 by Hibernate Tools 4.3.1



/**
 * Lineorder generated by hbm2java
 */
public class Lineorder  implements java.io.Serializable {


     private Integer id;
     private Item item;
     private Orders orders;
     private Integer quantity;
     private Integer price;

    public Lineorder() {
    }

	
    public Lineorder(Item item, Orders orders) {
        this.item = item;
        this.orders = orders;
    }
    public Lineorder(Item item, Orders orders, Integer quantity, Integer price) {
       this.item = item;
       this.orders = orders;
       this.quantity = quantity;
       this.price = price;
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
    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }




}


package com.figureitout.model.entities;
// Generated 1 mars 2018 16:29:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private Integer id;
     private Supplier supplier;
     private String name;
     private String description;
     private Integer price;
     private Integer quantity;
     private Integer priceModifier;
     private Boolean deleted;
     private Set categories = new HashSet(0);
     private Set comments = new HashSet(0);
     private Set ratings = new HashSet(0);
     private Set lineorders = new HashSet(0);
     private Set linestocks = new HashSet(0);
     private Set linecarts = new HashSet(0);

    public Item() {
    }

	
    public Item(Supplier supplier) {
        this.supplier = supplier;
    }
    public Item(Supplier supplier, String name, String description, Integer price, Integer quantity, Integer priceModifier, Boolean deleted, Set categories, Set comments, Set ratings, Set lineorders, Set linestocks, Set linecarts) {
       this.supplier = supplier;
       this.name = name;
       this.description = description;
       this.price = price;
       this.quantity = quantity;
       this.priceModifier = priceModifier;
       this.deleted = deleted;
       this.categories = categories;
       this.comments = comments;
       this.ratings = ratings;
       this.lineorders = lineorders;
       this.linestocks = linestocks;
       this.linecarts = linecarts;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getPriceModifier() {
        return this.priceModifier;
    }
    
    public void setPriceModifier(Integer priceModifier) {
        this.priceModifier = priceModifier;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }
    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
    public Set getRatings() {
        return this.ratings;
    }
    
    public void setRatings(Set ratings) {
        this.ratings = ratings;
    }
    public Set getLineorders() {
        return this.lineorders;
    }
    
    public void setLineorders(Set lineorders) {
        this.lineorders = lineorders;
    }
    public Set getLinestocks() {
        return this.linestocks;
    }
    
    public void setLinestocks(Set linestocks) {
        this.linestocks = linestocks;
    }
    public Set getLinecarts() {
        return this.linecarts;
    }
    
    public void setLinecarts(Set linecarts) {
        this.linecarts = linecarts;
    }




}



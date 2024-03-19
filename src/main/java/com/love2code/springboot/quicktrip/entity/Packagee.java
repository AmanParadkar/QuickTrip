package com.love2code.springboot.quicktrip.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="packages")
public class Packagee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "user_id") // Assuming this column exists in your packages table
    private Users user;

    public Packagee() {
    }
    

    public Packagee(int id, String name, String description, BigDecimal price, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo = photo;
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    


    @Override
    public String toString() {
        return "Packagee [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
                + ", photo=" + photo + ", agent=" + "]";
    }
    
    
    
}

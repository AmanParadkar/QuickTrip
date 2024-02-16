package com.love2code.springboot.quicktrip.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="package")
public class Packagee {

    @Id
    @Column(name="package_id")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="description")
    private String description;

    @Column(name="photo")
    private String photos;

    @OneToMany(mappedBy = "packageId", cascade = CascadeType.ALL)
    private List<Review> reviews;


    public Packagee() {
    }

    
    
    public Packagee(int id, String description, String photos, List<Review> reviews) {
        this.id = id;
        this.description = description;
        this.photos = photos;
        this.reviews = reviews;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }



    public List<Review> getReviews() {
        return reviews;
    }



    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }



    @Override
    public String toString() {
        return "Packagee [id=" + id + ", description=" + description + ", photos=" + photos + ", reviews=" + reviews
                + "]";
    }

    
    
}

package com.love2code.springboot.quicktrip.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="review")
public class Review {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="review_desc")
    private String reviewDesc;

    //@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id")
	private int packageId;

	//@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private int userId;

    public Review() {
    }

    public Review(int id, String reviewDesc, int packageId, int userId) {
        this.id = id;
        this.reviewDesc = reviewDesc;
        this.packageId = packageId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewDesc() {
        return reviewDesc;
    }

    public void setReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int user) {
        this.userId = user;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", reviewDesc=" + reviewDesc + ", packageId=" + packageId + ", userId=" + userId
                + "]";
    }
}

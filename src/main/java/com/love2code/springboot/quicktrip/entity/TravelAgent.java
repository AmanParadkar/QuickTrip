package com.love2code.springboot.quicktrip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="travel_agent")
public class TravelAgent {
    
    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "package_id")
    private Integer packageId; // Integer instead of int to allow null values

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Packagee packagee;

    public TravelAgent() {
    }

    // Getters and setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Packagee getPackagee() {
        return packagee;
    }

    public void setPackagee(Packagee packagee) {
        this.packagee = packagee;
    }

    @Override
    public String toString() {
        return "TravelAgent [userId=" + userId + ", packageId=" + packageId + ", user=" + user + ", packagee="
                + packagee + "]";
    }

    
}

package com.love2code.springboot.quicktrip.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
    
    @Id
    @Column(name="booking_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="no_of_guests")
    private int noOfGuests;
    
    //@ManyToOne
    @JoinColumn(name="user_id")
    private int userId;

    //@ManyToOne
    @JoinColumn(name="package_id")
    private int packageId;
    
    @Column(name="booking_date")
    private LocalDateTime bookingDate;

    public Booking() {
    }

    public Booking(int id, int noOfGuests, int userId, int packageId, LocalDateTime bookingDate) {
        this.id = id;
        this.noOfGuests = noOfGuests;
        this.userId = userId;
        this.packageId = packageId;
        this.bookingDate = bookingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnoOfGuests() {
        return noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", NoOfGuests=" + noOfGuests + ", userId=" + userId + ", packageId=" + packageId
                + ", bookingDate=" + bookingDate + "]";
    }

    
}

package com.love2code.springboot.quicktrip.service;

import java.util.List;

import com.love2code.springboot.quicktrip.entity.Booking;
import com.love2code.springboot.quicktrip.entity.Packagee;
import com.love2code.springboot.quicktrip.entity.Review;
import com.love2code.springboot.quicktrip.entity.Users;

public interface QuicktripService {

    // for user
	public void saveUser(Users theUser);
	
	public List<Users> findUser();
	
	public Users findByIdUser(int theId);
	
	public void DeleteByIdUser(int theId);

    //for package

    
	
	public List<Packagee> findPackage();
	
	public void savePackage(Packagee thePackage);

	public Packagee findByIdPackage(int theId);

	public void DeleteByIdPackage(int theId);

	//for review//////////////////

	public List<Review> findReview();

	public Review writeReviewForPackage(int userId,int packageId,Review review);

	// for booking

	public Booking createBooking(int userId,int packageId,Booking booking);
	
} 

package com.love2code.springboot.quicktrip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.love2code.springboot.quicktrip.dao.BookingRepository;

import com.love2code.springboot.quicktrip.dao.PackageRepository;
import com.love2code.springboot.quicktrip.dao.ReviewRepository;
import com.love2code.springboot.quicktrip.dao.UserRepository;
import com.love2code.springboot.quicktrip.entity.Booking;

import com.love2code.springboot.quicktrip.entity.Packagee;
import com.love2code.springboot.quicktrip.entity.Review;
import com.love2code.springboot.quicktrip.entity.Users;


@Service
public class QuicktripServiceImpl implements QuicktripService{

    private UserRepository userRepository;
    private PackageRepository packageRepository;
    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
  

    @Autowired
    public QuicktripServiceImpl(UserRepository theuserRepository,
                                PackageRepository thePackageRepository, 
                                ReviewRepository theReviewRepository,
                                BookingRepository theBookingRepository
                              ) {
        userRepository = theuserRepository;
        packageRepository = thePackageRepository;
        reviewRepository = theReviewRepository;
        bookingRepository = theBookingRepository;
        
    }

    /////// for users
    @SuppressWarnings("null")
    @Override
    @Transactional
    public void saveUser(Users user) {
            userRepository.save(user);
    }

    @Override
    public List<Users> findUser() {
        
        return userRepository.findAll();
    }

    @Override
    public Users findByIdUser(int theId) {
        
        Optional<Users> result = userRepository.findById(theId);
		
		Users theUser =null;
		if(result.isPresent()) {
			theUser = result.get();
		}
		else
		{
			//we didn't find the employee
			throw new RuntimeException("Did not find user id - "+ theId);
		}
		return theUser;
    }

    @Override
    public void DeleteByIdUser(int theId) {
        
        userRepository.deleteById(theId);
    }

    //////////////////////////////////////////////////////// for package

   
    @Override
    public List<Packagee> findPackage() {
       
        return packageRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    @Transactional
    public void savePackage(Packagee thePackage) {
        
        packageRepository.save(thePackage);
    } 

    @Override
    public Packagee findByIdPackage(int theId) {
        
        Optional<Packagee> result = packageRepository.findById(theId);
		
		Packagee thePackagee =null;
		if(result.isPresent()) {
			thePackagee = result.get();
		}
		else
		{
			//we didn't find the employee
			throw new RuntimeException("Did not find package id - "+ theId);
		}
		return thePackagee;
    }
    // @Override  
    // public Packagee findByIdPackage(int packageId) {
    //     return packageRepository.findById(packageId).orElse(null);
    // }

    @Override
    public void DeleteByIdPackage(int theId) {
        packageRepository.deleteById(theId);
    }

    // for review//////////////////////

    public List<Review> findReview()
    {
        return (List<Review>) reviewRepository.findAll();
    }
    
    public Review writeReviewForPackage(int userId,int packageId,Review reviewDesc)
    {
        Optional<Users> userOptional = userRepository.findById(userId);
        Optional<Packagee> packageOptional = packageRepository.findById(packageId);

        if (userOptional.isPresent() && packageOptional.isPresent()) {
            Users user = userOptional.get();
            Packagee packagee = packageOptional.get();


            // Step 2: Create a new Review entity and set its properties
            Review review = new Review();
            review.setReviewDesc(reviewDesc.getReviewDesc());
            review.setUserId(user.getId());
            review.setPackageId(packagee.getId());

            // Step 3: Save the new Review entity to the repository
            return reviewRepository.save(review);
        } else {
            throw new RuntimeException("User or Package not found with provided IDs");
        }

    }

    @Override
    public Booking createBooking(int userId,int packageId,Booking booking) {
        
        Optional<Users> userOptional = userRepository.findById(userId);
    Optional<Packagee> packageOptional = packageRepository.findById(packageId);

    if (userOptional.isPresent() && packageOptional.isPresent()) {
        Users user = userOptional.get();
        Packagee packagee = packageOptional.get();

        // Set the user and package in the provided booking request object
        booking.setUserId(user.getId());
        booking.setPackageId(packagee.getId());

        // Save the new Booking entity to the repository
        return bookingRepository.save(booking);
    } else {
        throw new RuntimeException("User or Package not found with provided IDs");
    }
    }
    

}

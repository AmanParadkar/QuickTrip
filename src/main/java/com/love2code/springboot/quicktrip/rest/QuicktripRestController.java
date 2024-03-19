package com.love2code.springboot.quicktrip.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love2code.springboot.quicktrip.entity.Booking;
import com.love2code.springboot.quicktrip.entity.Packagee;
import com.love2code.springboot.quicktrip.entity.Review;
import com.love2code.springboot.quicktrip.entity.Users;

import com.love2code.springboot.quicktrip.service.QuicktripService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/quicktrip")
public class QuicktripRestController {
	
	
	 private QuicktripService quicktripService = null;

	@Autowired
	public void YourController(QuicktripService quicktripService) {
	     this.quicktripService = quicktripService;
	}

    //private  QuicktripService quicktripService;
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
    
    ///////////FOR USERS/////////////////////// 

    @GetMapping("/users")
    public List<Users> getUser()
    {
        return quicktripService.findUser();
    }

    @PostMapping("/users-register")
    public Users SaveUser(@RequestBody Users theUser) {
        
        theUser.setId(0);
        quicktripService.saveUser(theUser);
        return theUser;
    }

    @PutMapping("/users-update")
	public Users updateUser(@RequestBody Users theUser)
	{
		quicktripService.saveUser(theUser);
		return theUser;
	}
	
	@DeleteMapping("/users/{userId}")
	public String DeleteByIdUser(@PathVariable int userId)
	{
	    Users tempUser = quicktripService.findByIdUser(userId);
		
		if(tempUser == null)
		{
			throw new RuntimeException("User id not found -"+ userId);
		}
		
		quicktripService.DeleteByIdUser(userId);
		return "Delete user id - "+ userId;
				
	}

    // register as admin
    @PostMapping("/agent-register")
    public Users postMethodName(@RequestBody Users users) {
        users.setId(0);
        quicktripService.saveUser(users);
        return users; 
        
    }
    





    
    /////////////////FOR PACKAGE//////////////////////////////////////////////////

    @GetMapping("/package")
    public List<Packagee> getPackage() {
        return quicktripService.findPackage();
    }
    
    @PostMapping("/package")
    public Packagee savePackage(@RequestBody Packagee thePackage) {
      
        quicktripService.savePackage(thePackage);
        return thePackage;
    }

    @PutMapping("/package")
	public Packagee updatePackagee(@RequestBody Packagee thePackagee)
	{
		quicktripService.savePackage(thePackagee); 
		return thePackagee;
	}

    @DeleteMapping("/package/{packageId}")
	public String DeleteByIdPackage(@PathVariable int packageId)
	{
	    Packagee tempPackage = quicktripService.findByIdPackage(packageId);
		
		if(tempPackage == null)
		{
			throw new RuntimeException("User id not found -"+ packageId);
		}
		
		quicktripService.DeleteByIdPackage(packageId);
		return "Delete user id - "+ packageId;
				
	}

    //////////for review//////////////////////////
    

    @GetMapping("/review")
    public List<Review> getReviews()
    {
        return quicktripService.findReview();
    }

    @PostMapping("/write-review/{userId}/{packageId}")
    public Review writeReviewForPackage(
            @PathVariable int userId,
            @PathVariable int packageId,
            @RequestBody Review review
    ) {
        return quicktripService.writeReviewForPackage(userId, packageId, review);
    }


    //for booking/////

    @PostMapping("/create-booking/{userId}/{packageId}")
    public Booking createBooking(
            @PathVariable int userId,
            @PathVariable int packageId,
            @NonNull @RequestBody Booking booking
    ) {
        // Set the userId and packageId in the booking object
        booking.setUserId(userId);
        booking.setPackageId(packageId);

        return quicktripService.createBooking(userId, packageId,booking);
    }

    


    
}

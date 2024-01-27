package com.love2code.springboot.quicktrip.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love2code.springboot.quicktrip.entity.Users;
import com.love2code.springboot.quicktrip.service.QuicktripService;

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
    
    @GetMapping("/users")
    public List<Users> getUser()
    {
        return quicktripService.findUser();
    }

   
}

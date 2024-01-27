package com.love2code.springboot.quicktrip.service;

import java.util.List;

import com.love2code.springboot.quicktrip.entity.Packagee;
import com.love2code.springboot.quicktrip.entity.Users;

public interface QuicktripService {

    // for user
	public void saveUser(Users theUser);
	
	public List<Users> findUser();
	
	public Users findByIdUser(int theId);
	
	public void DeleteByIdUser(int theId);

    //for package

    public void savePackage(Package thePackage);
	
	public List<Packagee> findPAckage();
	
	public Users findByIdPackage(int theId);
	
	public void DeleteByIdPackage(int theId);
	
} 

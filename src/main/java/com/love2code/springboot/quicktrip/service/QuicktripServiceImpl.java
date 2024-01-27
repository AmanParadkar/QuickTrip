package com.love2code.springboot.quicktrip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.love2code.springboot.quicktrip.dao.UserRepository;
import com.love2code.springboot.quicktrip.entity.Packagee;
import com.love2code.springboot.quicktrip.entity.Users;

@Service
public class QuicktripServiceImpl implements QuicktripService{

    private UserRepository userRepository;

    @Autowired
    public QuicktripServiceImpl(UserRepository theuserRepository) {
        userRepository = theuserRepository;
    }

    @Override
    public void saveUser(Users theUser) {
        
        userRepository.save(theUser);
        //throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
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
        throw new UnsupportedOperationException("Unimplemented method 'DeleteByIdUser'");
    }

    // for package
    @Override
    public void savePackage(Package thePackage) {
       
        throw new UnsupportedOperationException("Unimplemented method 'savePackage'");
    }

    @Override
    public List<Packagee> findPAckage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPAckage'");
    }

    @Override
    public Users findByIdPackage(int theId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdPackage'");
    }

    @Override
    public void DeleteByIdPackage(int theId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DeleteByIdPackage'");
    } 
    

}

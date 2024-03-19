package com.love2code.springboot.quicktrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.love2code.springboot.quicktrip.entity.User_Address;

public interface UserAddressRepository extends JpaRepository<User_Address, Integer> {
    
}

    

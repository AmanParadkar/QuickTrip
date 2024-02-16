package com.love2code.springboot.quicktrip.dao;

import org.springframework.data.repository.CrudRepository;

import com.love2code.springboot.quicktrip.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking,Integer> {

    
}

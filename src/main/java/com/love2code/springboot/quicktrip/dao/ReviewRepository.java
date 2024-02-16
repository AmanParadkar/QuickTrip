package com.love2code.springboot.quicktrip.dao;
import org.springframework.data.repository.CrudRepository;

import com.love2code.springboot.quicktrip.entity.Review;

public interface ReviewRepository extends CrudRepository<Review,Integer> {

    
    
}

package com.love2code.springboot.quicktrip.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.love2code.springboot.quicktrip.entity.Packagee;


public interface PackageRepository extends CrudRepository <Packagee,Integer>{
    
    public List<Packagee> findAll();
 
   
}

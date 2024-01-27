package com.love2code.springboot.quicktrip.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.love2code.springboot.quicktrip.entity.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

    public List<Users> findAll();
    public Users findByPhoneNo(String phoneNo);
    public Users findByPassword(String pass);

} 

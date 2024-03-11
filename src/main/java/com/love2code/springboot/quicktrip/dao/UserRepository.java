package com.love2code.springboot.quicktrip.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.love2code.springboot.quicktrip.entity.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

    @SuppressWarnings("null")
    public List<Users> findAll();

} 

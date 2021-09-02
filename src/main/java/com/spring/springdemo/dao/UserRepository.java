package com.spring.springdemo.dao;

import com.spring.springdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface UserRepository extends JpaRepository<Long,User> {

    @Query("select u from User u where u.email=:email")
    public User getUserByUserName(@Param("email") String email);

}

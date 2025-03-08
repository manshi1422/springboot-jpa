package com.springboot.JPA.repositories;

import com.springboot.JPA.entities.user;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userInterface extends CrudRepository<user,Long> {
    public List<user> findByName (String name);

    @Query("Select u from user u")
    public List<user> getAllUser();

    @Query(value="Select * from usertest u WHERE u.name=:name" , nativeQuery = true)
    public List<user> getAllUserByName(@Param("name") String name);
}

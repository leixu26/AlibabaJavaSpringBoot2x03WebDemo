package com.frankxulei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.frankxulei.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
 
   public List<User> getUserByName(String name);
 
   public User getUserByNameAndPassword(String name,String password);
 
   public User getUserById(int id);
}

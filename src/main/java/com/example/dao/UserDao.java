package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>,JpaSpecificationExecutor<User>{

	
	@Transactional(timeout = 10)
	@Query("select u from User u where u.id = ?1")
    User findById(Integer id);
}

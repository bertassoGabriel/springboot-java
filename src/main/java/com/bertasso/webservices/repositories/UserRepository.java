package com.bertasso.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bertasso.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

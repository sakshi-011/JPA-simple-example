package com.rest.webservices.jpaexample.service;

import com.rest.webservices.jpaexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

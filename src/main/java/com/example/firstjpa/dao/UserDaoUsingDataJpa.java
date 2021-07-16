package com.example.firstjpa.dao;

import com.example.firstjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDaoUsingDataJpa extends JpaRepository<User, Integer> {
}

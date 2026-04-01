package com.cg.securityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.securityApp.entities.Myusers;

public interface MyUsersRepo extends JpaRepository<Myusers, String> {

}

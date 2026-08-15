package com.janGr.myAwesomeApp.repository;


import com.janGr.myAwesomeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

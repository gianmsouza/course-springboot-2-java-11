package com.giansouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giansouza.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.educational.starter.repositories;

import com.educational.starter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//no need to tag as it extends from JPARepository meaning it is already a @Repository
public interface UserRepository extends JpaRepository<User, Long> {}

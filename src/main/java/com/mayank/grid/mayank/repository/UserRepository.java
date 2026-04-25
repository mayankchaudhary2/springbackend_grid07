package com.mayank.grid.mayank.repository;

import com.mayank.grid.mayank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

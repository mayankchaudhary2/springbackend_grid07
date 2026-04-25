package com.mayank.grid.mayank.repository;

import com.mayank.grid.mayank.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}

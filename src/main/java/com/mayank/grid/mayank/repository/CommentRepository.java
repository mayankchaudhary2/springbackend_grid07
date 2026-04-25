package com.mayank.grid.mayank.repository;

import com.mayank.grid.mayank.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}

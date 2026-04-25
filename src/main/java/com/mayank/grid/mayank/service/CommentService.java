package com.mayank.grid.mayank.service;

import com.mayank.grid.mayank.entity.Comment;
import com.mayank.grid.mayank.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    public Comment addComment(Comment comment){
        comment.setCreatedAt(LocalDateTime.now());
        return commentRepository.save(comment);

    }
}

package com.mayank.grid.mayank.service;

import com.mayank.grid.mayank.entity.Post;
import com.mayank.grid.mayank.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post){
        post.setCreatedAt(LocalDateTime.now());
        // saving in db
        return postRepository.save(post);
    }
}

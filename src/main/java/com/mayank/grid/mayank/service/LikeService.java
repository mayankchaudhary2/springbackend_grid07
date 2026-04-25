package com.mayank.grid.mayank.service;

import org.springframework.stereotype.Service;

@Service
public class LikeService {
    public String likePost(Long postId){
        return "Post liked: "+ postId;
    }
}
